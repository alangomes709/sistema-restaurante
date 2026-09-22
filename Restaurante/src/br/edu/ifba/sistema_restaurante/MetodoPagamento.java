package br.edu.ifba.sistema_restaurante;

public class MetodoPagamento {
    private String metodoPagamento;
    private String descricao;
    private double taxa;

    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    
    public void setMetodoPagamento(String metodoPagamento) {
        if (metodoPagamento != null && metodoPagamento.trim().isEmpty() == false ){
            this.metodoPagamento = metodoPagamento;            
        }else{
            throw new IllegalArgumentException("metodo de pagamento invalido");            
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && descricao.trim().isEmpty() == false ){
        this.descricao = descricao;
            
        }else{
        throw new IllegalArgumentException("descrição invalida");
            
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (this.taxa > 0 ){
        this.taxa = taxa;
            
        }else{
        throw new IllegalArgumentException("taxa invalida");
            
        }
    }  
}
