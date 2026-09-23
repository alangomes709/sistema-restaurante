package br.edu.ifba.sistema_restaurante;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Motoboy[] moto = new Motoboy[4];
            moto[0] = new Motoboy("MT12", "Fracis", "5673214582");
            moto[1] = new Motoboy("MT1", "Lucifer", "5673214582");
            moto[2] = new Motoboy("MT15", "Belzebur", "5673214582");
        
        try{           
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        
    }
    
}