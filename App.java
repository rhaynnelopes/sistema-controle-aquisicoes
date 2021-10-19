import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

        criarEExibirListaUsuarios(listaUsuarios);

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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione o usuario:"); //imprimir lista de usuarios, talvez
        int idUser = entrada.nextInt();
        
        //Atribuir opcao ao usuario atual
        //Após isto exibir menu
        //Se for ADM:
        System.out.println("Selecione a ação desejada: \n1 - registrar novo pedido\n2 - Aprovar pedido de aquisição");
        int opcao = entrada.nextInt();
        
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
        }
}
