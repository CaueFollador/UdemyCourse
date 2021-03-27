package desafioLogicos;

//DESAFIO: Criar o raciocínio lógico para o seguinte cenário:

//Você tem 2 trabalhos para serem confirmados
//Se os 2 trabalhos derem certo, você e sua família vão ao shopping comprar uma TV de 52 polegadas
//Se somente 1 trabalho der certo, você e sua família vão comprar uma TV de 30 polegadas
//Se ao menos 1 trabalho der certo, sua família ganhará sorvete ao ir ao shopping
//O único cenário totalmente negativo é se nenhum dos dois trabalhos der certo

public class DesafioLogicos {

	public static void main(String[] args) {
	
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv52 = trabalho1 && trabalho2;
		boolean tv30 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("Comprou a TV de 52? " + tv52);
		System.out.println("Comprou a TV de 30? " + tv30 );
		System.out.println("Tomou sorvete no shopping? " + sorvete);
	}
}
