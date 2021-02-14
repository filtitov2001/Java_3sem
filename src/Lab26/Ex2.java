package Lab26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class City {

    private String name;
    private String country;

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}

public class Ex2 {
    public static void work()
    {
        Map<String, ArrayList<String>> citiesMap = new HashMap<>();
        List<City> cities = List.of(
                new City("Prague", "Czech"),
                new City("Washington", "USA"),
                new City("Berlin", "Germany"),
                new City("Rome", "Italy"),
                new City("Warsaw", "Poland"),
                new City("Kiev", "Ukraine")
        );

        for (City city : cities) {
            if (!citiesMap.containsKey(city.getCountry())) {
                citiesMap.put(city.getCountry(), new ArrayList<>());
            }
            citiesMap.get(city.getCountry()).add(city.getName());
        }

        citiesMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}