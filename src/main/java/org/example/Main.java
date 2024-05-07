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
        System.out.println("\n\n");
        //Empleado

        Persona Empleado = new Persona
                ("Duvan Mendoza",
                        22,
                        LocalDate.of(1996,02,10)
                ){
                public void realizarTarea() {
                System.out.println("Realizando tarea laboral");
        };
    };

        Empleado.realizarTarea();
}
}


