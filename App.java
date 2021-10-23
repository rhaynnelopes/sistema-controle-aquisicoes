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
    ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();
    criarListaUsuarios(listaUsuarios);
    criarListaDepartamentos(listaDepartamentos);

    do {
        clearScreen();
        System.out.println("SEJA BEM-VINDO!");
        exibirListaUsuarios(listaUsuarios);
        System.out.print("Selecione seu usuario pelo id: ");

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
                            System.out.println("Digite o tópico desejado:");
                            System.out.println("1 - Buscar pedido por Funcionario");
                            System.out.println("2 - Buscar pedido por Descricao");
                            System.out.println("3 - Listar pedidos aprovados");
                            System.out.println("4 - Listar pedidos reprovados");
                            System.out.println("5 - Listar média pedidos por mes");
                            System.out.println("6 - Listar total da categoria por mês");
                            System.out.println("7 - Exibir maior aquisição pendente");
                            opcao = entrada.nextInt();
                            switch (opcao) {
                                case 1:
                                /*    
                                System.out.println("Digite o ID do funcionario: ");
                                    int id = entrada.nextInt();
                                    //for 
                                    for (int i = 0; i < listaPedidos.size(); i++) {

                                        if (listaPedidos.get(i).getUsuario().getIdUsuario() == I) {
                                            System.out.println(listaPedidos.get(i).toString());
                                        } else {
                                            System.out.println("Nenhum pedido encontrado");
                                            menu = 1;
                                        }
                                    }*/
                                    System.out.println("passei por aqui ");
                                    break;
                                case 2:
                                    System.out.println("ba arram");
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                case 6:
                                    break;
                                case 7:
                                    break;
                                }
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


    private static void criarEExibirListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        criarListaDepartamentos(listaDepartamentos);
        exibirListaDepartamentos(listaDepartamentos);
    }

    private static void criarListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        listaUsuarios.add(new Usuario(1, 2, "Claudio Roberto", "CR", 3));
        listaUsuarios.add(new Usuario(2, 2, "Laura Fonseca", "LF", 2));
        listaUsuarios.add(new Usuario(3, 1, "Olivia Silva", "OS", 1));
        listaUsuarios.add(new Usuario(4, 2, "Alice Fonseca", "AF", 5));
        listaUsuarios.add(new Usuario(5, 1, "Amanda Rosa", "AR", 4));
        listaUsuarios.add(new Usuario(6, 2, "Ana Paula Correia", "APC", 3));
        listaUsuarios.add(new Usuario(7, 1, "Roberto Oliveira", "RO", 2));
        listaUsuarios.add(new Usuario(8, 1, "Giovani Pacheco", "GP", 5));
        listaUsuarios.add(new Usuario(9, 2, "Mariane Siqueira", "MS", 1));
        listaUsuarios.add(new Usuario(10, 1, "Marcia Gomes", "MG", 4));
        listaUsuarios.add(new Usuario(11, 2, "Helena Albuquerque", "HA", 2));
        listaUsuarios.add(new Usuario(12, 2, "Carlos Cunha", "CC", 1));
        listaUsuarios.add(new Usuario(13, 1, "Rita Cabedo", "RC", 5));
        listaUsuarios.add(new Usuario(14, 2, "Valentina Barros", "VB", 3));
        listaUsuarios.add(new Usuario(15, 2, "Matheus Ramos", "MR", 4));

        
    }

    private static void criarListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        listaDepartamentos.add(new Departamento(1, 200, "Financeiro", 03));
        listaDepartamentos.add(new Departamento(2, 100, "RH", 05));
        listaDepartamentos.add(new Departamento(3, 100, "Engenharia", 03));
        listaDepartamentos.add(new Departamento(4, 200, "Manutencao", 03));
        listaDepartamentos.add(new Departamento(5, 100, "Administrativo", 05));


    }

    private static void exibirListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        System.out.println("\n--------------------\n");

        System.out.println("Lista de funcionários:");

        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        
        }
    
    }

    private static void exibirListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        System.out.println("\n--------------------\n");
        for (Departamento departamento : listaDepartamentos) {
            System.out.println(departamento.toString());
        
        }
    
    }
    /*
    private static void criarListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        listaDepartamentos.add(new Departamento(1, 200, "Financeiro", 03));
        listaDepartamentos.add(new Departamento(2, 100, "RH", 05));
        listaDepartamentos.add(new Departamento(3, 100, "Engenharia", 03));
        listaDepartamentos.add(new Departamento(4, 200, "Manutencao", 03));
        listaDepartamentos.add(new Departamento(5, 100, "Administrativo", 05));
    }
*/
/*
    private static void exibirListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        System.out.println("\n--------------------\n");
        System.out.println("Lista de departamentos:");
        for (Departamento departamento : listaDepartamentos) {
            System.out.println(departamento.toString());
        }
        System.out.printf("\n");
    }
*/
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
