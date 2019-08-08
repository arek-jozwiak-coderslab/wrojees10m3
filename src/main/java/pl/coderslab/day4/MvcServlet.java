package pl.coderslab.day4;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc")
public class MvcServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //do sth

        String foo = request.getParameter("foo");
String changed = StringUtils.reverse(foo).toUpperCase();
        request.setAttribute("changedFoo", changed);

        List<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book(1l, "Thinking in Java"));
        myBooks.add(new Book(2l, "Java 2 podstawy"));

        request.setAttribute("books", myBooks);

        getServletContext().getRequestDispatcher("/mvc.jsp")
                .forward(request, response);
    }
}
