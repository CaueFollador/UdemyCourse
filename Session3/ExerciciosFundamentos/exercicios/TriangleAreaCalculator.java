package exercicios;

import java.util.Scanner;

//5.	Criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea.

//F�RMULA: A = (b*h)/2

public class TriangleAreaCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a base do tri�ngulo:");
		double base = scanner.nextDouble();
		
		System.out.println("Informe a altura do tri�ngulo: ");
		double altura = scanner.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println("A �rea do seu tri�ngulo �: " + area);
		
		scanner.close();
	}

}
