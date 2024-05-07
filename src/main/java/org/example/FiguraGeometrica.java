package org.example;

public class FiguraGeometrica implements IFiguraGeometrica{
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String Area(){
        return "Retorno el área de la figura";
    };
    @Override
    public String Perimetro(){
        return "Retorno el perímetro de la figura";
    };
}
