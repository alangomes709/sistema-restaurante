package br.edu.ifba.sistema_restaurante;

public class Entrega extends Endereco {
    private String idEntrega;    

    public String getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(String idEntrega) {
        if (idEntrega.isEmpty()==false || this.idEntrega!=null){
        this.idEntrega = idEntrega;
            
        }
        throw new IllegalArgumentException("id da entrega invalido");
    }    
}
