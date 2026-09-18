public class Estoque {
    int idProduto;
    String pratos;
    String bebidas;
    double quantDisponivel;

    public Estoque(int idProduto, String pratos, double quantDisponivel, String bebidas) {
        this.idProduto = idProduto;
        this.pratos = pratos;
        this.quantDisponivel = quantDisponivel;
        this.bebidas = bebidas;
    }            
}
