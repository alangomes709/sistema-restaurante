package br.edu.ifba.sistema_restaurante;

public class Endereco {
    private String idEndereco;
    private String rua;
    private String cep;
    private String bairro;
    private String complemento;
    private int numCasa;

    public Endereco() {
    }

    
    public Endereco(String idEndereco, String rua, String cep, String bairro, int numCasa) {
        setIdEndereco(idEndereco);
        setRua(rua);
        setCep(cep);
        setBairro(bairro);
        setNumCasa(numCasa);
    }
    
    

    public Endereco(String idEndereco, String rua, String cep, String bairro, String complemento, int numCasa) {
        setIdEndereco(idEndereco);
        setRua(rua);
        setCep(cep);
        setBairro(bairro);
        setComplemento(complemento);
        setNumCasa(numCasa);
    }
    
    

    public String getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(String idEndereco) {
        if(idEndereco != null && idEndereco.trim().isEmpty() == false ){
            this.idEndereco = idEndereco;
        }else{
            throw new IllegalArgumentException("Endereço não pode ser nulo.");
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua != null && rua.trim().isEmpty() == false ){
            this.rua = rua;
        }else{
            throw new IllegalArgumentException("Rua não pode ser nula.");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep != null && cep.trim().isEmpty() == false && cep.length() == 8){
            this.cep = cep;
        }else{
            throw new IllegalArgumentException("CEP não pode ser nulo, deve conter somente numeros e 8 caracteres .");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (bairro != null && bairro.trim().isEmpty() == false ){
            this.bairro = bairro;
        }else{
            throw new IllegalArgumentException("Bairro não pode ser nulo.");
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        if (complemento != null) {
        this.complemento = complemento.trim();
    } else {
        this.complemento = "";
    }
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        if (numCasa > 0){
            this.numCasa = numCasa;
        }else{
            throw new IllegalArgumentException("O numero da casa deve ser maior que 0.");
        }
    }   
}
