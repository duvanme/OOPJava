package org.example;

public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(double lado, String name, String color){
        super(name, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
