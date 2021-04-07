package desafios;

import javax.swing.JOptionPane;

/* DESAFIO: Retornar o número equivalente ao dia da semana
 * domingo = 1, segunda = 2, terça = 3, quarta = 4, quinta = 5, sexta = 6, sabado = 7
 * DESAFIO PRÓPRIO: Fazer isso aceitando o valor "segunda" e "segunda-feira", por exemplo.
 */

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		String diaSemana = JOptionPane.showInputDialog("Informe um dia da semana");
		
		if(diaSemana.toLowerCase().contains("domingo")) {
			System.out.println("1");
		} else if(diaSemana.toLowerCase().contains("segunda")) {
			System.out.println("2");
		} else if(diaSemana.toLowerCase().replace("ç","c").contains("terca")) {
			System.out.println("3");
		} else if(diaSemana.toLowerCase().contains("quarta")) {
			System.out.println("4");
		} else if(diaSemana.toLowerCase().contains("quinta")) {
			System.out.println("5");
		} else if(diaSemana.toLowerCase().contains("sexta")) {
			System.out.println("6");
		} else if(diaSemana.toLowerCase().replace("á","a").contains("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("dia da semana inválido");
		}
	}
}
