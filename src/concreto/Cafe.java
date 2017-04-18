package concreto;

import interfaci.Bebida;

public class Cafe extends Bebida {
	
	public Cafe() {
        descricao = "Café";
    }

	@Override
	public double custo() {
		return 15.0;
	}

}
