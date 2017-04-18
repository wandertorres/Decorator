package concreto;

import decorator.Adicional;
import interfaci.Bebida;

public class Creme extends Adicional {

    public Creme(Bebida p_bebida) {
        bebida = p_bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Creme";
    }
    
    @Override
    public double custo() {
        return 10.0 + bebida.custo();
    }
    
}
