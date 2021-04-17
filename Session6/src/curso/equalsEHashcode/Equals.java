package curso.equalsEHashcode;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Caue Follador";
		u1.email = "e@mail.com.br";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Caue Follador";
		u2.email = "e@mail.com.br";
		
		//Compara��o resultar� falso, pois ela compara os endere�os de mem�ria, e cada objeto possui um endere�o de mem�ria diferente
		System.out.println(u1==u2);
		
		//Compara��o tamb�m resultar� falso pois, como o m�todo "equals" n�o foi definido no objeto, ele se comporta igual a compara��o "u1==u2"
		System.out.println(u1.equals(u2));
		
		
	}
}
