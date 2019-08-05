package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        List<City> initialize = initialize();
        List<City> reverse = reverse(initialize);
        System.out.println(reverse);
    }

    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();
        cities.add(new City(1_000_000, "Warszawa"));
        cities.add(new City(600_000, "Wrocław"));
        cities.add(new City(120_000, "Płock"));
        cities.add(new City(582_000, "Gdańsk"));
        cities.add(new City(204_000, "Sosnowiec"));
        return cities;
    }

    public static List<City> simpleReverse(List<City> list) {
        Collections.reverse(list);
        return list;
    }
    public static List<City> reverse(List<City> list) {
        ListIterator<City> cityListIterator = list.listIterator(list.size());
        List<City> cities = new ArrayList<>();
        while (cityListIterator.hasPrevious()){
            cities.add(cityListIterator.previous());
        }
        return cities;
    }
}
