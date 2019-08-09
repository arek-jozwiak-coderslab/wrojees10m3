package pl.coderslab.workshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dwarf/list")
public class DwarfListServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DwarfDao dwarfDao = new DwarfDao();
        request.setAttribute("dwarfs", dwarfDao.findAll());
        getServletContext().getRequestDispatcher("/dwarfs/list.jsp")
                .forward(request, response);
    }
}
