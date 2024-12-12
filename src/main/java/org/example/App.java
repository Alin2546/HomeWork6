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
        List<Adress> adressesForCycling = new ArrayList<>();
        adressesForCycling.add(new Adress("Romania", "Iasi", "Bisericii", 6));
        adressesForCycling.add(new Adress("United Kingdom", "Yorkshire", "Fishergate", 12));

        List<Adress> adressesForRunning = new ArrayList<>();
        adressesForRunning.add(new Adress("Albania", "albe", "Kronze", 2));
        adressesForRunning.add(new Adress("Italy", "Roma", "St.pope", 24));
        adressesForRunning.add(new Adress("Lithuania", "Elger", "makarel", 1));


        List<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(new Hobby("Cycling", 20, adressesForCycling));
        hobbyList.add(new Hobby("Running", 3, adressesForRunning));

        Map<Person, List<Hobby>> map = new HashMap<>();
        map.put(student, hobbyList);
        System.out.println("name of the hobby: " + map.get(student).get(0).getName());
        System.out.println("Country where it can practiced: " + map.get(student).get(0).listOfAdresses.get(0).getCountry());
        System.out.println("Second Country where it can practiced: " + map.get(student).get(0).listOfAdresses.get(1).getCountry());
        System.out.println();
        System.out.println("name of the hobby: " + map.get(student).get(1).getName());
        System.out.println("Country where it can practiced: " + map.get(student).get(1).listOfAdresses.get(0).getCountry());
        System.out.println("Second Country where it can practiced: " + map.get(student).get(1).listOfAdresses.get(1).getCountry());
        System.out.println("Third Country where it can practiced: " + map.get(student).get(1).listOfAdresses.get(2).getCountry());


    }
}
