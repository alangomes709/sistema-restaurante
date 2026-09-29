package br.edu.ifba.sistema_restaurante;

public class Entrega {
    private String idEntrega;
    private Endereco destino;
    private Motoboy motoboy;    

    public Entrega(String idEntrega, Endereco entrega) {
        setIdEntrega(idEntrega);
        setDestino(destino);
    }
    
    public Entrega(String idEntrega,Endereco destino, Motoboy motoboy){
        this(idEntrega, destino);
        setMotoboy(motoboy);
    }
    
    public String getIdEntrega(){
        return idEntrega;
    }
    
    public void setIdEntrega(String idEntrega){
        if(idEntrega == null || idEntrega.trim().isEmpty()){
            throw new IllegalArgumentException("Id da entrega não pode ser nulo ou vazio.");
        }
        this.idEntrega = idEntrega;
    }
    
    public Endereco getDestino(){
        return destino;
    }
    
    public void setDestino(Endereco destino){
        if (destino == null){
            throw new IllegalArgumentException("o endereco de destino e obrigatorio.");
        }
        this.destino = destino;
    }
    
    public Motoboy getMotoboy() {
        return motoboy;
    }
    
    public void setMotoboy(Motoboy motoboy) {
        if (motoboy == null){
            throw new IllegalArgumentException("o motoboy nao pode ser nulo.");
        }
        this.motoboy = motoboy; 
    }
    
    public boolean temMotoboyDesignado(){
        return motoboy != null;
    }
    
    @Override
    public String toString() {
        return "Entrega{" + "idEntrega=" + idEntrega + ", destino=" + destino + ", motoboy=" + motoboy + '}';
    }
    
}
