package pl.coderslab.day1.map;

import pl.coderslab.day1.City;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {
        Map<Integer, String> integerListMap = new HashMap<>();
        integerListMap.put(51, "arek");
        integerListMap.put(123, "darek");
        integerListMap.put(51, "marek");
        integerListMap.put(1424, "darek");

        Set<Integer> integers = integerListMap.keySet();

        for (Integer integer : integers) {
            System.out.println(integerListMap.get(integer));
        }
    }
}
