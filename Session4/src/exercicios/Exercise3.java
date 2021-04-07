package exercicios;

import java.util.Scanner;

//Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".

public class Exercise3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1+nota2)/2;

		if(media >= 7) {
			System.out.println("Aprovado");
			
		} else if(media < 7 && media >= 4) {
			System.out.println("Recuperação");
		
		} else if (media < 4){
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
	}
}
