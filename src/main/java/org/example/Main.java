package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Gerente

        Gerente gerente = new Gerente(1,"Duvan Mendoza", 28, 2500000,800000);
        System.out.println(gerente.calcularSalario());

        Vendedor vendedor = new Vendedor(1,"Duvan Mendoza", 28, 1500000,300000);
        System.out.println(vendedor.calcularSalario());

        General general = new General(1,"Duvan Mendoza", 28, 1200000,150000);
        System.out.println(general.calcularSalario());

    }
}

