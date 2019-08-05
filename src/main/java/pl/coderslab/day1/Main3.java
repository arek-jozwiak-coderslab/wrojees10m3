package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();
        cities.add(new City(1_000_000, "Warszawa"));
        cities.add(new City(600_000, "Wrocław"));
        cities.add(new City(120_000, "Płock"));
        cities.add(new City(582_000, "Gdańsk"));
        cities.add(new City(204_000, "Sosnowiec"));
        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end ){
        List<City> cities = new ArrayList<>();
        for (int i = start; i <end ; i++) {
            cities.add(cities.get(i));
        }
        return cities;
    }

    public static List<City> secondSubList(List<City> list, int start, int end ){
        return list.subList(start, end);
    }
}
