package org.example;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio, String name, String color){
        super(name, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
