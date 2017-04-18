package concreto;

import interfaci.Bebida;

public class Customizavel extends Bebida {

    public Customizavel() {
        descricao = "Bebida Customizável";
    }
    
    @Override
    public double custo() {
        return 10.0;
    }
    
}
