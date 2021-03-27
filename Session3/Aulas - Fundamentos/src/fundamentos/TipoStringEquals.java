package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = "2";
		
		System.out.println("2" == s); // false
		
		//o método .equals compara os conteúdos
		System.out.println("2".equals(s));// true
		
		s = "   2    ";
		
		//o método .trim tira todos os espaços em branco
		System.out.println("2".equals(s.trim()));
	}
}
