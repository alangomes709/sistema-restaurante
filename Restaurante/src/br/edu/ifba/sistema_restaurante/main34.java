package br.edu.ifba.sistema_restaurante;

import java.util.ArrayList;

public class main34 {
    public static void main(String[] args) {
        Motoboy[] moto = new Motoboy[4];
        Cliente[] clie = new Cliente[4];
        clie[0]= new Cliente("C1", "Florisvaldo", "12345678911");
        
        Endereco ed = new Endereco("Rua", "HAMBUR", "AAA", "NOA", 45);
        clie[0].adicionarEndereco(ed);
        
        
        try{           
            moto[0] = new Motoboy("MT12", "Fracis", "5673214582");
            moto[1] = new Motoboy("MT1", "Lucifer", "5673214582");
            moto[2] = new Motoboy("MT15", "Belzebur", "5673214582");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        for( Motoboy m : moto){
            System.out.println(m.getIdMotoboy());
        }
        
        

        
    }
    
}
