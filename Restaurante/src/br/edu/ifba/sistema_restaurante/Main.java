
package br.edu.ifba.sistema_restaurante;

public class Main {

    public static void main(String[] args) {

        
        try {
        // CLIENTE
      
        Cliente cliente = new Cliente("C1","Cleber","32942234324");

        // ENDEREÇO
        
        Endereco endereco = new Endereco("E1","Rua Rosas Vermelhas","98730000","Campim Florido",65);

        cliente.adicionarEndereco(endereco);
        
        // CONTATO
        
        Contato contato = new Contato("74999678954","clebin@gmail.com");
        cliente.adicionarContato(contato);
        
        // MOTOBÓY
        
        Motoboy motoboy = new Motoboy("MT12","Francis","56732145582");
        
        // GARÇOM
         
        Garcom garcom = new Garcom("G1","Geraldo Junior","12345678901");
        
        // PRODUTO
        
        Produtos produto = new Produtos("T1","Bebida",8.00,50);
        
        // PEDIDO
        
        Pedido pedido = new Pedido("PD1",5);

        // Adicionando produto ao pedido
        
        pedido.getProduto().add(produto);
        
        // MÉTODO DE PAGAMENTO
        
        MetodoPagamento metodoPagamento = new MetodoPagamento("PIX","Pagamento via PIX",0.0);

        // PAGAMENTO
        
        Pagamento pagamento = new Pagamento("PG1",10.0,metodoPagamento);

        // ENTREGA
        
        Entrega entrega = new Entrega( "ET1","E1","Rua Rosas Vermelhas","98730000","Capim Florido","Casa",65);

        // COMANDA
        
        Comanda comanda = new Comanda("COM1",false,"24/05/2025",cliente,garcom,pedido,entrega,pagamento);
        
        // EXIBIÇÃO DOS OBJETOS

        System.out.println("===== CLIENTE =====");
        System.out.println("ID: " + cliente.getIdCliente());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        System.out.println("\n===== ENDEREÇO =====");
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Número: " + endereco.getNumCasa());

        System.out.println("\n===== CONTATO =====");
        System.out.println("Telefone: " + contato.getTelefone());
        System.out.println("Email: " + contato.getEmail());

        System.out.println("\n===== MOTOBÓY =====");
        System.out.println("ID: " + motoboy.getIdMotoboy());
        System.out.println("Nome: " + motoboy.getNome());
        System.out.println("CPF: " + motoboy.getCpf());

        System.out.println("\n===== GARÇOM =====");
        System.out.println("ID: " + garcom.getIdGarcom());
        System.out.println("Nome: " + garcom.getNome());
        System.out.println("CPF: " + garcom.getCpf());

        System.out.println("\n===== PRODUTO =====");
        System.out.println("ID: " + produto.getIdProduto());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Preço: " + produto.getPrecoUnitario());
        System.out.println("Quantidade disponível: "
                + produto.getQuantidadeDisponivel());

        System.out.println("\n===== PEDIDO =====");
        System.out.println("ID: " + pedido.getIdPedido());
        System.out.println("Quantidade solicitada: "
                + pedido.getQuantidadeSolicitada());
        System.out.println("Produtos no pedido: "
                + pedido.getProduto().size());

        System.out.println("\n===== MÉTODO DE PAGAMENTO =====");
        System.out.println("Método: "
                + metodoPagamento.getMetodoPagamento());
        System.out.println("Descrição: "
                + metodoPagamento.getDescricao());
        System.out.println("Taxa: "
                + metodoPagamento.getTaxa());

        System.out.println("\n===== PAGAMENTO =====");
        System.out.println("ID: " + pagamento.getIdPagamento());
        System.out.println("Taxa de serviço: "
                + pagamento.getTaxaServico());

        System.out.println("\n===== ENTREGA =====");
        System.out.println("ID: " + entrega.getIdEntrega());
        System.out.println("Rua: " + entrega.getRua());
        System.out.println("CEP: " + entrega.getCep());
        System.out.println("Bairro: " + entrega.getBairro());
        System.out.println("Número: " + entrega.getNumCasa());

        System.out.println("\n===== COMANDA =====");
        System.out.println("ID: " + comanda.getIdComanda());
        System.out.println("Status: " + comanda.isStatus());
        System.out.println("Data: " + comanda.getData());
        System.out.println("Cliente: "
                + comanda.getCliente().getNome());
        System.out.println("Garçom: "
                + comanda.getGarcom().getNome());
        System.out.println("Pedido: "
                + comanda.getPedido().getIdPedido());
        System.out.println("Entrega: "
                + comanda.getEntrega().getIdEntrega());
        System.out.println("Pagamento: "
                + comanda.getPagamento().getIdPagamento());
        } catch (IllegalArgumentException e){
            System.out.println("ERRO: "+ e.getMessage());
        }
        
    }
}
