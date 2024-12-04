package org.example;

import java.util.List;

public class Adress{
    private String country;
    private String county;
    private String street;
    private int streetNumber;


    public Adress(String country, String county, String street, int streetNumber) {
        this.country = country;
        this.county = county;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
