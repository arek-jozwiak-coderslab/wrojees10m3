package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main2 {

    static List<Integer> sampleList = new ArrayList<>();


    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            sampleList.add(i);
        }

        removeDivider(sampleList, 2);
        System.out.println(sampleList);
    }

    public static void removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % divider == 0) {
                iterator.remove();
            }
        }
    }
}
