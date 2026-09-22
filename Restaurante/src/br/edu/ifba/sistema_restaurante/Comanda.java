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
        if (idComanda != null && idComanda.trim().isEmpty() == false){
            this.idComanda = idComanda;        
        }else{    
            throw new IllegalArgumentException("id da comanda invalido");
        }
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
        if (data != null && data.trim().isEmpty() == false){
            this.data = data;            
        }else{
            throw new IllegalArgumentException("data invalida");            
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {       
        if (this.cliente!=null) {
            this.cliente = cliente;                
        } else {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");        
        }
        
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        if (this.garcom!=null) {            
            this.garcom = garcom;
        } else {
            throw new IllegalArgumentException("Garcom não pode ser nulo.");        
        }            
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (this.pedido!=null) {
            this.pedido = pedido;
        } else {
            throw new IllegalArgumentException("Pedido não pode ser nulo.");        
        }
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        if (this.entrega!=null) {
            this.entrega = entrega;                
        } else {
            throw new IllegalArgumentException("Entrega não pode ser nulo.");        
        }        
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        if (this.pagamento!=null) {
            this.pagamento = pagamento;
        } else {
            throw new IllegalArgumentException("Pagamento não pode ser nulo.");        
        }
        
    }    
}
