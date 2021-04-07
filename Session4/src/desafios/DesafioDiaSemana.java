package desafios;

import javax.swing.JOptionPane;

/* DESAFIO: Retornar o n�mero equivalente ao dia da semana
 * domingo = 1, segunda = 2, ter�a = 3, quarta = 4, quinta = 5, sexta = 6, sabado = 7
 * DESAFIO PR�PRIO: Fazer isso aceitando o valor "segunda" e "segunda-feira", por exemplo.
 */

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		String diaSemana = JOptionPane.showInputDialog("Informe um dia da semana");
		
		if(diaSemana.toLowerCase().contains("domingo")) {
			System.out.println("1");
		} else if(diaSemana.toLowerCase().contains("segunda")) {
			System.out.println("2");
		} else if(diaSemana.toLowerCase().replace("�","c").contains("terca")) {
			System.out.println("3");
		} else if(diaSemana.toLowerCase().contains("quarta")) {
			System.out.println("4");
		} else if(diaSemana.toLowerCase().contains("quinta")) {
			System.out.println("5");
		} else if(diaSemana.toLowerCase().contains("sexta")) {
			System.out.println("6");
		} else if(diaSemana.toLowerCase().replace("�","a").contains("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("dia da semana inv�lido");
		}
	}
}
