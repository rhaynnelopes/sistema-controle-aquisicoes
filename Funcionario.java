public class Funcionario extends Usuario{

    protected int idUsuario;

    public Funcionario(int idUsuario, int tipoUsuario, String nome, String iniciais, int idDepartamento){
        super(idUsuario, tipoUsuario, nome, iniciais, idDepartamento); //Chama os parâmetros da classe mãe;
    }

    public int solicitaPedido() {
        return 0;
    }   

    public int getIdUsuario() {
        return idUsuario; 
    }

}

