public class Item {
    private String descricao;
    private  double valorUnitario;
    private int quantidade;

    public Item(String descricao, double valorUnitario, int quantidade){
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String d){
        this.descricao = d;
    }

    public double getValorUnitario(){
        return valorUnitario;
    }

    public void setValorUnitario(double vu){
        this.valorUnitario = vu;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int q){
        this.quantidade = q;
    }

    @Override
    public String toString() {
        return "[Descrição: " + descricao + ", Valor: " + valorUnitario + ", Quantidade]";
    }
    }