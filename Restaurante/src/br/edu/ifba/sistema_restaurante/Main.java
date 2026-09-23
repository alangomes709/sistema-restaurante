/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.sistema_restaurante;

/**
 *
 * @author alan
 */
public class Main {
    public static void main(String[] args) {
        Motoboy m = new Motoboy("e34");
        try{
            m.setNome("AHA");
            m.setCpf("111111121111");            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(m.getCpf());
        System.out.println(m.getNome());
        System.out.println(m.getIdMotoboy());
        
    }
    
}
