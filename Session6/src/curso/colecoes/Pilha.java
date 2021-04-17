package curso.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Pr�ncipe"); // Caso tenha limite de fila, ele retorna false
		livros.push("Dom Quixote"); // Caso tenha limite de fila, ele retorna um erro.
		livros.push("Daisy Jones & The Six");
		livros.push("Os Noturnos");
		livros.push("1984");
		livros.push("It");

		//Vai retornar do �ltimo elemento da fila ao primeiro
		for (String l: livros) {
			System.out.println(l);
		}
		
		System.out.println(livros.peek()); // retorna o �ltimo elemento da fila.
		System.out.println(livros.element()); /// igual peek
		
		//Todos os m�todos s�o iguais aos do Queue, mas ele age em cima do �ltimo elemento a entrar na fila
		
	}
}
