package br.edu.ifba.sistema_restaurante;

public class Contato {
    private String telefone;
    private String email;

    public Contato(String telefone, String email) {
        setTelefone(telefone);
        setEmail(email);
    }
       
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.trim().isEmpty() == false && telefone.length() == 11){
            this.telefone = telefone;            
        } else {
            throw new IllegalArgumentException("Telefone não pode ser nulo, deve conter somente numeros e 11 caracteres.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.trim().isEmpty() == false && email.contains("@")){
            this.email = email;            
        }else{
            throw new IllegalArgumentException("Email não pode ser nulo e deve conter @.");
        }
    }
}
