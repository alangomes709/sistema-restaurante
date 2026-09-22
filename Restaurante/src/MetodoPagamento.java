public class MetodoPagamento {
    private String metodoPagamento;
    private String descricao;
    private double taxa;

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        if (metodoPagamento.isEmpty()==false || this.metodoPagamento!=null){
        this.metodoPagamento = metodoPagamento;
            
        }
        throw new IllegalArgumentException("metodo de pagamento invalido");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.isEmpty()==false || this.descricao!=null){
        this.descricao = descricao;
            
        }
        throw new IllegalArgumentException("descrição invalida");
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (this.taxa > 0 ){
        this.taxa = taxa;
            
        }
        throw new IllegalArgumentException("taxa invalida");
    }  
}
