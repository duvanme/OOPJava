package org.example;

public class Empleado {
    private Integer id;
    private String name;
    private int edad;
    private double salario;

    public Empleado(Integer id, String name, int edad, double salario) {
        this.id = id;
        this.name = name;
        this.edad = edad;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public String calcularSalario(){
        return "yo calculo un salario";
    }
}
