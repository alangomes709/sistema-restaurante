
import java.util.ArrayList;

public class Pedido {
    private String idPedido;
    private int quantidadeSolicitada;
    private ArrayList<Produtos> produto;

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        if (idPedido.isEmpty()==false || this.idPedido!=null){
        this.idPedido = idPedido;
            
        }
        throw new IllegalArgumentException("id do pedido invalido");
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        if (this.quantidadeSolicitada >= 0){
        this.quantidadeSolicitada = quantidadeSolicitada;
            
        }
        throw new IllegalArgumentException("quantidade invalida");
    }

    public ArrayList<Produtos> getProduto() {
        return produto;
    }

}
