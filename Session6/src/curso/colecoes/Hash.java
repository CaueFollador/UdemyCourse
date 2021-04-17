package curso.colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();

		usuarios.add(new Usuario("Perônio"));
		usuarios.add(new Usuario("Tíbio"));
		usuarios.add(new Usuario("Nino"));
		
		System.out.println(usuarios.contains(new Usuario("Nino")));
		
		//o Hashcode é o que é utilizado para varrer a lista e tentar encontrar o valor
	}
}
