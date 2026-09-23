package br.edu.ifba.sistema_restaurante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Motoboy[] moto = new Motoboy[4];
        
        try{           
            moto[0] = new Motoboy("MT12", "Fracis", "56732145820");
            moto[1] = new Motoboy("MT1", "Lucifer", "56732145829");
            moto[2] = new Motoboy("MT15", "Belzebur", "56732145829");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Cliente[] cliente = new Cliente[4];
        
        try{
            
            cliente[0] = new Cliente("C1", "Cleber", "32942234345");
            cliente[1] = new Cliente("C2", "Roberto", "24872343432");
            cliente[2] = new Cliente("C3", "Thiago", "67032974434");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
