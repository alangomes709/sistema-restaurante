package br.edu.ifba.sistema_restaurante;

public class Comanda {
    private String idComanda;
    private boolean status;
    private String data;
    private Cliente cliente;
    private Garcom garcom;
    private Pedido pedido;
    private Entrega entrega;
    private Pagamento pagamento;

    public String getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(String idComanda) {
        if (idComanda.isEmpty()==false || this.idComanda!=null){
        this.idComanda = idComanda;
            
        }
        throw new IllegalArgumentException("id da comanda invalido");
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
        if (data.isEmpty()==false || this.data!=null){
        this.data = data;
            
        }
        throw new IllegalArgumentException("data invalida");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }    
}
