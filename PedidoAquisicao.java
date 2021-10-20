import java.util.ArrayList;

public class PedidoAquisicao {
    
    private static int numeroPedido;
    private Status status;
    private String dataPedido;
    private String dataConclusao;
    private int idDepartamento;
    private int idUsuario;
    private double valorTotal;
    private int tipoUsuario;
    //private ArrayList<Item> itens;

    public PedidoAquisicao(int idUsuario,int idDepartamento, String dataPedido, int tipoUsuario, double valorTotal){
       // itens = new ArrayList<Item>();
        numeroPedido++;
        this.idUsuario=idUsuario;
        this.idDepartamento=idDepartamento;
        this.dataPedido=dataPedido;
        this.dataConclusao=null;

        //Aprimorar
        if(tipoUsuario == 1){
            status = Status.Aprovado;
        }else{
            status = Status.Pendente;
        }
        //Limitar valor total

    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public boolean remocaoPedido(int idUsuario, int numeroPedido){
        return true;

    }

    
    
    







}