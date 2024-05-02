package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona programador = new Persona("Duvan", 28, LocalDate.of(1996,02,10));
        programador.setAge(2);
        System.out.println("La fecha de nacimiento estimada es "+programador.calcularFechaNacimiento());
    }
}


