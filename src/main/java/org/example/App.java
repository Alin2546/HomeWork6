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

        for (Person person : set) {
            System.out.println(person.getName() + " " + person.getAge());
        }
        List<Adress> adressesForCycling = new ArrayList<>();
        adressesForCycling.add(new Adress("Romania", "Iasi", "Bisericii", 6));
        List<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(new Hobby("Cycling", 20, adressesForCycling));

        Map<Person, List<Hobby>> map = new HashMap<>();
        map.put(student, hobbyList);
        System.out.println(map);


    }
}
