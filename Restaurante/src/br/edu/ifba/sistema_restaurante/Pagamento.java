package br.edu.ifba.sistema_restaurante;

public class Pagamento {
    private String idPagamento;
    private double taxaServico;
    private double total;
    private MetodoPagamento metPag;

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        if (idPagamento.isEmpty()==false || this.idPagamento!=null){
        this.idPagamento = idPagamento;
            
        }
        throw new IllegalArgumentException("id do pagamento invalido");
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        if (this.taxaServico >= 0){
        this.taxaServico = taxaServico;
            
        }
        throw new IllegalArgumentException("taxa de serviço invalida");
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        if (this.total >= 0){
        this.total = total;
            
        }
        throw new IllegalArgumentException("total invalido");
    }

    public MetodoPagamento getMetPag() {
        return metPag;
    }

    public void setMetPag(MetodoPagamento metPag) {
        this.metPag = metPag;
    }
    
}
