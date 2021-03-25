package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.0; //os par�nteses representam o cast, que diz para qual tipo a convers�o ser� feita. Isso � uma convers�o expl�cita
		System.out.println(b);
		
		int c = 4;
		
		byte d = (byte) c; //� necess�rio deixar a convers�o expl�cita para que o Java saiba que a convers�o deve ser feita
		
		System.out.println(d);
	}
}
