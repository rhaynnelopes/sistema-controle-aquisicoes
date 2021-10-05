public class Usuario {
    
    int idUsuario = 0;
    String nome = " ";
    int departamento = 0;


    public Usuario(int idUsuario, String nome, int departamento) {

        this.idUsuario = idUsuario;
        this.nome = nome;
        this.departamento = departamento;
    }


    public int getIdUsuario() {
        return idUsuario;
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

    

}