package br.edu.ifba.sistema_restaurante;

public class Motoboy extends Pessoa {
    private String idMotoboy;    

    public Motoboy(String idMotoboy) {
        setIdMotoboy(idMotoboy);
    }

    public Motoboy(String idMotoboy, String nome, String cpf) {
        super(nome, cpf);
        setIdMotoboy(idMotoboy);
    }
    
    
    public String getIdMotoboy() {
        return idMotoboy;
    }

    public void setIdMotoboy(String idMotoboy) {
        if (idMotoboy != null && idMotoboy.trim().isEmpty() == false ){
            this.idMotoboy = idMotoboy;            
        }else{
            throw new IllegalArgumentException("Id do motoboy não pode ser nulo.");            
        }
    }   
    
}
