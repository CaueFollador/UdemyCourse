package fundamentos;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = "2";
		
		System.out.println("2" == s); // false
		
		//o m�todo .equals compara os conte�dos
		System.out.println("2".equals(s));// true
		
		s = "   2    ";
		
		//o m�todo .trim tira todos os espa�os em branco
		System.out.println("2".equals(s.trim()));
	}
}
