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
        return Descricao;
    }
    
    public void setDescricao(String d){
        this.Descricao = d;
    }
    
    public double getValorUnitario(){
        return ValorUnitario;
    }
    
    public void setValorUnitario(double vu){
        this.ValorUnitario = vu;
    }
    
    public int getQuantidade(){
        return Quantidade;
    }
    
    public void setQuantidade(int q){
        this.Quantidade = q;
    }
    }