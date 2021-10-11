
    public class Administrador extends Usuario {
        public int idAdm;
       
        public Administrador(int idAdm){
         this.idAdm=idAdm;
         }  // não ta funcionando o construtor do administrador
        
       
       public boolean aprovaPedido(int numeroPedido){
          return numeroPedido;
          //mudar
       }
       
       public int getidAdm(){
           return idAdm;
       }
       
       }

