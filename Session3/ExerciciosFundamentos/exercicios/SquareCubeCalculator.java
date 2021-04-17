package exercicios;

import java.util.Scanner;

//4.	Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

public class SquareCubeCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		double num = scanner.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		
		double cubo = Math.pow(num, 3);
		
		System.out.printf("%.0f² = %.0f\n%.0f³ = %.0f",num,quadrado,num,cubo);
		
		scanner.close();
	}
}
