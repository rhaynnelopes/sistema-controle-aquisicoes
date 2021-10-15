import java.util.ArrayList;

public class Usuario {

   private ArrayList<Usuario> usuario;
   
   public Usuario() {
       usuario = new ArrayList<Usuario>();
   }

   public boolean cadastroUsuario (Usuario usuario) {
       if(usuario == null) {
            return false;
       }
       return true;
    } 
        
   

    protected int idUsuario = 0;
    protected int tipoUsuario = 0;
    protected String nome = " ";
    protected int departamento = 0;
    protected int usuarioCadastrado = 0;
    protected int proxPosicao; 


    public Usuario(int idUsuario, int tipoUsuario, String nome, int departamento) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.departamento = departamento;
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


    public int getDepartamento() {
        return departamento;
    }


    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    // public void imprimeLista(){
    //     for(int i = 0; i < this.proxPosicao; i++){
    //         System.out.println(this.ListaUsuarios[i]);
    //     }
    // }


    @Override
    public String toString() {
        return "Usuario [departamento=" + departamento + ", idUsuario=" + idUsuario + ", nome=" + nome
                + ", tipoUsuario=" + tipoUsuario + "]";
    }

}