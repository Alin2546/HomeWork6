package org.example;

import java.util.List;

/**
 * The {@code Address} class represents an actual address where a hobby can be practiced
 */
public class Address {
    private String country;
    private String county;
    private String street;
    private int streetNumber;

    /**
     * Constructor
     *
     * @param country      an actual country, ex.Romania, Spain, Italy
     * @param county       an actual county
     * @param street       an actual street
     * @param streetNumber an actual street number
     */
    public Address(String country, String county, String street, int streetNumber) {
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
        return "Address{" +
                "country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
