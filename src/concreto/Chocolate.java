package concreto;

import decorator.Adicional;
import interfaci.Bebida;

public class Chocolate extends Adicional {

    public Chocolate(Bebida p_bebida) {
        bebida = p_bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Chocolate";
    }
    
    @Override
    public double custo() {
        return 8.0 + bebida.custo();
    }
    
}
