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

    public Comanda(String idComanda, boolean status, String data, Cliente cliente, Garcom garcom, Pedido pedido, Pagamento pagamento) {
        setIdComanda(idComanda);
        setStatus(status);
        setData(data);
        setCliente(cliente);
        setGarcom(garcom);
        setPedido(pedido);       
        setPagamento(pagamento);
    }
    
    public Comanda(String idComanda, boolean status, String data, Cliente cliente, Garcom garcom, Pedido pedido, Entrega entrega, Pagamento pagamento) {
        setIdComanda(idComanda);
        setStatus(status);
        setData(data);
        setCliente(cliente);
        setGarcom(garcom);
        setPedido(pedido);
        setEntrega(entrega);
        setPagamento(pagamento);
    }
    
    

    public String getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(String idComanda) {
        if (idComanda != null && idComanda.trim().isEmpty() == false){
            this.idComanda = idComanda;        
        }else{    
            throw new IllegalArgumentException("Id da comanda não pode ser nulo.");
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
            throw new IllegalArgumentException("Data não pode ser nula.");            
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {       
        if (cliente!=null) {
            this.cliente = cliente;                
        } else {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");        
        }
        
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        if (garcom != null){
            this.garcom = garcom; //garcom nulo em delivery
        }else{
            this.garcom = null; 
        }
                 
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido!=null) {
            this.pedido = pedido;
        } else {
            throw new IllegalArgumentException("Pedido não pode ser nulo.");        
        }
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        if (entrega != null){
            this.entrega = entrega;  //tambem opcional             
        }else{
            this.entrega = null;
        }
               
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        if (status == false){
            this.pagamento = pagamento;  //opcional enquanto tiver aberta
        }else{
            this.pagamento = null;
        }
            
    } 
}
