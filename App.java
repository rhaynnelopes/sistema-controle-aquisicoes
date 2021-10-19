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
        listaUsuarios.add(new Usuario(01, 2, "Claudio Roberto", "CR", 3));
        listaUsuarios.add(new Usuario(02, 2, "Laura Fonseca", "LF", 2));
        listaUsuarios.add(new Usuario(03, 1, "Olvia Silva", "OS", 1));
        listaUsuarios.add(new Usuario(04, 2, "Alice Fonseca", "AF", 5));
        listaUsuarios.add(new Usuario(05, 1, "Amanda Rosa", "AR", 4));

    }

    private static void criarListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        listaDepartamentos.add(new Departamento(1, 200, "Financeiro", 3));
        listaDepartamentos.add(new Departamento(2, 100, "RH", 2));
        listaDepartamentos.add(new Departamento(3, 100, "Engenharia", 1));
        listaDepartamentos.add(new Departamento(4, 200, "Manutencao", 5));
        listaDepartamentos.add(new Departamento(5, 100, "Administrativo", 4));

    }

    private static void exibirListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.toString());
        }
    }

    private static void exibirListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        for (Departamento departamento : listaDepartamentos) {
            System.out.println(departamento.toString());
        }
    }

}
