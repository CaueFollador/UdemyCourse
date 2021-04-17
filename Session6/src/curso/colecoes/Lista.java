package curso.colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Bruno"));
		lista.add(new Usuario("Caue"));
		lista.add(new Usuario("Daniel"));
		lista.add(new Usuario("Elisangela"));
		
		for(Usuario pessoa: lista) {
			System.out.println(pessoa.nome);
		}
		
		System.out.println(lista.get(3).nome);
		
		lista.remove(1); //é possível remover pelo índice
	}
}
