import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Usuario listaUsuarios = new Usuario();
        
        listaUsuarios.cadastroUsuario(new Usuario (01, 2, "Claudio Roberto", "CR", 3));
        listaUsuarios.cadastroUsuario(new Usuario (02, 2, "Laura Fonseca", "LF", 2));
        listaUsuarios.cadastroUsuario(new Usuario (03, 1, "Alice Silva", "AS", 1));


    
        // int usuarioLogado;
        // Scanner in = new Scanner(System.in);

        System.out.println("Selecione o seu usuário (insira o ID do usuário escolhido):");
        //ListaUsuarios.imprimeLista();
        //usuarioLogado = in.nextInt();


    }
    
}


