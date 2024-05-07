package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(2.5,"Gran circulo", "Azul");
        System.out.println(miCirculo.Area());
        System.out.println(miCirculo.Perimetro());

        Cuadrado miCuadrado = new Cuadrado(2.5,"Gran Cuadrado", "Azul");
        System.out.println(miCuadrado.Area());
        System.out.println(miCuadrado.Perimetro());
    }
}

