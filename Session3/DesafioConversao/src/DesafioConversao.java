import java.util.Scanner;

/*
 * DESAFIO: Receber os 3 �ltimos sal�rios no tipo String
 * aceitar a separa��o de casas decimais com v�rgula ou ponto
 * fazer a convers�o correta para double e imprimir a m�dia dos 3 sal�rios
 */

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro sal�rio:");
		String salario1 = entrada.nextLine();
		
		System.out.println("Digite o segundo sal�rio:");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite o terceiro sal�rio:");
		String salario3 = entrada.nextLine();
		
		double sal1 = Double.parseDouble(salario1.replace(",","."));
		double sal2 = Double.parseDouble(salario2.replace(",","."));
		double sal3 = Double.parseDouble(salario3.replace(",","."));
		
		System.out.printf("%s %s %s", sal1, sal2, sal3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("M�dia salarial: %.2f", media);
		
		entrada.close();
	}
}
