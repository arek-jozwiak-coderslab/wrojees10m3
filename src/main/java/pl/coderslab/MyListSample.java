package pl.coderslab;

import java.util.*;

public class MyListSample {

    public static void main(String[] args) {
        List<Integer> some = new ArrayList<>();
        some.add(12);
        some.add(14);
        some.add(11);
        some.add(1);

        Integer integer = some.get(0);

        for (Integer integer1 : some) {
            System.out.println(integer1);
        }

        for (int i = 0; i < some.size(); i++) {
            System.out.println(some.get(i));
        }

        Iterator<Integer> iterator = some.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }


        List<String> strings = new ArrayList<>();
        List<Integer> integersList = new ArrayList<>();

        strings.add("first");
        strings.add("second");
        strings.add("second");

        System.out.println("list size: " + strings.size());

        Set<Integer> integers = new HashSet<>();
        integers.add(12);
        integers.add(12);
        integers.add(13);

        System.out.println("set size: " + integers.size());
    }
}
