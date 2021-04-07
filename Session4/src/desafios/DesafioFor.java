package desafios;

/*
 * DESAFIO: fazer um laço for de 5 repetições, sem usar valor numérico pra controlar o laço
 */

public class DesafioFor {

	public static void main(String[] args) {
		
		for(String valor = "#"; !valor.equals("######");valor+="#") {
			System.out.println(valor);
		}
	}
}
