package org.example;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private String Grado;

    public Estudiante(String grado, String name, int age, LocalDate dateofbirth){
        super(name, age, dateofbirth);

        Grado = grado;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "Name='" + getName() + '\'' +
                ", Age=" + getAge() + '\'' +
                ", Dateofbirth=" + getDate() +
                ", Grado=" + Grado +
                '}';
    }
}
