package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.0; //os parênteses representam o cast, que diz para qual tipo a conversão será feita. Isso é uma conversão explícita
		System.out.println(b);
		
		int c = 4;
		
		byte d = (byte) c; //é necessário deixar a conversão explícita para que o Java saiba que a conversão deve ser feita
		
		System.out.println(d);
	}
}
