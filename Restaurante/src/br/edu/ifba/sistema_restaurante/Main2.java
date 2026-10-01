/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.sistema_restaurante;

/**
 *
 * @author curso
 */
public class Main2 {
    public static void main(String[] args) {
        //'SEPARAMENTO' POR ENTIDADE
        System.out.println("---------------------------");
        System.out.println("'SEPARAMENTO' POR ENTIDADE");
        System.out.println("---------------------------");        
        System.out.print("\n\n");
        //CLIENTE
        System.out.println("==============================CLIENTE");
        
        Cliente c = new Cliente("C3", "Thiago", "93466544531");
        
        Endereco end = new Endereco("E3", "R. Thiago Mendes", "76519000", "lagoa nova", 89);
        Endereco end2 = new Endereco("E4", "R. Neiva Pinto", "76519000", "lagoa funda", 54);
        
        Contato cont = new Contato("74998653211", "rob12@gmail.com");
        Contato cont2 = new Contato("74998653211", "hamburguer@gmail.com");
        
        c.adicionarEndereco(end);
        c.adicionarEndereco(end2);  
        c.adicionarContato(cont);
        c.adicionarContato(cont2);
        //INDIVIDUAL
        System.out.println(c.toString());
                
//        for(Contato e: c.getCont()){
//            System.out.println(c.getCont());            
//        }
//        
//        for(Endereco e: c.getEnd()){
//            System.out.println(c.getEnd());
//        }
        
        //PAGAMENTO
        System.out.println("==============================PAGAMENTO");
        MetodoPagamento metPag = new MetodoPagamento("M1", "Débito", 0.3); //ele poderia pegar direto pelo m1,2,3,4 o restante dos dados
        Pagamento pag = new Pagamento("PG01", 0.1, metPag);
//        System.out.println(pag.toString());;
                
        
        //GARCOM
        System.out.println("==============================GARCOM");
        Garcom garc = new Garcom("G1","Geraldo Junior", "12345678901");
//        System.out.println(garc.toString());
        
        
        //COMANDA ultimo
        System.out.println("==============================COMANDA");
        
        Produtos prod = new Produtos("PD2", "Cerveja", 5, 78);
        Pedido ped = new Pedido("P1", 5);
        ped.adicionarProduto(prod);                
//        System.out.println(ped.toString());
        // definir entrega
        Comanda com = new Comanda("COM1", true, "24/05/2025", c, garc, ped, pag);
        System.out.println(com.toString());
        
//        
//        //MOTOBOY
//        System.out.println("==============================MOTOBOY");
//        Motoboy moto = new Motoboy("MT12", "Francis", "5673214582");
//        System.out.println(com.toString());
//        



         
        try{                                                

            
        } catch (IllegalArgumentException e){
            System.out.println("Erro:"+e.getMessage());
        }
        
    }
}
