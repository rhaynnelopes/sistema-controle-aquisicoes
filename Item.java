public class Item extends PedidoAquisicao {
    // numero pedido e valor total já vao ta incluso.
    //  No pedido aquisição tem valorTotal diferente do total do item?
    // se for igual, so deixar com o mesmo nome
    
    private String Descricao;
    private  double ValorUnitario;
    private int Quantidade;
    
    public String getDescricao(){
        return Descricao;
    }
    
    public String setDescricao(String d){
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