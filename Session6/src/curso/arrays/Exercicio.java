package curso.arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double notasAlunoA[] = new double[3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		//O import da classe "Arrays" serve para utilizar um m�todo que transforma os arrays em string, para que ele possa ser impresso no terminal.
		System.out.println(Arrays.toString(notasAlunoA)); 
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
	}
}
