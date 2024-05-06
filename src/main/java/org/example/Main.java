package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona programador = new Persona("Duvan", 28, LocalDate.of(1996,02,10));
        programador.setAge(2);
        System.out.printf(programador.toString()+ "\n");

        Estudiante univerisario = new Estudiante("Primer semestre", "Cristian Mendoza", 22, LocalDate.of(2002,02,10));
        System.out.printf(univerisario.toString());
    }
}


