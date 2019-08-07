package pl.coderslab.day3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        boolean find = false;
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("User")){
               cookie.setMaxAge(-1);
               response.addCookie(cookie);
               find = true;
            }
        }
        if(!find){
            response.getWriter().append("BRAK");
        }
    }
}
