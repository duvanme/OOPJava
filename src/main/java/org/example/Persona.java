package org.example;

import java.time.LocalDate;

public class Persona {

    private String Name;
    private int Age;
    private LocalDate Date;

    public Persona(String name, int age, LocalDate date) {
        Name = name;
        Age = age;
        Date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}

