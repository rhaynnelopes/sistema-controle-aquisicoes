import java.util.ArrayList;
import java.util.Date;
public class PedidoAquisicao {

    private int numeroPedido;
    private Status status;
    private Date dataPedido;
    private Date dataConclusao;
    private Usuario user;
    private int idDepartamento;
    private double valorTotal;
    private ArrayList<Item> itens;

    public PedidoAquisicao(int numeroPedido, Usuario user, int idDepartamento, ArrayList<Item> itens, Date dataPedido) {
        this.user = user;
        this.idDepartamento = idDepartamento;
        this.dataPedido = dataPedido;
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.status = status.PENDENTE;
        this.dataPedido = dataPedido;
    }

    public PedidoAquisicao() {
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if(this.status == Status.REJEITADO)
        {
            System.out.println("----------------------------------------");
            System.out.println("Impossível alterar produto já rejeitado!");
            System.out.println("----------------------------------------");
        }
        else {
            this.status = status;
        }
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public Usuario getUsuario(){
        return user;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public int getDepartamento(){
        return idDepartamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }   

    @Override
    public String toString() {
        return "[Pedido nro: " + numeroPedido + ", Status: " + status + ", DataPedido: " + dataPedido.toString()
                + ", DataConclusao: " + dataConclusao + ", ValorTotal: " + valorTotal + ", Itens: "
                + itens.toString();
    }
}