package controle;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		/*
		 * SWITCH COM BREAK
		 * Vai executar somente o bloco em que o programa entrar.
		 * É possível definir mais de um case para o mesmo bloco de códigos
		 */
		
		String conceito = "";
		int nota = 7;
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "não encontrado!";
		}
		System.out.println("Conceito: " + conceito);
	}
}
