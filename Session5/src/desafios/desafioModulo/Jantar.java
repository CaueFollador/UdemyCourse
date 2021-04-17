package desafios.desafioModulo;

import java.util.Scanner;

//DESAFIO: Criar 3 classes (Pessoa, Comida e Jantar), instanciar 2 comidas, instanciar 1 pessoa, fazer a pessoa comer as 2 comidas atrav�s do m�todo comer, e imprimir o peso da pessoa antes e depois de comer.
//DESAFIO PESSOAL: Deixar o usu�rio escolher as informa��es da pessoa e da comida.

public class Jantar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		Comida c1 = new Comida();
		Comida c2 = new Comida();
		
		
		System.out.println("Escolha o nome da personagem:");
		p.nome = entrada.next();
		
		System.out.println("Escolha o peso da personagem:");
		p.peso = entrada.nextDouble();
		
		System.out.println("Escolha o nome da primeira comida:");
		c1.nome = entrada.next();
		
		System.out.println("Escolha o peso da primeira comida:");
		c1.peso = entrada.nextDouble();
		
		System.out.println("Escolha o nome da segunda comida");
		c2.nome = entrada.next();
		
		System.out.println("Escolha o peso da segunda comida:");
		c2.peso = entrada.nextDouble();
		
		entrada.close();
		
		
		System.out.printf("O peso da personagem %s atualmente � de %.2f\n", p.nome, p.peso);
		
		p.comer(c1);
		System.out.printf("O peso da personagem %s ap�s comer %s � de %.2f\n", p.nome, c1.nome, p.peso);
		
		p.comer(c2);
		System.out.printf("O peso da personagem %s ap�s comer %s � de %.2f\n", p.nome, c2.nome, p.peso);
		
	}
}
