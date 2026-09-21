
import java.util.ArrayList;

public class Cliente {
    private String cpfCliente;
    private String nome;
    private int idMesa;
    private ArrayList<Endereco> endereco;
    private ArrayList<Contato> contato;    
    
    public ArrayList<Endereco> getEndereco() {
        return endereco;
    }

    public ArrayList<Contato> getContato() {
        return contato;
    }
    
    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    
    
    
    
}