package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Hobby> listOfHobby = new ArrayList<>();

    public Student(String name, int age, List<Hobby> listOfHobby) {
        super(name, age);
        this.listOfHobby = listOfHobby;
    }

    public List<Hobby> getListOfHobby() {
        return listOfHobby;
    }
}
