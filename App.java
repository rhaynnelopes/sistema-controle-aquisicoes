import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println("SEJA BEM-VINDO!\n");
        exibirListaUsuarios(listaUsuarios);
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
                        menu++;                        
                        System.out.println("REGISTRO DE PEDIDO:\n");
                        registraPedido(userAtual, listaPedidos); 
                        break;
                        case 2:
                            menu++;
                            System.out.println("GERENCIAR REQUISIÇÕES:\n");
                            printPedidos(listaPedidos);
                            System.out.print("\nDigite o número do pedido que deseja gerenciar: ");
                            int numeroPedido = entrada.nextInt();
                            
                            PedidoAquisicao pedidoEscolhido = new PedidoAquisicao();
                            for (PedidoAquisicao pedido : listaPedidos)
                            {
                                if(numeroPedido == pedido.getNumeroPedido())
                                pedidoEscolhido = pedido;
                            }

                            System.out.print("Digite 1 para aprovar e 2 para rejeitar ou 0 para retornar");
                            int escolha = entrada.nextInt();
                            if (escolha == 1)
                                pedidoEscolhido.setStatus(Status.APROVADO);
                            if (escolha == 2)
                                pedidoEscolhido.setStatus(Status.REJEITADO);
                            if (escolha == 0)
                                menu--;
                            menu--;                      
                        break;
                        case 3:
                            menu++;
                            System.out.println("ESTATISTICAS GERAIS:\n");
                            printPedidos(listaPedidos);
                            //printPedidos();
                            //Número de pedidos total, divididos entre aprovados e reprovados (com percentuais)
                            //Número de pedidos nos últimos 30 dias e seu valor médio.
                            //Valor total de cada categoria nos últimos 30 dias
                            //Detalhes do pedido de aquisição de maior valor ainda aberto.
                        break;                            
                        case 0:
                            menu = 0;
                            System.out.println("valor menu = " + menu);
                            break;                    
                    }
                break;
                case 2:
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n0 - Voltar");
                    opcao = entrada.nextInt();
                    switch(opcao) {
                        case 1:
                            System.out.println("REGISTRO DE PEDIDO:\n");
                            menu++;                        
                            registraPedido(userAtual, listaPedidos);
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

    public static void registraPedido(Usuario userAtual, ArrayList<PedidoAquisicao> listaPedidos) {
        ArrayList<Item> listaItem = new ArrayList<Item>();

        PedidoAquisicao novoPedido = new PedidoAquisicao(pedido, userAtual, userAtual.getIdDepartamento(), listaItem);

        boolean lista = true;
        int total = 0;
        double valorTotal = 0;
        
        //loop para adicionar lista//
        while(lista = true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a descrição do produto: ");
            String descricao = entrada.next();
            
            System.out.println("Digite o valor do produto: ");
            double valor = entrada.nextDouble();
            
            System.out.println("Digite a quantidade: ");
            int quantidade = entrada.nextInt();
            listaItem.add(new Item(descricao, valor, quantidade));
            valorTotal = valorTotal + (valor * quantidade);
            System.out.println("Deseja adicionar mais um item?\n1 - sim\n2 - nao");
            int resposta = entrada.nextInt();

            if(resposta == 2) {
                lista = false;
                System.out.println("Itens Adicionados");
                novoPedido.setValorTotal(valorTotal);
                listaPedidos.add(novoPedido);
                pedido++; //atualiza para próximo id de pedido
                break;
            }                                
        }
    }
    
    public static void printPedidos(ArrayList<PedidoAquisicao> listaPedidos) {
        for (PedidoAquisicao pedido : listaPedidos) {
            System.out.println(pedido.toString());
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