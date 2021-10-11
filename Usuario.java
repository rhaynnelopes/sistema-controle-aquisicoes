import java.util.ArrayList;
public class Usuario {
    
    Usuario ListaUsuarios [] = new Usuario [15];

    protected int idUsuario = 0;
    protected int tipoUsuario = 0;
    protected String nome = " ";
    protected int departamento = 0;
    protected int usuarioCadastrado = 0;

    public Usuario(int idUsuario, int tipoUsuario, String nome, int departamento) {
        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.departamento = departamento;
    }


    public int getIdUsuario() {

        return idUsuario;
    }

        public Usuario pesquisarID (int idUsuario) {
            for(int i=0; i < usuarioCadastrado ; i++){
                if(ListaUsuarios[i].getIdUsuario() == idUsuario){
                     return ListaUsuarios[i];
     
                 }
             }
             return null;
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


    @Override
    public String toString() {
        return "Usuario [departamento=" + departamento + ", idUsuario=" + idUsuario + ", nome=" + nome
                + ", tipoUsuario=" + tipoUsuario + "]";
    }

    

}