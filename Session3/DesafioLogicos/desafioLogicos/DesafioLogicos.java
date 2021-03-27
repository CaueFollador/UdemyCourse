package desafioLogicos;

//DESAFIO: Criar o racioc�nio l�gico para o seguinte cen�rio:

//Voc� tem 2 trabalhos para serem confirmados
//Se os 2 trabalhos derem certo, voc� e sua fam�lia v�o ao shopping comprar uma TV de 52 polegadas
//Se somente 1 trabalho der certo, voc� e sua fam�lia v�o comprar uma TV de 30 polegadas
//Se ao menos 1 trabalho der certo, sua fam�lia ganhar� sorvete ao ir ao shopping
//O �nico cen�rio totalmente negativo � se nenhum dos dois trabalhos der certo

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
