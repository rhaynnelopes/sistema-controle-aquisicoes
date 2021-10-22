import java.util.ArrayList;

public class PedidoAquisicao {

    private int numeroPedido;
    private Status status;
    private Data dataPedido;
    private Data dataConclusao;
    private Usuario user;
    private int idDepartamento;
    private double valorTotal;
    private ArrayList<Item> itens;

    public PedidoAquisicao(int numeroPedido, Usuario user, int idDepartamento, ArrayList<Item> itens) {
        this.user = user;
        this.idDepartamento = idDepartamento;
        this.dataPedido = dataPedido;
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.status = status.PENDENTE;
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
        this.status = status;
    }

    public Data getDataPedido() {
        return dataPedido;
    }

    public Usuario getUsuario(){
        return user;
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
        return "[Pedido nro: " + numeroPedido + ", Status: " + status + ", DataPedido: " + dataPedido
                + ", DataConclusao: " + dataConclusao + ", ValorTotal: " + valorTotal + ", Itens: "
                + itens.toString();
    }
}