package pl.coderslab.day1.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    private static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        int counter = 0;
        Set<String> strings = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.next();
            if (s.equals(EXIT_COMMAND)) {
                break;
            }
            strings.add(s);
            counter++;

        }
        System.out.printf("Podanych napisów: %d," +
                " Rozmiar kolekcji: %d", counter, strings.size());
    }

    String pat2 = "^\\d{2}-\\d{3}$";
}
