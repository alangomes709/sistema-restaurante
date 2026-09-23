package br.edu.ifba.sistema_restaurante;

public class Produtos {
    private String idProduto;
    private String descricao;
    private double precoUnitario;
    private int quantidadeDisponivel;

    public Produtos() {
    }

    public Produtos(String idProduto, String descricao, double precoUnitario, int quantidadeDisponivel) {
        setIdProduto(idProduto);
        setDescricao(descricao);
        setPrecoUnitario(precoUnitario);
        setQuantidadeDisponivel(quantidadeDisponivel);
    }
    
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        if (idProduto != null && idProduto.trim().isEmpty() == false ){
            this.idProduto = idProduto;
        }else{
            throw new IllegalArgumentException("id do produto invalido");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && descricao.trim().isEmpty() == false){
            this.descricao = descricao;        
        } else {
            throw new IllegalArgumentException("descrição invalida");       
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0){
            this.precoUnitario = precoUnitario;        
        }else{
            throw new IllegalArgumentException("preço invalido");
        }
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        if (quantidadeDisponivel >= 0){
            this.quantidadeDisponivel = quantidadeDisponivel;
        }else{
            throw new IllegalArgumentException("quantidade invalida");
        }
    }  
}
