package br.edu.ifba.sistema_restaurante;

public class Motoboy extends Pessoa {
    private String idMotoboy;

    public String getIdMotoboy() {
        return idMotoboy;
    }

    public void setIdMotoboy(String idMotoboy) {
        if (idMotoboy != null && idMotoboy.trim().isEmpty() == false ){
        this.idMotoboy = idMotoboy;
            
        }else{
        throw new IllegalArgumentException("id do motoboy invalido");
            
        }
    }   
    
}
