public class Item{
    // numero pedido e valor total já vao ta incluso.
    //  No pedido aquisição tem valorTotal diferente do total do item?
    // se for igual, so deixar com o mesmo nome
    
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
    }