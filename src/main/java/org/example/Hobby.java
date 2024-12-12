package org.example;

import java.util.List;

/**
 * The {@code Hobby} class represents a hobby with its name, frequency, and a list of associated addresses.
 */
public class Hobby {
    private String name;
    private int frequency;
    List<Address> listOfAddresses;

    /**
     * Constructor
     *
     * @param name           the name of the hobby
     * @param frequency      the frequency of the hobby
     * @param listOfAddresses the list of addresses associated with the hobby
     */
    public Hobby(String name, int frequency, List<Address> listOfAddresses) {
        this.name = name;
        this.frequency = frequency;
        this.listOfAddresses = listOfAddresses;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", listOfAdresses=" + listOfAddresses +
                '}';
    }
}
