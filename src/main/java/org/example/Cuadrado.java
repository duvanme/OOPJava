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

    @Override
    public String Area(){
        return "El área del cuadrado es " + this.lado*this.lado;
    };

    @Override
    public String Perimetro(){
        return "El perímetro del cuadrado es " + 4*this.lado;
    };
}
