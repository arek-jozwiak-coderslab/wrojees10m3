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

@WebServlet("/sampleSession")
public class SampleSession extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("one", 1);
        session.setAttribute("someName", "Arek");
        List<String> objects = new ArrayList<>();
        objects.add("aaaa");
        objects.add("bbbn");

        session.setAttribute("someList", objects);

    }
}
