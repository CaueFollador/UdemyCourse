package exercicios;

import java.util.Scanner;

//9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

public class Exercise9 {

	public static void main(String[] args) {
		
		int mainValue = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Informe o %dº número:\n", i);
			int numero = entrada.nextInt();
			
			if(numero > mainValue) {
				mainValue = numero;
			}
		}
		System.out.println("O maior número foi: " + mainValue);
		
		entrada.close();
	}
}
