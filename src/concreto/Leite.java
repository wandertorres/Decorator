package concreto;

import decorator.Adicional;
import interfaci.Bebida;

public class Leite extends Adicional {

    public Leite(Bebida p_bebida) {
        bebida = p_bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Leite";
    }
    
    @Override
    public double custo() {
        return 20.0 + bebida.custo();
    }
    
}
