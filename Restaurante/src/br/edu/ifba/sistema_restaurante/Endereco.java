package br.edu.ifba.sistema_restaurante;

public class Endereco {
    private String idEndereco;
    private String rua;
    private String cep;
    private String bairro;
    private String complemento;
    private int numCasa;

    public String getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        if(idEndereco.isEmpty()==false || this.idEndereco!=null){
        this.idEndereco = idEndereco;
            
        }
        throw new IllegalArgumentException("endereço invalido");
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua.isEmpty()==false || this.rua!=null){
        this.rua = rua;
            
        }
        throw new IllegalArgumentException("rua invalida");
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep.isEmpty()==false || this.cep!=null){
        this.cep = cep;
            
        }
        throw new IllegalArgumentException("CEP invalido");
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (bairro.isEmpty()==false || this.bairro!=null){
        this.bairro = bairro;
            
        }
        throw new IllegalArgumentException("bairro invalido");
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (complemento.isEmpty()==false || this.complemento!=null){
        this.complemento = complemento;
            
        }
        throw new IllegalArgumentException("complemento invalido");
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        if (numCasa > 0){
        this.numCasa = numCasa;
            
        }
        throw new IllegalArgumentException("numero invalido");
    }   
}
