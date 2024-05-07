package org.example;

public class General extends Empleado{
    private double bono;

    public General(Integer id, String name, int edad, double salario,double bono)

    {
        super(id, name, edad, salario);
        this.bono = bono;

    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String calcularSalario(){
        return "El Salario del ayudante general es " + (this.bono+getSalario());
    }
}
