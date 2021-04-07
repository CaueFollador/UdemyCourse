package exercicios;

import java.util.Scanner;

//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe um número:");
		double num = entrada.nextDouble();
		
		if(num <= 10 && num >= 0) {
			if(num % 2 == 0) {
				System.out.println(num + " é um número par que está entre 0 e 10. Atende a todos os requisitos");
			} else {
				System.out.println(num + " é um número ímpar que está entre 0 e 10. Não atende a todos os requisitos");
			}
		} else if(num % 2 == 0){
			System.out.println(num + " é um número par, mas não está entre 0 e 10. Não atende a todos os requisitos");			
			} else{
			System.out.println(num + " não atende a nenhum requisito");
		}
		entrada.close();
	}
}
