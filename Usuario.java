public class Usuario {
    
    int idUsuario = 0;
    int tipoUsuario = 0;
    String nome = " ";
    int departamento = 0;


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


    @Override
    public String toString() {
        return "Usuario [departamento=" + departamento + ", idUsuario=" + idUsuario + ", nome=" + nome
                + ", tipoUsuario=" + tipoUsuario + "]";
    }

    

}