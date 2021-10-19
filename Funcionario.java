public class Funcionario extends Usuario{

    protected int idUsuario;

    public Funcionario(int idUsuario){
        super(nome, idUsuario, idDepartamento) //Chama os parâmetros da classe mãe;
    }

    public int solicitaPedido() {
        return 0;
    }   

    public int getIdUsuario() {
        return idUsuario; 
    }

}

