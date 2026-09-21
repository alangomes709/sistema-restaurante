
import java.util.ArrayList;

public class Pagamento {
    private int idPagamento;
    private double taxaServico;
    private double total;
    private ArrayList<Comanda> comanda;
    private ArrayList<MetodoPagamento> metPag;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Comanda> getComanda() {
        return comanda;
    }

    public ArrayList<MetodoPagamento> getMetPag() {
        return metPag;
    }
    
    

    
    
}
