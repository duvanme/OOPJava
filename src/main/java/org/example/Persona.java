package org.example;

import java.time.LocalDate;

public class Persona {

    private String Name;
    private int Age;
    private LocalDate Dateofbirth;

    public Persona(String name, int age, LocalDate dateofbirth) {
        Name = name;
        Age = age;
        Dateofbirth = dateofbirth;
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

    public void setAge(int age) throws IllegalArgumentException{
        if (age <= 0 || age >= 110){
            throw new IllegalArgumentException("La edad debe ser mayor a cero y menor que 110");
        }
        Age = age;
    }

    public LocalDate getDate() {

        return Dateofbirth;
    }

    public void setDate(LocalDate dateofbirth) throws IllegalArgumentException{
        if (dateofbirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento debe ser anterior al día de hoy.");
        }
        Dateofbirth = dateofbirth;
    }

    public LocalDate calcularFechaNacimiento(){
        int anio = 2024-this.Age;
        LocalDate fecha = LocalDate.now();
        int mes = fecha.getMonthValue();
        int dia = fecha.getDayOfMonth();
        LocalDate fechaDeNacimientoEstimada = LocalDate.of(anio,mes,dia);
        return fechaDeNacimientoEstimada;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Dateofbirth=" + Dateofbirth +
                '}';
    }
}


