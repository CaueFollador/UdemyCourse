package curso.desafios;

import java.util.Scanner;

//DESAFIO: Criar um programa para calcular a média de um aluno.
//O programa deverá perguntar quantas notas serão informadas e guarda-las em uma array utilizando o "for". Depois, vai calcular a média utilizando um for each.

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você irá lançar?");
		int qtd = entrada.nextInt();
		
		double notas[] = new double[qtd];
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Qual será a %dª nota?\n",i+1);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		System.out.println("a média do aluno é " + (soma/notas.length));
		
		entrada.close();
	}
}
