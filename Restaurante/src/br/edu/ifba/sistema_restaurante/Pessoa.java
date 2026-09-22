package br.edu.ifba.sistema_restaurante;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {
    }
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }       

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.trim().isEmpty() == false ) {
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("O nome não pode ser vazio.");                
        }
    }

    public String getCpf() {        
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.isEmpty() == false && cpf.length() == 11){
            this.cpf = cpf;  
        }else{
            throw new IllegalArgumentException("CPF invalido");
        }
    }
}
    
    
