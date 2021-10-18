public class PedidoAquisicao {
    
    private int numeroPedido;
    private boolean status;
    private String dataPedido;
    private String dataConclusao;
    private int idDepartamento;
    private int idUsuario;
    private double valorTotal;

    public PedidoAquisicao(){

        

    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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