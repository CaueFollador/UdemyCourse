package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: ".concat(nome));
		System.out.println("Idade: " + idade);
		
		entrada.close();
	}
}
