

public class Usuario {
 
    protected int idUsuario = 0;
    protected int tipoUsuario = 0;
    protected String nome = " ";
    protected String iniciais = " "; 
    protected int departamento = 0;
    protected int usuarioCadastrado = 0;
    protected int proxPosicao; 


    public Usuario(int idUsuario, int tipoUsuario, String nome, String iniciais, int departamento) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.departamento = departamento;
    }

    public Usuario() {

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


    public int getDepartamento() {
        return departamento;
    }


    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Usuario [ID: " + idUsuario + ", tipo: " + tipoUsuario + ", nome: " + nome
                + ", departamento: " + departamento + "]";
    }

}