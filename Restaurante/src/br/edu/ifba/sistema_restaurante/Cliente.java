package br.edu.ifba.sistema_restaurante;


import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    private String idMesa;
    private ArrayList<Endereco> end;
    private ArrayList<Contato> cont;

    public Cliente(String idCliente, String nome, String cpf) {
        super(nome, cpf);
        setIdCliente(idCliente);
        this.end = new ArrayList<>();
    }

    public Cliente(String idCliente) {
        setIdCliente(idCliente);
        this.end = new ArrayList<>();
    }

    public Cliente(String idCliente, ArrayList<Endereco> end, String nome, String cpf) {
        super(nome, cpf);        
        setIdCliente(idCliente);
        this.end = new ArrayList<>();        
    }        

    public Cliente(String idCliente, String idMesa) {
        setIdCliente(idCliente);
        setIdMesa(idMesa);
        this.end = new ArrayList<>();
        this.cont = new ArrayList<>(); 
    }

    public Cliente(String idCliente, String idMesa, String nome, String cpf) {
        super(nome, cpf);
        setIdCliente(idCliente);
        setIdMesa(idMesa);
        this.end = new ArrayList<>(); 
        this.cont = new ArrayList<>(); 
    }                

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        if (idCliente != null && idCliente.trim().isEmpty() == false ){
            this.idCliente = idCliente;        
        }else{
            throw new IllegalArgumentException("Id do cliente não pode ser nulo.");            
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
            throw new IllegalArgumentException("Id da mesa não pode ser nulo.");            
        }
    }   
}