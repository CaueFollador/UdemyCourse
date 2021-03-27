package DesafioCalculadora;

import java.util.Scanner;

//receber 2 números do usuário através do terminal
//receber o símbolo da operação que o usuário irá executar (+, -, *, /)
//DESAFIO: só pode se utilizar o que foi ensinado no curso até o momento (sem if, sem for, sem conteúdos mais avançados)

public class DesafioCalculadora {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		double val1 = scanner.nextDouble();
		
		System.out.println("Informe o segundo valor:");
		double val2 = scanner.nextDouble();
		
		System.out.println("Informe a operação: ( + | - | * | / )");
		String opera = scanner.next();
		
		double resultado = opera.equals("+") ? val1 + val2 : 0;
		resultado = opera.equals("-") ? val1 - val2 : resultado;
		resultado = opera.equals("*") ? val1 * val2 : resultado;
		resultado = opera.equals("/") ? val1 / val2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", val1, opera, val2, resultado);
		
		scanner.close();
	}
}
