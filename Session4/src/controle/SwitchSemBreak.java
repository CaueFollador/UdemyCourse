package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		/*
		 * SWITCH SEM BREAK
		 * Vai executar todos os valores abaixo da condição onde ele cair, inclusive essa condição
		 */
		
		String faixa = "laranja";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai");
		case "marrom":
			System.out.println("Sei o Rokudan");
		case "roxa":
			System.out.println("Sei o Godan");
		case "verde":
			System.out.println("Sei o Youndan");
		case "laranja":
			System.out.println("Sei o Sandan");
		case "vermelha":
			System.out.println("Sei o Nidan");
		case "amarela":
			System.out.println("Sei o Shodan");
		}
	}
}
