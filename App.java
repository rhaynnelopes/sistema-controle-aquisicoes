import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    int menu = 0;
    Status status;
    int nroPedido = 1;

    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    ArrayList<PedidoAquisicao> listaPedidos = new ArrayList<PedidoAquisicao>();    

    Scanner entrada = new Scanner(System.in);

    do {
        System.out.println("SEJA BEM-VINDO!\n");
        criarEExibirListaUsuarios(listaUsuarios);
        System.out.println("\n\nSelecione seu usuario pelo id:");

        int idUser = entrada.nextInt();
        Usuario userAtual = new Usuario();
        
        for (Usuario user : listaUsuarios)
        {
            if(idUser == user.getIdUsuario())
            userAtual = user;
        }
        do {            
            switch(userAtual.tipoUsuario)
            {            
                case 1:
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n2 - Aprovar pedido de aquisição\n3 - Verificar Estatisticas Gerais\n0 - Voltar");
                    int opcao = entrada.nextInt();                    
                    switch(opcao) {
                        case 1:
                        ///public PedidoAquisicao(Usuario user, int idDepartamento, Data dataPedido, int numeroPedido, ArrayList<Item> itens, Status status)
                            
                            

                            //Regra de negócio: O sistema não possui os produtos registrado
                            //Pedidos novoPedido = new Pedido(numero id pedido, data do pedido, data da conclusão, departamento, usuario);
                            //lista de itens
                            //scanner (digite a descricao do produto) -> descricao
                            //scanner (digite o valor do produto) -> valor
                            //scanner (digite a quantidade) -> quantidade
                            //valor total = valor * quantidade
                            //Item numeroItem = new Item(numero id pedido, numero id item, descricao, valor, quantidade, total);
                            //System.out.println("Deseja adicionar mais um item?")
                            //Se sim - Item numeroItem = new Item(numero id pedido, numero id item, descricao, valor, quantidade, total);
                            //Se não - definir valorTotal do pedido somando total do item
                            //menu-- (voltar tela)
                           
                        break;
                        case 2:
                            /*menu++;
                            PedidoAquisicao pedidoAtual = new PedidoAquisicao();                            
                            System.out.println("GERENCIAR REQUISIÇÕES:\n");
                            System.out.println("Lista de Pedidos:");
                            criarEExibirListaPedidos(listaPedidos);
                            System.out.println("Digite o numero do pedido que deseja gerenciar:");
                            int numero = entrada.nextInt();

                            for (PedidoAquisicaoTemp order : listaPedidos)
                            {
                                if(numero == order.getNumeroPedido)
                                    pedidoAtual = order;
                            }
                            System.out.println("Digite 1 para aprovar e 2 para excluir ou 3 para retornar");
                            opcao = entrada.nextInt();
                            if (opcao == 1)
                                pedidoAtual.setStatus(status.APROVADO);
                            if(opcao == 2)
                                pedidoAtual.setStatus(status.APROVADO);
                            if(opcao == 0)
                                menu--;*/
                        break;
                        case 3:
                            menu++;
                            System.out.println("ESTATISTICAS GERAIS:\n");
                            //Número de pedidos total, divididos entre aprovados e reprovados (com percentuais)
                            //Número de pedidos nos últimos 30 dias e seu valor médio.
                            //Valor total de cada categoria nos últimos 30 dias
                            //Detalhes do pedido de aquisição de maior valor ainda aberto.
                        break;
                        case 0:
                            menu--;
                            System.out.println("valor menu = " + menu);
                            break;                    
                    }
                break;
                case 2:
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n0 - Voltar");
                    opcao = entrada.nextInt();
                    menu++;
                    switch(opcao) {
                        case 1:
                            System.out.println("REGISTRO DE PEDIDO:\n");
                            //selecionar item por id
                            //selecionar quantidade
                        break;
                        case 0:
                            menu--;
                        break;
                    }                
                break;
            }
        }while(menu == 1);
    }while(menu == 0);   
    
    
    entrada.close();
    }

    private static void criarEExibirListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        criarListaUsuarios(listaUsuarios);
        exibirListaUsuarios(listaUsuarios);
    }

    
    private static void criarListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        listaUsuarios.add(new Usuario(01, 2, "Claudio Roberto", "CR", 3));
        listaUsuarios.add(new Usuario(02, 2, "Laura Fonseca", "LF", 2));
        listaUsuarios.add(new Usuario(03, 1, "Alice Silva", "AS", 1));

    }

    private static void exibirListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        }
    }
    /*
    private static void criarEExibirListaPedidos(ArrayList<PedidoAquisicaoTemp> listaPedidos) {
        criaListaPedidos(listaPedidos);
        exibirListaPedidos(listaPedidos);
    }
*/
/*
    private static void criaListaPedidos(ArrayList<PedidoAquisicaoTemp> listaPedidos) {        
        listaPedidos.add(new PedidoAquisicaoTemp(2));
        //listaPedidos.add(new PedidoAquisicaoTemp(2, ));
    }
*/
/*
    private static void exibirListaPedidos(ArrayList<PedidoAquisicaoTemp> listaPedidos) {
        for (PedidoAquisicaoTemp pedido : listaPedidos) {
            System.out.println(pedido.toString());
        }
    }
    */
}