package br.edu.ifba.sistema_restaurante;


import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    private String idMesa;
    private ArrayList<Endereco> end;
    private ArrayList<Contato> cont;
        

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        if (idCliente != null && idCliente.trim().isEmpty() == false ){
            this.idCliente = idCliente;        
        }else{
            throw new IllegalArgumentException("id do cliente invalido");            
        }
    }

    public ArrayList<Endereco> getEnd() {
        return end;
    }    

    public ArrayList getCont() {
        return cont;
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        if (idMesa != null && idMesa.trim().isEmpty() == false ){
            this.idMesa = idMesa;            
        }else{
            throw new IllegalArgumentException("id da mesa invalido");            
        }
    }   
}