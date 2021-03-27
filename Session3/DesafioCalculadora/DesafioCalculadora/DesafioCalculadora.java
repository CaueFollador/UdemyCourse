package DesafioCalculadora;

import java.util.Scanner;

//receber 2 n�meros do usu�rio atrav�s do terminal
//receber o s�mbolo da opera��o que o usu�rio ir� executar (+, -, *, /)
//DESAFIO: s� pode se utilizar o que foi ensinado no curso at� o momento (sem if, sem for, sem conte�dos mais avan�ados)

public class DesafioCalculadora {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		double val1 = scanner.nextDouble();
		
		System.out.println("Informe o segundo valor:");
		double val2 = scanner.nextDouble();
		
		System.out.println("Informe a opera��o: ( + | - | * | / )");
		String opera = scanner.next();
		
		double resultado = opera.equals("+") ? val1 + val2 : 0;
		resultado = opera.equals("-") ? val1 - val2 : resultado;
		resultado = opera.equals("*") ? val1 * val2 : resultado;
		resultado = opera.equals("/") ? val1 / val2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", val1, opera, val2, resultado);
		
		scanner.close();
	}
}
