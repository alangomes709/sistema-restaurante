package br.edu.ifba.sistema_restaurante;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa() {
    }
    
    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
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
        if (cpf != null && cpf.trim().isEmpty() == false && cpf.length() == 11){
            this.cpf = cpf;  
        }else{
            throw new IllegalArgumentException("CPF não pode ser nulo, deve ter somente numeros e 11 caracteres.");
        }
    }
}
    
    
