package controle;

public class For3 {

	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++ ) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println(); //serve somente para pular linha
		}
	}
}
