package desafios;

import java.util.Scanner;

/* DESAFIO: Criar um programa onde o usuário digitará uma nota de um aluno. O programa deverá considerar como nota válida
 * somente as notas entre 0 e 10. Depois, apresentará a média de todas essas notas válidas. 
 * Para o usuário sair do programa, deverá digitar -1
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
				System.out.println("Informe uma nota válida");
				nota = scanner.nextInt();
			}else {
				total += nota;
				notasValidas ++;
				System.out.println("Informe a nota do aluno");
				nota = scanner.nextInt();
			}	
		}
		
		double media = total/notasValidas;
		
		System.out.println("MÉDIA DA TURMA: " + media);
		System.out.println("TOTAL DE NOTAS VÁLIDAS: " + notasValidas);
		
		scanner.close();
	}
}
