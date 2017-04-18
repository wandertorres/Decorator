import concreto.Cafe;
import concreto.Canela;
import concreto.Chocolate;
import concreto.Creme;
import concreto.Leite;
import interfaci.Bebida;

public class Main {

	public static void main(String[] args) {
		Bebida bebidaDeJhoanes = new Creme(
                new Chocolate(
                new Leite(
                new Canela(new Cafe()))));
        System.out.println("Você pediu: "+bebidaDeJhoanes.getDescricao());
        System.out.println("Custou: R$ "+bebidaDeJhoanes.custo());
	}

}
