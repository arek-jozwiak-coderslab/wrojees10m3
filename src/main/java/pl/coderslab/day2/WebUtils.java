package pl.coderslab.day2;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

public class WebUtils {

    public static void debugParams(HttpServletRequest request) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        Set<String> strings = parameterMap.keySet();
        for (String string : strings) {
            System.out.println(" key  = :" + string);
            System.out.println(" values  = :");
            for (String s : parameterMap.get(string)) {
                System.out.println(s + " ");
            }
        }
    }
}
