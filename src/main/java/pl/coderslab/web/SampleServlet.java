package pl.coderslab.web;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/sample")
public class SampleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String dupa = request.getParameter("dupa");
        response.getWriter().append("<h1>HELLO WORLD</h1>");
        response.getWriter().append(firstName);
        response.getWriter().append(" to ");
        response.getWriter().append(StringUtils.reverse(dupa));

    }
}
