package br.edu.ifba.sistema_restaurante;

public class Entrega extends Endereco {
    private String idEntrega;    

    public Entrega(String idEntrega) {
        setIdEntrega(idEntrega);
    }

    public Entrega(String idEntrega, String idEndereco, String rua, String cep, String bairro, int numCasa) {
        super(idEndereco, rua, cep, bairro, numCasa);
        setIdEntrega(idEntrega);
    }

    public Entrega(String idEntrega, String idEndereco, String rua, String cep, String bairro, String complemento, int numCasa) {
        super(idEndereco, rua, cep, bairro, complemento, numCasa);
        setIdEntrega(idEntrega);
    }    
    
    public String getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(String idEntrega) {
        if (idEntrega != null && idEntrega.trim().isEmpty() == false ){
            this.idEntrega = idEntrega;
        }else{
            throw new IllegalArgumentException("id da entrega invalido");
        }
    }    
}
