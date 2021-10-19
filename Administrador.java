public class Administrador extends Usuario {
    public int idAdm;
   
    public Administrador(int idAdm){
         this.idAdm=idAdm;
    } 
    
   
   public boolean aprovaPedido(int numeroPedido){
      return numeroPedido;
      //mudar
   }
   
   public int getidAdm(){
       return idAdm;
   }
   
   }