package curso.equalsEHashcode;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Caue Follador";
		u1.email = "e@mail.com.br";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Caue Follador";
		u2.email = "e@mail.com.br";
		
		//Comparação resultará falso, pois ela compara os endereços de memória, e cada objeto possui um endereço de memória diferente
		System.out.println(u1==u2);
		
		//Comparação também resultará falso pois, como o método "equals" não foi definido no objeto, ele se comporta igual a comparação "u1==u2"
		System.out.println(u1.equals(u2));
		
		
	}
}
