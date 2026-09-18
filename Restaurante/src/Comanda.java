public class Comanda {
    int idComanda;
    int idCliente;
    String pedido;
    String status;
    String data;
    int idGarcom;

    public Comanda(int idComanda, int idCliente, String pedido, String status, String data, int idGarcom) {
        this.idComanda = idComanda;
        this.idCliente = idCliente;
        this.pedido = pedido;
        this.status = status;
        this.data = data;
        this.idGarcom = idGarcom;
    }

}
