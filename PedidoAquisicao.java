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
            valorTotalPedido += item.getValorUnitario()*item.getQuantidade(); 

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

    public void confirmaEntrega(int tipoUsuario) {
        if (tipoUsuario == 1) {
        this.status = Status.Finalizado;
        } else {};//aprimorar
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

    public void buscarPedido(int tipoUsuario){
        
        if (tipoUsuario == 1) {
        int menu;
        System.out.println("Selecione como você deseja fazer a busca dos pedidos");
        System.out.println("1.Buscar pedidos entre duas datas");
        System.out.println("2.Buscar pedidos de um funcionario");
        System.out.println("3.Buscar pedido pela descrição do item");
        //scanner
        switch(menu){
            case 1:
                System.out.println("Selecione um intervalo de tempo");
                
            case 2:
            //aprimorar
                System.out.println("Digite o id do funcionario");
                for (int i = 0; i < itens.size(); i++) {
                    if (itens.get(i).getNumero() == idFuncionario) {
                        return itens.get(i);
                    }
                    
                }

            case 3:
                System.out.println("Digite a descrição do item");
        }
        } else {};

    }

    @Override
    public String toString() {
        return "[Pedido nro: " + numeroPedido + "\nStatus: " + status + "\nDataPedido: " + dataPedido
                + "\nDataConclusao: " + dataConclusao + "\nidDepartamento: " + idDepartamento + "\nidUsuário: "
                + idUsuario + "\nValorTotalPedido: " + valorTotalPedido + "\nTipoUsuario: " + tipoUsuario + "\nItens: "
                + itens;
    }

}
