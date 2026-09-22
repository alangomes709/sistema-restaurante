package br.edu.ifba.sistema_restaurante;

public class Garcom extends Pessoa {
    private String idGarcom;

    public String getIdGarcom() {
        return idGarcom;
    }

    public void setIdGarcom(String idGarcom) {
        if (idGarcom != null && idGarcom.trim().isEmpty()==false ){
        this.idGarcom = idGarcom;
            
        }else{
        throw new IllegalArgumentException("id do garçom invalido");
            
        }
    }
    
}
