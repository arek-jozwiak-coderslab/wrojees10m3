package pl.coderslab.workshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DwarfDao {
    // ZAPYTANIA SQL
    private static final String CREATE_BOOK_QUERY = "INSERT INTO dwarf(name) VALUES (?)";
    private static final String DELETE_BOOK_QUERY = "DELETE FROM dwarf where id = ?";
    private static final String FIND_ALL_BOOKS_QUERY = "SELECT * FROM dwarf";
    private static final String READ_BOOK_QUERY = "Select * from dwarf where id = ?";
    private static final String UPDATE_BOOK_QUERY = "UPDATE	dwarf SET name = ?  WHERE	id = ?";


    // POBIERANIE bookA PO ID
    public Dwarf read(Integer bookId) {
        Dwarf book = new Dwarf();
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(READ_BOOK_QUERY);

        ) {
            statement.setInt(1, bookId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    book.setId(resultSet.getInt("id"));
                    book.setName(resultSet.getString("name"));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cos sie nie powiodło");
        }
        return book;

    }

    // LISTA WSZYSTKICH KSIAZEK
    public List<Dwarf> findAll() {
        List<Dwarf> bookList = new ArrayList<>();
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(FIND_ALL_BOOKS_QUERY);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Dwarf bookToAdd = new Dwarf();
                bookToAdd.setId(resultSet.getInt("id"));
                bookToAdd.setName(resultSet.getString("name"));

                bookList.add(bookToAdd);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Cos sie nie powiodło");
        }
        return bookList;

    }

    /**
     * Create book
     *
     * @param book
     * @return
     */
    public Dwarf create(Dwarf book) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement insertStm = connection.prepareStatement(CREATE_BOOK_QUERY,
                     PreparedStatement.RETURN_GENERATED_KEYS)) {
            insertStm.setString(1, book.getName());

            int result = insertStm.executeUpdate();

            if (result != 1) {
                throw new RuntimeException("Execute update returned " + result);
            }

            try (ResultSet generatedKeys = insertStm.getGeneratedKeys()) {
                if (generatedKeys.first()) {
                    book.setId(generatedKeys.getInt(1));
                    return book;
                } else {
                    throw new RuntimeException("Generated key was not found");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cos sie nie powiodło");
        }
        return null;
    }

    // USUWANIE PO ID
    public void delete(Integer bookId) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_BOOK_QUERY);) {
            statement.setInt(1, bookId);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cos sie nie powiodło");
        }
    }


    // UPDATE
    public void update(Dwarf book) {
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_BOOK_QUERY);) {
            statement.setInt(2, book.getId());
            statement.setString(1, book.getName());


            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cos sie nie powiodło");
        }

    }

}