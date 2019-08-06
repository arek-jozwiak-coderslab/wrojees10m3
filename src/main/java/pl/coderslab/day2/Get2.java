package pl.coderslab.day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

@WebServlet("/get2")
public class Get2 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String, String[]> parameterMap = request.getParameterMap();
//        Set<String> strings = parameterMap.keySet();
//        PrintWriter writer = response.getWriter();
//        for (String string : strings) {
//
//            writer.append("\n key  = :" + string);
//            writer.append("\n values  = :");
//            for (String s : parameterMap.get(string)) {
//                writer.append(s + " ");
//            }
//        }
        WebUtils.debugParams(request);
    }
}
