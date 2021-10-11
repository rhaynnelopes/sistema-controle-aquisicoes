import java.util.ArrayList;
public class Usuario {

    Usuario ListaUsuarios [] = new Usuario [15];

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

    // Verificar se o ID inserido no login de usuário é válido (se existe na base)
       /* public Usuario pesquisarID (int idUsuario) {
            for(int i=0; i < usuarioCadastrado ; i++){
                if(ListaUsuarios[i].getIdUsuario() == idUsuario){
                     return ListaUsuarios[i];
     
                 }
             }
             return null;
         }
         */

         public boolean adicionaFuncionario (Usuario usuario){
            if(proxPosicao == 15){
            System.out.println("Já está cheio");
            return false;
            } else {
                this.ListaUsuarios[proxPosicao] = usuario;
                this.proxPosicao++;
                System.out.println("Usuário adicionário");
                return true;
            }
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

    public void imprimeLista(){
        for(int i = 0; i < this.proxPosicao; i++){
            System.out.println(this.ListaUsuarios[i]);
        }
    }


    @Override
    public String toString() {
        return "Usuario [departamento=" + departamento + ", idUsuario=" + idUsuario + ", nome=" + nome
                + ", tipoUsuario=" + tipoUsuario + "]";
    }

    

}