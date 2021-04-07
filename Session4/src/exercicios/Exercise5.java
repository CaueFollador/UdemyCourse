package exercicios;

import java.util.Scanner;

//5. Refatorar o exercício 04, utilizando a estrutura switch.

public class Exercise5 {

	public static void main(String[] args) {
		
//		--soma quantos números dividem o número informado--
		int contador = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int num = entrada.nextInt();
		
		for(int i = 2; i < num; i++) {
			
			if(num % i == 0) {
				contador ++;
			}
		}
		
		switch(contador) {
		
		case 0:
			System.out.println(num + " é um número primo!");
			break;
		
		default:
			System.out.println(num + " não é um número primo!");
			break;	
		}
		
		entrada.close();
		
	}
}
