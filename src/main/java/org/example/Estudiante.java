package org.example;

import java.time.LocalDate;

public class Estudiante extends Persona implements Trabajador{
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

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea escolar");
    }
}
