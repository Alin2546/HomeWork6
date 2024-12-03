package org.example;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    static Comparator<Person> compareByName = Comparator.comparing(Person :: getName);
    //    static Comparator<Person> compareByAge = Comparator.comparing(Person :: getAge);

    static Comparator<Person> compareByNameThenByAge = (o1, o2) -> {
        if (!(o1.getName().equals(o2.getName()))) {
            return o1.getName().compareTo(o2.getName());
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    };


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return isEqual(getAge(), person.getAge()) && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    boolean isEqual(int x, int y) {
        return x == y;
    }


}
