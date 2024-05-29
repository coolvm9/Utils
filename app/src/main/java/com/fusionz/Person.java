package com.fusionz;

import com.opencsv.bean.CsvBindByName;

public class Person {

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "City")
    private String city;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", city=" + city + "]";
    }
}