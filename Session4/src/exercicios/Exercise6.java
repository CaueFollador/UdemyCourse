package exercicios;

import java.util.Scanner;

//6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado.

public class Exercise6 {

	public static void main(String[] args) {
		
		int chances = 10;
		int resposta = 23;

		System.out.println("---JOGO DA ADIVINHAÇÃO---");
		System.out.println("Bem vindo ao jogo da adivinhação.\nVocê terá 10 chances para adivinhar qual a senha para poder concluir esse jogo.\nNós daremos dicas para ajudá-lo a adivinhar a resposta. E aqui vai a primeira dica:\n\nA RESPOSTA É UM NÚMERO ENTRE 0 - 100\n");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu palpite:");
		int palpite = entrada.nextInt();
		
		while(chances != 0 && palpite != resposta) {
			if(palpite > 100 || palpite < 0) {
				System.out.println("Palpite inválido! Tente um número entre 0 e 100");
			} else {
				chances --;
				if(palpite > resposta) {
					System.out.printf("Você não acertou a senha para sair, seu palpite foi maior que a resposta!\nVocê tem mais %d chances para tentar\n", chances);
					
				} else {
					System.out.printf("Você não acertou a senha para sair, seu palpite foi menor que a resposta!\nVocê tem mais %d chances para tentar\n", chances);
					
				}				
			}
			
			System.out.println("Informe seu novo palpite:");
			palpite = entrada.nextInt();
		}
		if(chances == 0) {
			System.out.println("Você não conseguiu cumprir o desafio");
		} else {
			System.out.println("PARABÉNS!!! Você conseguiu concluir o desafio!!!");
			
		}
	
		entrada.close();
	}
}
