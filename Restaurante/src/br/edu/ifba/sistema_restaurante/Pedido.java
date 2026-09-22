package br.edu.ifba.sistema_restaurante;

import java.util.ArrayList;

public class Pedido {
    private String idPedido;
    private int quantidadeSolicitada;
    private ArrayList<Produtos> produto;

    public Pedido(String idPedido, int quantidadeSolicitada) {
        this.idPedido = idPedido;
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.produto = new ArrayList<>();
    }
       
    public ArrayList<Produtos> getProduto() {
        return produto;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        if (idPedido != null && idPedido.trim().isEmpty() == false){
            this.idPedido = idPedido;
        }else{
            throw new IllegalArgumentException("id do pedido invalido");
        }
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        if (quantidadeSolicitada >= 0){
            this.quantidadeSolicitada = quantidadeSolicitada;
        }else{
            throw new IllegalArgumentException("quantidade invalida");
        }
    }

}
