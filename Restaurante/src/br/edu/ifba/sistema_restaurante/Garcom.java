package br.edu.ifba.sistema_restaurante;

public class Garcom extends Pessoa {
    private String idGarcom;

    public String getIdGarcom() {
        return idGarcom;
    }

    public void setIdGarcom(String idGarcom) {
        if (idGarcom.isEmpty()==false || this.idGarcom != null){
        this.idGarcom = idGarcom;
            
        }
        throw new IllegalArgumentException("id do garçom invalido");
    }
    
}
