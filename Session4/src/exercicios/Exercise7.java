package exercicios;

import java.util.Scanner;

//7. Criar um programa que enquanto estiver recebendo n�meros positivos, imprime no console a soma dos n�meros inseridos, caso receba um n�mero negativo, encerre o programa. Tente utilizar a estrutura do while.

public class Exercise7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		
		while(num >= 0) {
			System.out.println("Informe um n�mero para somar. (n�mero negativo para sair)");
			num = entrada.nextInt();
			if(num >= 0) {
				soma += num;
				System.out.println("soma at� o momento: " + soma);
			}
		}
		
		System.out.println("Programa finalizado");
	}
}
