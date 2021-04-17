package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		
		System.out.println(a.area());
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a.area());
		
		AreaCirc b = new AreaCirc();
		b.raio = 12;
		
		System.out.println(AreaCirc.area(b.raio));
	}
}
