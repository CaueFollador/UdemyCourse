package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua resposta: ");
		String resposta = scanner.next();
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Tente novamente");
			System.out.println("Informe sua resposta: ");
			resposta = scanner.next();
		}
		System.out.println("Você conseguiu!");
		
		scanner.close();
	}
}
