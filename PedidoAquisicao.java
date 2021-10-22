java import java.util.ArrayList;

public class PedidoAquisicao {

    private int numeroPedido;
    private Status status;
    private Data dataPedido;
    private Data dataConclusao;
    private Funcionario funcionario;
    private Departamento departamento;
    private double valorTotal = 0; // soma do valor total de todos itens;
    private ArrayList<Item> itens;

    public PedidoAquisicao(Funcionario funcionario, Departamento departamento, Data dataPedido, int numeroPedido, ArrayList<Item> itens, Status status) {
        this.funcionario = funcionario;
        this.departamento = departamento;
        this.dataPedido = dataPedido;
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.status = status;
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

    public Funcionario getFuncionario(){
        return funcionario;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    @Override
    public String toString() {
        return "[Pedido nro: " + numeroPedido + ", Status: " + status + ", DataPedido: " + dataPedido
                + ", DataConclusao: " + dataConclusao + ", ValorTotal: " + valorTotal + ", Itens: "
                + itens;
    }
}