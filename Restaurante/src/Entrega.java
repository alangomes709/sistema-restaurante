
import java.util.ArrayList;

public class Entrega {
    private String idEntrega;
    private ArrayList<Endereco> enderecoDest;

    public String getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(String idEntrega) {
        if (idEntrega.isEmpty()==false || this.idEntrega!=null){
        this.idEntrega = idEntrega;
            
        }
        throw new IllegalArgumentException("id da entrega invalido");
    }

    public ArrayList<Endereco> getEnderecoDest() {
        return enderecoDest;
    }   
}
