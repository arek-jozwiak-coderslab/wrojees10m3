package pl.coderslab.day1.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) {
System.out.println(verifyEmail("aa@nn.pl"));
System.out.println(verifyEmail("aann.pl"));
}


    static boolean verifyEmailLong(String email){
        String emailRegex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    static boolean verifyEmail(String email){

        return Pattern.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}"
                , email);
    }
}
