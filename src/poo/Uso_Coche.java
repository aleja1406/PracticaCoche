package poo;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Uso_Coche {

    public static void main(String[] args) {

        Coche Renault=new Coche(); // instanciar una clase Coche es la clase y cuando se escribe
                                    // el new Coche se está usando el metodo constructor Coche


       Renault.setColor(JOptionPane.showInputDialog("introduce color"));
        System.out.println(Renault.getTodoComun());

        System.out.println(Renault.getColor());

        Renault.setAsientos_cuero(JOptionPane.showInputDialog("¿tiene asientos de cuero?"));

        System.out.println(Renault.getAsientos_cuero());

        Renault.setClimatizador(JOptionPane.showInputDialog("tiene climatizador?"));

        System.out.println(Renault.getClimatizador());

        System.out.println(Renault.dime_peso_coche());

        System.out.println("el precio del auto es: "+Renault.precio_coche());

    }
}
