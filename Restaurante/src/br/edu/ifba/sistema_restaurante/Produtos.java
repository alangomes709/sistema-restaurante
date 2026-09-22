package br.edu.ifba.sistema_restaurante;

public class Produtos {
    private String idProduto;
    private String descricao;
    private double precoUnitario;
    private int quantidadeDisponivel;

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        if (idProduto.isEmpty()==false || this.idProduto!=null){
        this.idProduto = idProduto;
            
        }
        throw new IllegalArgumentException("id do produto invalido");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isEmpty()==false || this.descricao!=null);{
        this.descricao = descricao;
        
    }
        throw new IllegalArgumentException("descrição invalida");
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (this.precoUnitario >= 0){
        this.precoUnitario = precoUnitario;
            
        }
        throw new IllegalArgumentException("preço invalido");
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        if (this.quantidadeDisponivel >= 0){
        this.quantidadeDisponivel = quantidadeDisponivel;
            
        }
        throw new IllegalArgumentException("quantidade invalida");
    }  
}
