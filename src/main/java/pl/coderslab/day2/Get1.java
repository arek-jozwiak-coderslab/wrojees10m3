package pl.coderslab.day2;

import org.apache.commons.lang3.math.NumberUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get1")
public class Get1 extends HttpServlet {

    private boolean checkIsNumeric(String start, String end) {
        return NumberUtils.isDigits(start) &&
                NumberUtils.isDigits(end) && start != null && end != null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (checkIsNumeric(request.getParameter("start"), request.getParameter("end"))) {
            Integer start = Integer.parseInt(request.getParameter("start"));
            Integer end = Integer.parseInt(request.getParameter("end"));
            PrintWriter writer = response.getWriter();
            for (int i = start; i < end; i++) {
                writer.append(i + " ");
            }
        } else
            response.getWriter().append("BRAK LUB NIEPRAWIDŁOWE");
    }

}
