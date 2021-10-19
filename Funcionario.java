public class Funcionario extends Usuario{

    protected int idUsuario;

    public Funcionario(String nome, int idUsuario, int idDepartamento){
        super(nome, idUsuario, idDepartamento); //Chama os parâmetros da classe mãe;
    }

    public int solicitaPedido() {
        return 0;
    }   

    public int getIdUsuario() {
        return idUsuario; 
    }

}

