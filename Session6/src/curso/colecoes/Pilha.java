package curso.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe"); // Caso tenha limite de fila, ele retorna false
		livros.push("Dom Quixote"); // Caso tenha limite de fila, ele retorna um erro.
		livros.push("Daisy Jones & The Six");
		livros.push("Os Noturnos");
		livros.push("1984");
		livros.push("It");

		//Vai retornar do último elemento da fila ao primeiro
		for (String l: livros) {
			System.out.println(l);
		}
		
		System.out.println(livros.peek()); // retorna o último elemento da fila.
		System.out.println(livros.element()); /// igual peek
		
		//Todos os métodos são iguais aos do Queue, mas ele age em cima do último elemento a entrar na fila
		
	}
}
