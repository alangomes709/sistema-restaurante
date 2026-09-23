package br.edu.ifba.sistema_restaurante;

public class MetodoPagamento {
    private String metodoPagamento;
    private String descricao;
    private double taxa;

    public MetodoPagamento(String metodoPagamento, String descricao, double taxa) {
        setMetodoPagamento(metodoPagamento);
        setDescricao(descricao);
        setTaxa(taxa);
    }
    
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    
    public void setMetodoPagamento(String metodoPagamento) {
        if (metodoPagamento != null && metodoPagamento.trim().isEmpty() == false ){
            this.metodoPagamento = metodoPagamento;            
        }else{
            throw new IllegalArgumentException("Metodo de pagamento não pode ser nulo.");            
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && descricao.trim().isEmpty() == false ){
            this.descricao = descricao;            
        }else{
            throw new IllegalArgumentException("Descrição não pode ser nula.");
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa > 0 ){
            this.taxa = taxa;
        }else{
            throw new IllegalArgumentException("Taxa não pode ser nula.");
        }
    }  
}
