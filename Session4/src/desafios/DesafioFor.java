package desafios;

/*
 * DESAFIO: fazer um la�o for de 5 repeti��es, sem usar valor num�rico pra controlar o la�o
 */

public class DesafioFor {

	public static void main(String[] args) {
		
		for(String valor = "#"; !valor.equals("######");valor+="#") {
			System.out.println(valor);
		}
	}
}
