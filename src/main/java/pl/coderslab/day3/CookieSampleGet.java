package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieSampleRead")
public class CookieSampleGet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieValue = null;
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("user")) {
                cookieValue = cookie.getValue();
            }
        }

        response.getWriter().append("cookie sample read" + cookieValue);
    }
}
