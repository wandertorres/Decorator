package interfaci;

public abstract class Bebida {
    protected String descricao;
    
    public abstract double custo();

    public String getDescricao() {
        return descricao;
    }
    
}

