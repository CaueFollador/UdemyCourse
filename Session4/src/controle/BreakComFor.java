package controle;

public class BreakComFor {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if (i ==5) {
				System.out.println("Processo cancelado!");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
