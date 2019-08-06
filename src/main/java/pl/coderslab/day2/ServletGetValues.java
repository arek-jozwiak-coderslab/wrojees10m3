package pl.coderslab.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/concat")
public class ServletGetValues extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] names = request.getParameterValues("glue");

//        http://localhost:8080/concat?glue=abra&glue=kada&glue=bra
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : names) {
            stringBuilder.append(name);
        }
        response.getWriter().append(stringBuilder.toString());
        String glue = request.getParameter("glue");
        response.getWriter().append(" param =  " + glue );

    }
}
