import java.util.Scanner;

/*
 * DESAFIO: Receber os 3 últimos salários no tipo String
 * aceitar a separação de casas decimais com vírgula ou ponto
 * fazer a conversão correta para double e imprimir a média dos 3 salários
 */

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário:");
		String salario1 = entrada.nextLine();
		
		System.out.println("Digite o segundo salário:");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite o terceiro salário:");
		String salario3 = entrada.nextLine();
		
		double sal1 = Double.parseDouble(salario1.replace(",","."));
		double sal2 = Double.parseDouble(salario2.replace(",","."));
		double sal3 = Double.parseDouble(salario3.replace(",","."));
		
		System.out.printf("%s %s %s", sal1, sal2, sal3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("Média salarial: %.2f", media);
		
		entrada.close();
	}
}
