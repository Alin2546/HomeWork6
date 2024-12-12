package org.example;

import java.util.*;

public class App {
    /**
     * The entry point of the program
     *
     * @param args which are not used here
     */
    public static void main(String[] args) {
        Person pers = new Person("Bogdan", 31);
        Person student = new Student("Alin", 24);

        // Creating a TreeSet with a custom comparator which compares values based on name then by age
        Set<Person> set = new TreeSet<>(Person.compareByNameThenByAge);

        // Added the person instance in the TreeSet
        set.add(pers);


        // Created adresses
        List<Address> addressesForCycling = new ArrayList<>();
        addressesForCycling.add(new Address("Romania", "Iasi", "Bisericii", 6));
        addressesForCycling.add(new Address("United Kingdom", "Yorkshire", "Fishergate", 12));

        List<Address> addressesForRunning = new ArrayList<>();
        addressesForRunning.add(new Address("Albania", "albe", "Kronze", 2));
        addressesForRunning.add(new Address("Italy", "Roma", "St.pope", 24));
        addressesForRunning.add(new Address("Lithuania", "Elger", "makarel", 1));


        List<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(new Hobby("Cycling", 20, addressesForCycling));
        hobbyList.add(new Hobby("Running", 3, addressesForRunning));

        Map<Person, List<Hobby>> map = new HashMap<>();
        map.put(student, hobbyList);
        System.out.println(student.getName());
        System.out.println("name of the hobby: " + map.get(student).get(0).getName());
        System.out.println("Country where it can practiced: " + map.get(student).get(0).listOfAddresses.get(0).getCountry());
        System.out.println("Second Country where it can practiced: " + map.get(student).get(0).listOfAddresses.get(1).getCountry());
        System.out.println();
        System.out.println("name of the hobby: " + map.get(student).get(1).getName());
        System.out.println("Country where it can practiced: " + map.get(student).get(1).listOfAddresses.get(0).getCountry());
        System.out.println("Second Country where it can practiced: " + map.get(student).get(1).listOfAddresses.get(1).getCountry());
        System.out.println("Third Country where it can practiced: " + map.get(student).get(1).listOfAddresses.get(2).getCountry());


    }
}
