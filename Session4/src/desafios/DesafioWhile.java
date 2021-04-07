package desafios;

import java.util.Scanner;

/* DESAFIO: Criar um programa onde o usu�rio digitar� uma nota de um aluno. O programa dever� considerar como nota v�lida
 * somente as notas entre 0 e 10. Depois, apresentar� a m�dia de todas essas notas v�lidas. 
 * Para o usu�rio sair do programa, dever� digitar -1
 */
public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double total = 0;
		int notasValidas = 0;
		
		System.out.println("Informe a nota do aluno: ");
		double nota = scanner.nextDouble();
		
		while(nota != -1) {
			if(nota < 0 || nota > 10) {
				System.out.println("Informe uma nota v�lida");
				nota = scanner.nextInt();
			}else {
				total += nota;
				notasValidas ++;
				System.out.println("Informe a nota do aluno");
				nota = scanner.nextInt();
			}	
		}
		
		double media = total/notasValidas;
		
		System.out.println("M�DIA DA TURMA: " + media);
		System.out.println("TOTAL DE NOTAS V�LIDAS: " + notasValidas);
		
		scanner.close();
	}
}
