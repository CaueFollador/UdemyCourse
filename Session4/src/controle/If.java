package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = scanner.nextDouble();
		
		if(media>=7) {
			System.out.println("Aprovado!");
		}else if(media <7 && media >=5) {
			System.out.println("Recupera��o!");
		} else {
			System.out.println("Reprovado!");
		}
		
		scanner.close();
	}
}
