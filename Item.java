public class Item extends PedidoAquisicao {
    // numero pedido e valor total já vao ta incluso.
    //  No pedido aquisição tem valorTotal diferente do total do item?
    // se for igual, so deixar com o mesmo nome
    
    private String descricao;
    private  double valorUnitario;
    private int quantidade;
    
    public Item(int quantidade, double valorUnitario, String descricao){
        this.quantidade=quantidade;
        this.valorUnitario=valorUnitario;
        this.descricao=descricao;
   } 
   
    public String getdDescricao(){
        return descricao;
    }
    
    public String setDescricao(String d){
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