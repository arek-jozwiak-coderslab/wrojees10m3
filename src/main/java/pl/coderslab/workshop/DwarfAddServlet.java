package pl.coderslab.workshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dwarf/add")
public class DwarfAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/dwarfs/add.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Dwarf dwarf = new Dwarf();
        dwarf.setName(name);
        DwarfDao dwarfDao = new DwarfDao();
        dwarfDao.create(dwarf);
        resp.sendRedirect(req.getContextPath() + "/dwarf/list");

    }
}
