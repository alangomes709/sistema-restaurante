package br.edu.ifba.sistema_restaurante;

public class Contato {
    private String telefone;
    private String email;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.isEmpty()==false || this.telefone!=null && this.telefone.length()==11){
            this.telefone = telefone;            
        }
        throw new IllegalArgumentException("numero invalido");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()==false || this.email!=null && this.email.contains("@")){
            this.email = email;            
        }
        throw new IllegalArgumentException("email invalido");
    }
    
}
