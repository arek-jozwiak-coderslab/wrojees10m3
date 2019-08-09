package pl.coderslab.workshop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dwarf/edit")
public class DwarfEditServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        DwarfDao dwarfDao = new DwarfDao();
        Dwarf read = dwarfDao.read(Integer.parseInt(id));
        request.setAttribute("dwarf", read);
        getServletContext().getRequestDispatcher("/dwarfs/edit.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        Dwarf dwarf = new Dwarf();
        dwarf.setName(name);
        dwarf.setId(Integer.parseInt(id));
        DwarfDao dwarfDao = new DwarfDao();
        dwarfDao.update(dwarf);
        resp.sendRedirect(req.getContextPath() + "/dwarf/list");

    }
}
