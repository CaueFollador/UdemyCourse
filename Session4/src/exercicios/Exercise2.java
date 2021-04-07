package exercicios;

import java.util.Scanner;

//Criar um programa informa se o ano atual é um ano bissexto

public class Exercise2 {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		
		entrada.close();
	}
}
