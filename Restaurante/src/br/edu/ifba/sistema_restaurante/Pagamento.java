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
            throw new IllegalArgumentException("Id do pagamento não pode ser nulo.");
        }
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        if (taxaServico >= 0){
        this.taxaServico = taxaServico;
            
        }else{
        throw new IllegalArgumentException("Taxa de serviço tem que ser maior ou igual a 0.");
            
        }
    }

    public MetodoPagamento getMetPag() {
        return metPag;
    }

    public void setMetPag(MetodoPagamento metPag) {
        if (metPag != null) {
        this.metPag = metPag;
    } else {
        throw new IllegalArgumentException("Método de pagamento não pode ser nulo.");
    }
    }
    
}
