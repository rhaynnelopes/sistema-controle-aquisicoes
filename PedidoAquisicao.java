import java.util.ArrayList;

public class PedidoAquisicao {

    private static int count = 0;
    private int numeroPedido;
    private Status status;
    private Data dataPedido;
    private Data dataConclusao;
    private int idDepartamento;
    private int idUsuario;
    private double valorTotalPedido = 0; // soma do valor total de todos itens;
    private int tipoUsuario;
    private ArrayList<Item> itens;

    public PedidoAquisicao(int idUsuario, int idDepartamento, Data dataPedido, int tipoUsuario) {
        itens = new ArrayList<Item>();
        count++;
        numeroPedido = count;
        this.idUsuario = idUsuario;
        this.idDepartamento = idDepartamento;
        this.dataPedido = dataPedido;
        this.dataConclusao = null;
        if (tipoUsuario == 1) {
            status = Status.Aprovado;
        } else {
            status = Status.Pendente;
        }
    }

    public boolean insereItem(Item item) {
        if (status == Status.Pendente) {
            itens.add(item);
            // valorTotalPedido += item.getValorTotal(); // valor unitário*quantiade do item

            return true;
        } else {
            return false;
        }
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Status getStatus() {
        return status;
    }

    public boolean setStatus(Status status) {
        if (tipoUsuario == 1) {
            this.status = status;
            return true;
        } else
            return false;
    }

    public Data getDataPedido() {
        return dataPedido;
    }

    public void confirmaEntrega() {
        this.status = Status.Finalizado;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public boolean remocaoPedido(int idUsuario, int numeroPedido) {
        if (this.idUsuario == idUsuario && this.numeroPedido == numeroPedido) {
            // ????
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return "[Pedido nro: " + numeroPedido + "\nStatus: " + status + "\nDataPedido: " + dataPedido
                + "\nDataConclusao: " + dataConclusao + "\nidDepartamento: " + idDepartamento + "\nidUsuário: "
                + idUsuario + "\nValorTotalPedido: " + valorTotalPedido + "\nTipoUsuario: " + tipoUsuario + "\nItens: "
                + itens;
    }

}