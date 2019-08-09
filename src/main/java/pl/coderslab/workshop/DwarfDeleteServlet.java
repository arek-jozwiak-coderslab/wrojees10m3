package pl.coderslab.workshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dwarf/delete")
public class DwarfDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DwarfDao dwarfDao = new DwarfDao();
        String id = request.getParameter("id");
        dwarfDao.delete(Integer.parseInt(id));
        response.sendRedirect(request.getContextPath() + "/dwarf/list");
    }
}
