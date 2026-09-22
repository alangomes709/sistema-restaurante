
import java.util.ArrayList;

public class Comanda {
    private int idComanda;
    private boolean status;
    private String data;
    private ArrayList<Cliente> cliente;
    private ArrayList<Garcom> garcom;
    private ArrayList<Pedido> pedido;
    private ArrayList<Entrega> entrega;
    private ArrayList<Pagamento> pagamento;

    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public ArrayList<Garcom> getGarcom() {
        return garcom;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public ArrayList<Entrega> getEntrega() {
        return entrega;
    }

    public ArrayList<Pagamento> getPagamento() {
        return pagamento;
    }
    
    //talvez esses arraylists todos sejam desnecessários
    /// to coringando ja
    
    //talvez seja o cansaço mas s´o identifiquei relações 1:N
    //preciso dormir
    //talvez nem todos as chaves estrangeiras precisem estar nas tabelas/classes q foram referenciadas
    //e dê pra acessar dentro de outras classes em q elas ja foram referenciadas para evitar redundancia

    ///ideia: fazer metodos acessores especificos dentro de cada uma dessas classes
    ///associadas via array, para q os atributos sejam apenas dentro daquela classe.
    ///
    ///falta validação dos metodos acessores, construtores e verificar os relacionamentos.
//      renomear pacotes
    

    

}
