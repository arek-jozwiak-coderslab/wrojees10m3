package pl.coderslab.web;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc")
public class MvcServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //do sth
        String foo = request.getParameter("foo");
String changed = StringUtils.reverse(foo).toUpperCase();
        request.setAttribute("changedFoo", changed);
        getServletContext().getRequestDispatcher("/mvc.jsp")
                .forward(request, response);
    }
}
