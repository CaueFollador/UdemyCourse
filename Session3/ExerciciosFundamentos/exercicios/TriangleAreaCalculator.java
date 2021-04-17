package exercicios;

import java.util.Scanner;

//5.	Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

//FÓRMULA: A = (b*h)/2

public class TriangleAreaCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a base do triângulo:");
		double base = scanner.nextDouble();
		
		System.out.println("Informe a altura do triângulo: ");
		double altura = scanner.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println("A Área do seu triângulo é: " + area);
		
		scanner.close();
	}

}
