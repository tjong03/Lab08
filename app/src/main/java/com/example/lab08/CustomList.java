package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public int getCount(){
        return cities.size();
    }

    /**
     * this adds a city object to the list
     * the second phase, you can add the city
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    // check Git

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
