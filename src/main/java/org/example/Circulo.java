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

    @Override
    public String Area(){
        return "El área del círculo es " + this.radio*this.radio*3.14;
    };

    @Override
    public String Perimetro(){
        return "La circunferencia del círculo es " + 2*this.radio*3.14;
    };
}
