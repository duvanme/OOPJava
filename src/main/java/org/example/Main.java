package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Estudiante univerisario =
                new Estudiante(
                "Primer semestre",
                "Cristian Mendoza",
                22, LocalDate.of(2002,02,10)
        );
        univerisario.realizarTarea();

    }
}


