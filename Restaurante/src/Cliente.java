
import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String idCliente;
    private String idMesa;
    private ArrayList<Endereco> endereco;
    private ArrayList<Contato> contato;    

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        if (idCliente.isEmpty()==false || this.idCliente!=null){
        this.idCliente = idCliente;        
        }
        throw new IllegalArgumentException("id do cliente invalido");
    }
    
    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public ArrayList<Contato> getContato() {
        return contato;
    }

    public String getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(String idMesa) {
        if (idMesa.isEmpty()==false || this.idMesa != null){
        this.idMesa = idMesa;
            
        }
        throw new IllegalArgumentException("id da mesa invalido");
    }   
}