package concreto;

import decorator.Adicional;
import interfaci.Bebida;

public class Canela extends Adicional {

    public Canela(Bebida p_bebida) {
        bebida = p_bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Canela";
    }
    
    @Override
    public double custo() {
        return 1.80 + bebida.custo();
    }
    
}
