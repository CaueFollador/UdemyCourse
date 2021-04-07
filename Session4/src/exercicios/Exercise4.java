package exercicios;

import java.util.Scanner;

//4. Criar um programa que receba um número e diga se ele é um número primo.

public class Exercise4 {

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
		
		if(contador >= 1) {
			System.out.println(num + " não é um número primo!");
		
		} else {
			System.out.println(num + " é um número primo!");
			
		}

		entrada.close();
		
	}
}
