package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    List<Adress> listOfAdresses = new ArrayList<>();

    public Hobby(String name, int frequency, List<Adress> listOfAdresses) {
        this.name = name;
        this.frequency = frequency;
        this.listOfAdresses = listOfAdresses;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", listOfAdresses=" + listOfAdresses +
                '}';
    }
}
