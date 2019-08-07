package pl.coderslab.day3;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class WebUtils {


    public static String getCookieValue(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals(cookieName)) {
                return cookie.getValue();
            }
        }
        return null;
    }
}
