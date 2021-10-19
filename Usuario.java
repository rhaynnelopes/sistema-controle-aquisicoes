import java.util.ArrayList;

public class Usuario {
    
   private ArrayList<Usuario> usuarios;
   
   public Usuario() {
       usuarios = new ArrayList<Usuario>();
   }
        
    protected int idUsuario = 0;
    protected int tipoUsuario = 0;
    protected String nome = " ";
    protected String iniciais = " "; 
    protected int idDepartamento = 0;
    protected int usuarioCadastrado = 0;
    protected int proxPosicao; 


    public Usuario(int idUsuario, int tipoUsuario, String nome, String iniciais, int departamento) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.iniciais = iniciais;
        this.idDepartamento = idDepartamento;
    }

    public boolean cadastroUsuario (Usuario usuario) {
        if(usuario == null) {
             return false;
        }
        return usuarios.add(usuario);
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


    @Override
    public String toString() {
        return "Usuario [departamento=" + idDepartamento + ", idUsuario=" + idUsuario + ", nome=" + nome
                + ", tipoUsuario=" + tipoUsuario + "]";
    }

}