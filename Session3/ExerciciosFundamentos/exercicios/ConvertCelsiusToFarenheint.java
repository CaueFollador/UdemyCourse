package exercicios;

import java.util.Scanner;

//1.	Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

//F�RMULA CELSIUS PARA FAHRENHEINT: F = (C * 1,8) + 32

public class ConvertCelsiusToFarenheint {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheint = (celsius * 1.8) + 32;
		
		System.out.printf("A temperatura %.2f� Celsius, em fahrenheint, � igual a: %.2f�", celsius, fahrenheint);
		
		scanner.close();
	}
}
