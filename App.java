import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class App {
    private static int pedido = 1;
    private static Status status;    

    public static void main(String[] args) {
    int menu = 0;    
    Scanner entrada = new Scanner(System.in);

    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    ArrayList<PedidoAquisicao> listaPedidos = new ArrayList<PedidoAquisicao>();    
    criarListaUsuarios(listaUsuarios);
    do {
        clearScreen();
        System.out.println("SEJA BEM-VINDO!\n");
        exibirListaUsuarios(listaUsuarios);
        System.out.print("\nSelecione seu usuario pelo id: ");

        int idUser = entrada.nextInt();
        Usuario userAtual = new Usuario();        
        for (Usuario user : listaUsuarios)
        {
            if(idUser == user.getIdUsuario())
            userAtual = user;
        }
        do {           
            clearScreen(); 
            switch(userAtual.tipoUsuario)
            {          
                case 1:
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n2 - Gerenciar Pedidos\n3 - Verificar Estatisticas Gerais\n0 - Voltar");
                    System.out.print("Escolha: ");
                    int opcao = entrada.nextInt();                    
                    switch(opcao) {

                        case 1:                                                                       
                        System.out.println("REGISTRO DE PEDIDO:\n");
                        registraPedido(userAtual, listaPedidos); 
                        menu = 1;
                        break;

                        case 2:
                            System.out.println("GERENCIAR REQUISIÇÕES:\n");    
                            System.out.println("Digite sua escolha\n1 - Aprovar/Rejeitar pedidos\n2 - Remover Pedidos");
                            System.out.print("Escolha: ");
                            opcao = entrada.nextInt();                           
                            if(opcao == 1) {
                            PedidoAprovaReijeita(listaPedidos);
                            menu = 1;
                            }

                            if(opcao == 2) {
                                excluiPedido(userAtual.getIdUsuario(), listaPedidos);
                                menu = 1;
                            }
                        break;

                        case 3:                            
                            System.out.println("ESTATISTICAS GERAIS:\n");
                            System.out.println("Digite o tópico desejado:\n1 - Buscar pedido por Funcionario\n2 - Buscar pedido por Descricao\n3 - Listar pedidos aprovados");
                            System.out.println("4 - Listar pedidos reprovados\n5 - Listar média pedidos por mes\n6 - Listar total da categoria por mês");
                            System.out.println("5 - Exibir maior aquisição pendente");
                            opcao = entrada.nextInt();
                        break;

                        case 0:
                            menu = 0;
                            System.out.println("valor menu = " + menu);
                            break;                    
                    }
                break;

                case 2:
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n2 - Excluir pedido\n0 - Voltar");
                    opcao = entrada.nextInt();
                    switch(opcao) {
                        case 1:
                            System.out.println("REGISTRO DE PEDIDO:\n");                                                    
                            registraPedido(userAtual, listaPedidos);
                            menu = 1;
                        break;
                        case 2:
                            excluiPedido(userAtual.getIdUsuario(), listaPedidos);
                            menu = 1;
                        break;
                        case 0:
                            menu = 0;
                        break;
                    }                
                break;
            }
        }while(menu == 1);
    }while(menu == 0);
    entrada.close();
    }
    /*//////////////////////////////////////////////////////////////////////////////
                                 MÉTODOS PARA LISTAS                                       
    /////////////////////////////////////////////////////////////////////////////*/
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

    public static void printPedidos(ArrayList<PedidoAquisicao> listaPedidos) {
        for (PedidoAquisicao pedido : listaPedidos) {
            System.out.println(pedido.toString());
        }
    }

    /*//////////////////////////////////////////////////////////////////////////////
                                 MÉTODOS PARA O MENU                                       
    /////////////////////////////////////////////////////////////////////////////*/
    public static void registraPedido(Usuario userAtual, ArrayList<PedidoAquisicao> listaPedidos) {
        ArrayList<Item> listaItem = new ArrayList<Item>();
        Date date = new Date();        
        PedidoAquisicao novoPedido = new PedidoAquisicao(pedido, userAtual, userAtual.getIdDepartamento(), listaItem, date);
        boolean lista = true;
        int total = 0;
        double valorTotal = 0;
        
        //loop para adicionar lista//
        while(lista = true) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite a descrição do produto: ");
            String descricao = entrada.next();
            
            System.out.print("Digite o valor do produto: ");
            double valor = entrada.nextDouble();
            
            System.out.print("Digite a quantidade: ");
            int quantidade = entrada.nextInt();
            listaItem.add(new Item(descricao, valor, quantidade));
            valorTotal = valorTotal + (valor * quantidade);
            System.out.println("Deseja adicionar mais um item?\n1 - sim\n2 - nao");
            System.out.print("Escolha: ");
            int resposta = entrada.nextInt();

            if(resposta == 2) {
                lista = false;
                System.out.print("Itens Adicionados");
                novoPedido.setValorTotal(valorTotal);
                listaPedidos.add(novoPedido);
                pedido++; //atualiza para próximo id de pedido
                break;
            }                                
        }
    }
    //LIMPA TELA
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    //MÉTODO PARA APROVAR OU REJEITAR PEDIDOS
    public static void PedidoAprovaReijeita(ArrayList<PedidoAquisicao> listaPedidos) {
        Scanner entrada = new Scanner(System.in);
        printPedidos(listaPedidos);
        System.out.print("\nDigite o número do pedido que deseja gerenciar: ");
        int numeroPedido = entrada.nextInt();
                        
        PedidoAquisicao pedidoEscolhido = new PedidoAquisicao();
        for (PedidoAquisicao pedido : listaPedidos)
        {
            if(numeroPedido == pedido.getNumeroPedido())
            pedidoEscolhido = pedido;
        }
        System.out.print("Digite 1 para aprovar e 2 para rejeitar ou 0 para retornar - ");
        int escolha = entrada.nextInt();
        if (escolha == 1) {
            Date date = new Date(); 
            pedidoEscolhido.setStatus(Status.APROVADO);
            pedidoEscolhido.setDataConclusao(date);
        }
        if (escolha == 2)
            pedidoEscolhido.setStatus(Status.REJEITADO);
    }

    //MÉTODO PARA EXCLUIR PEDIDO
    public static void excluiPedido(int idUsuario, ArrayList<PedidoAquisicao> listaPedidos) {
        Scanner entrada = new Scanner(System.in);    
        printPedidos(listaPedidos);
        
        System.out.print("\nDigite o número do pedido que deseja remover: ");
        int numeroPedido = entrada.nextInt();

        PedidoAquisicao pedidoEscolhido = new PedidoAquisicao();
        for (PedidoAquisicao pedido : listaPedidos)
        {
            if(numeroPedido == pedido.getNumeroPedido())
            pedidoEscolhido = pedido;
        }
        Usuario solicitante = pedidoEscolhido.getUsuario();
        if(pedidoEscolhido.getStatus() == Status.PENDENTE && solicitante.getIdUsuario() == idUsuario) {
            listaPedidos.remove(pedidoEscolhido);
        }
        else {
            System.out.println("Apenas o usuario que solicitou o pedido pode excluí-lo");
        }
    }

    /*//////////////////////////////////////////////////////////////////////////////
                            MÉTODOS PARA ESTATISTICAS GERAIS                                       
    /////////////////////////////////////////////////////////////////////////////*/

}