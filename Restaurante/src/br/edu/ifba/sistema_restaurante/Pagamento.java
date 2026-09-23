package br.edu.ifba.sistema_restaurante;

public class Pagamento {
    private String idPagamento;
    private double taxaServico;    
    private MetodoPagamento metPag;

    public Pagamento() {
    }
    
    public Pagamento(String idPagamento, double taxaServico, MetodoPagamento metPag) {
        setIdPagamento(idPagamento);
        setTaxaServico(taxaServico);
        setMetPag(metPag);
    }        

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        if (idPagamento != null && idPagamento.trim().isEmpty() == false ){
            this.idPagamento = idPagamento;            
        }else{
            throw new IllegalArgumentException("id do pagamento invalido");
        }
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        if (taxaServico >= 0){
        this.taxaServico = taxaServico;
            
        }
        throw new IllegalArgumentException("taxa de serviço invalida");
    }

    public MetodoPagamento getMetPag() {
        return metPag;
    }

    public void setMetPag(MetodoPagamento metPag) {
        this.metPag = metPag;
    }
    
}
