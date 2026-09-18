public class Pedido {
    int idPedido;
    String embalagem;
    String status;
    String dataPedido;

    public Pedido(int idPedido, String embalagem, String dataPedido, String status) {
        this.idPedido = idPedido;
        this.embalagem = embalagem;
        this.status = status;
        this.dataPedido = dataPedido;
    }
}
