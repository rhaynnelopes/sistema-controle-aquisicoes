import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    int menu = 0;
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    Scanner entrada = new Scanner(System.in);

    do {
        System.out.println("valor menu = " + menu);
        System.out.println("SEJA BEM-VINDO!\n");
        criarEExibirListaUsuarios(listaUsuarios);
        System.out.println("\n\nSelecione seu usuario pelo id:");

        int idUser = entrada.nextInt();
        Usuario userAtual = new Usuario();
        
        menu++;

        System.out.println("valor menu = " + menu);
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
                    System.out.println("valor menu = " + menu);
                    System.out.println(menu);
                    switch(opcao) {
                        case 1:
                            System.out.println("REGISTRO DE PEDIDO:\n");
                            //selecionar item por id
                            //selecionar quantidade
                        break;
                        case 2:
                            System.out.println("GERENCIAR REQUISIÇÕES:\n");
                            //lista de pedidos
                            //selecionar id do pedido 
                            //case 1 ou para aprovar ou 2 para rejeitar
                        break;
                        case 3:
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
                    System.out.println("Olá " + userAtual.getNome() + ", selecione a ação desejada: \n1 - Registrar novo pedido\n2 - Aprovar pedido de aquisição\n0 - Voltar");
                    opcao = entrada.nextInt();                    
                    System.out.println("valor menu = " + menu);
                    switch(opcao) {
                        case 1:
                            System.out.println("REGISTRO DE PEDIDO:\n");
                            //selecionar item por id
                            //selecionar quantidade
                        break;
                        case 0:
                            menu--;
                            System.out.println("valor menu = " + menu);
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
}
