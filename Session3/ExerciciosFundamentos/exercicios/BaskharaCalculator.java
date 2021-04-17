package exercicios;

import java.util.Scanner;

//6.	Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0) utilizando a f�rmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

//BHASKARA: Delta = b�-4.a.c

public class BaskharaCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de a: ");
		double a = scanner.nextDouble();
		
		System.out.println("Informe o valor de b: ");
		double b = scanner.nextDouble();
		
		System.out.println("Informe o valor de c: ");
		double c = scanner.nextDouble();
		
		double delta = ((Math.pow(b, 2))-4 * a * c);
		
		System.out.println("O valor de delta �: " + delta);
		
		scanner.close();
	}
}
