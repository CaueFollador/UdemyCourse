package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Good Morning sunlight";
		s = s.toUpperCase();
		
		s = s.replace("MORNING", "AFTERNOON");
		
		System.out.println(s);
		System.out.println("caue".toUpperCase());
		
		String x = "Caue".toLowerCase();
		String y = "Bom dia X".replace("X", "Pessoa").toUpperCase();
		
		System.out.println(x);
		System.out.println(y);
	}
}
