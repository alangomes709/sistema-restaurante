package br.edu.ifba.sistema_restaurante;

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
