package exercicios;

import java.util.Scanner;

//2.	Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

//FORMULA: C= (F-32) * 5/9

public class ConvertFarenheintToCelsius {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fahrenheint: ");
		double fahrenheint = scanner.nextDouble();
		
		double celsius = (fahrenheint-32) * (5/9);
		
		System.out.printf("A temperatural %.2fº, em Celsius, é igual a: %.2f", fahrenheint, celsius);
		
		scanner.close();
	}
}
