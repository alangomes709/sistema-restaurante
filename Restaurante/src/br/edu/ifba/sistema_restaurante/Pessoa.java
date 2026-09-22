package br.edu.ifba.sistema_restaurante;

public class Pessoa {
    private String nome;
    private String cpf;

    //////construtor
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()==false || this.nome!=null) {
            this.nome = nome;
        }
        throw new IllegalArgumentException("O nome não pode ser vazio.");                
    }

    public String getCpf() {        
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()==false || this.cpf!=null && this.cpf.length()==11){
        this.cpf = cpf;  
        }
        throw new IllegalArgumentException("CPF invalido");
    }
}
    
    
