

public class Usuario {
 
    protected int idUsuario = 0;
    protected int tipoUsuario = 0;
    protected String nome = " ";
    protected String iniciais = " "; 
    protected int idDepartamento = 0;
    protected int usuarioCadastrado = 0;
    protected int proxPosicao; 


    public Usuario(int idUsuario, int tipoUsuario, String nome, String iniciais, int idDepartamento) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.iniciais = iniciais;
        this.idDepartamento = idDepartamento;
    }

    public int getIdUsuario() {

        return idUsuario;
    }
   
    public int getTipoUsuario() {

        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIniciais() {
        return iniciais;
    }


    public int getIdDepartamento() {
        return idDepartamento;
    }


    public void setDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    //int idUsuario, int tipoUsuario, String nome, String iniciais, int idDepartamento
    @Override
    public String toString() {
        return "Usuario [ID: " + idUsuario + ", Tipo: " + tipoUsuario + ", Nome: " + nome
                + ", Departamento: " + idDepartamento + "]";
    }
}