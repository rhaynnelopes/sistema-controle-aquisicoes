import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        ArrayList<Departamento> listaDepartamentos = new ArrayList<Departamento>();

        criarEExibirListaUsuarios(listaUsuarios);
        criarEExibirListaDepartamentos(listaDepartamentos);
    }

    private static void criarEExibirListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        criarListaUsuarios(listaUsuarios);
        exibirListaUsuarios(listaUsuarios);
    }

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

}
