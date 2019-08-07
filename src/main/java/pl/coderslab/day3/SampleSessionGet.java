package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sampleSessionGet")
public class SampleSessionGet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Integer one = (Integer) session.getAttribute("one");
        String someName = (String) session.getAttribute("someName");
        List<String> someList = (List<String>) session.getAttribute("someList");

        session.removeAttribute("one");
        session.invalidate();
    }
}
