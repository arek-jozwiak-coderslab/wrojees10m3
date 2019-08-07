package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().append("<form  method='POST'>" +
                "    <label>" +
                "        Klucz:" +
                "        <input type='text' name='grade'>" +
                "    </label>" +
                "    <input type='submit'>" +
                "</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer grade = Integer.parseInt(request.getParameter("grade"));
        List<Integer> grades;
        HttpSession session = request.getSession();
        if (session.getAttribute("grades") == null) {
            grades = new ArrayList<>();
        } else {
            grades = (List<Integer>) session.getAttribute("grades");
        }
        grades.add(grade);
        session.setAttribute("grades", grades);
        response.getWriter().append(grades.toString());
        if(grades.size()>0){
            response.getWriter().append("avg = :" + countAvg(grades));
        }

    }

    private double countAvg(List<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

}
