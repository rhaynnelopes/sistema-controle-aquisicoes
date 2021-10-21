import java.util.ArrayList;
import java.util.Date;

public class PedidoAquisicao {

    private static int count = 0;
    private int numeroPedido;
    private Status status;
    private Data dataPedido;
    private Data dataConclusao;
    private int idDepartamento;
    private int idUsuario;
    private Funcionario funcionario;
    private Departamento departamento;
    private double valorTotal = 0; // soma do valor total de todos itens;
    private int tipoUsuario;
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

    // public void buscarPedido(int tipoUsuario){
        
    //     if (tipoUsuario == 1) {
    //     int menu;
    //     System.out.println("Selecione como você deseja fazer a busca dos pedidos");
    //     System.out.println("1.Buscar pedidos entre duas datas");
    //     System.out.println("2.Buscar pedidos de um funcionario");
    //     System.out.println("3.Buscar pedido pela descrição do item");
    //     //scanner
    //     switch(menu){
    //         case 1:
    //             System.out.println("Selecione um intervalo de tempo");
                
    //         case 2:
    //         //aprimorar
    //             System.out.println("Digite o id do funcionario");
    //             for (int i = 0; i < itens.size(); i++) {
    //                 if (itens.get(i).getNumero() == idFuncionario) {
    //                     return itens.get(i);
    //                 }
                    
    //             }

    //         case 3:
    //             System.out.println("Digite a descrição do item");
    //     }
    //     } else {};

    // }

    @Override
    public String toString() {
        return "[Pedido nro: " + numeroPedido + ", Status: " + status + ", DataPedido: " + dataPedido
                + ", DataConclusao: " + dataConclusao + ", idDepartamento: " + idDepartamento + ", idUsuário: "
                + idUsuario + ", ValorTotal: " + valorTotal + ", TipoUsuario: " + tipoUsuario + ", Itens: "
                + itens;
    }

}
