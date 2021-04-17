package exercicios;

import java.util.Scanner;

//3.	Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

//FORMULA IMC: MC = p/(h*h)

public class IMCCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu peso: ");
		double peso = scanner.nextDouble();
		
		System.out.println("Informe a sua altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso/(altura*altura);
		
		System.out.println("Seu IMC é de: " + imc);
		
		scanner.close();
	}
}
