
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private int quantidadeSolicitada;
    private ArrayList<Produtos> produto;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public void setProduto(ArrayList<Produtos> produto) {
        this.produto = produto;
    }
    
    

    
}
