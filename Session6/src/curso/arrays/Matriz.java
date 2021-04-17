package curso.arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na turma?" );
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qtdNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double [qtdAlunos][qtdNotas];
		
		double totalDaTurma = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				
				System.out.printf("Informe a %dª nota do aluno número %d\n", (i+1), (j+1));
				notasDaTurma[i][j] = entrada.nextDouble();
				totalDaTurma += notasDaTurma[i][j];
			}
		}
		
		double media = totalDaTurma / (qtdAlunos * qtdNotas);
		
		System.out.println("A média da turma é: " + media);
		entrada.close();
	}
}
