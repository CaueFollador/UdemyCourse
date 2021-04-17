package curso.desafios;

import java.util.Scanner;

//DESAFIO: Criar um programa para calcular a m�dia de um aluno.
//O programa dever� perguntar quantas notas ser�o informadas e guarda-las em uma array utilizando o "for". Depois, vai calcular a m�dia utilizando um for each.

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voc� ir� lan�ar?");
		int qtd = entrada.nextInt();
		
		double notas[] = new double[qtd];
		
		for(int i = 0; i < qtd; i++) {
			System.out.printf("Qual ser� a %d� nota?\n",i+1);
			double nota = entrada.nextDouble();
			notas[i] = nota;
		}
		
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		System.out.println("a m�dia do aluno � " + (soma/notas.length));
		
		entrada.close();
	}
}
