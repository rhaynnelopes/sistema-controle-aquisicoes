public class Administrador extends Usuario {
    private int idAdm;
   
    public Administrador(int idAdm, int tipoUsuario, String nome, String iniciais, int idDepartamento){
        super(idAdm, tipoUsuario, nome, iniciais, idDepartamento);
    } 
    
   
   public int aprovaPedido(int numeroPedido){
      return numeroPedido;
   }
   
   public int getidAdm(){
       return idAdm;
   }
   
   }