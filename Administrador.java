public class Administrador extends Usuario {
    public int idAdm;
   
    public Administrador(int idAdm){
         this.idAdm=idAdm;
    } 
    
   
   public int aprovaPedido(int numeroPedido){
      return numeroPedido;
   }
   
   public int getidAdm(){
       return idAdm;
   }
   
   }