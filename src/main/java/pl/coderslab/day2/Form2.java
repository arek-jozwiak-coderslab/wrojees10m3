package pl.coderslab.day2;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String confirm = request.getParameter("confirm");
        String message = request.getParameter("message");

//        response.getWriter().append(confirm);
//        response.getWriter().append(message);
        List<String> list = Arrays.asList("dupa", "dupaa");
        //ich checkbox not checked
        String censored = "";
        if (confirm == null) {
            //if  checkbox checked
            String[] words = message.split(" ");
            for (String word : words) {
                if (list.contains(word)) {
                    //cenzura
                    censored +=" "+ StringUtils.repeat( "*", word.length());
                } else {
                    censored += " " + word;
                }
            }
            response.getWriter().append(censored);
        } else {
            response.getWriter().append(message);
        }

    }


}
