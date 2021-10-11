public class Item extends PedidoAquisicao {
    // numero pedido e valor total já vao ta incluso.
    //  No pedido aquisição tem valorTotal diferente do total do item?
    // se for igual, so deixar com o mesmo nome
    
    protected String Descricao;
    protected  int ValorUnitario;
    protected int Quantidade;
    
    public String getDescricao(){
        return Descricao;
    }
    
    public String settDescricao(){
        return Descricao;
    }
    
    public int getValorUnitario(){
        return ValorUnitario;
    }
    
    public int setValorUnitario(){
        return ValorUnitario;
    }
    
    public int getQuantidade(){
        return Quantidade;
    }
    
    public int setQuantidade(){
        return Quantidade;
    }
    
    }

    //adiconando luiza.