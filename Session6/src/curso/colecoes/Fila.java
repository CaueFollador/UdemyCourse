package curso.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana"); //adiciona na fila. Caso a fila tenha limite de tamanho, o .add retorna um erro quando estoura esse limite.
		fila.offer("Bia"); //tamb�m adiciona na fila, mas caso a fila tenha limite de tamanho ele s� vai retornar um "false" se n�o conseguir adicionar.
		fila.offer("Carlos");
		fila.offer("Nathalia");
		fila.offer("Geovani");
		fila.offer("Nathan");
		
		System.out.println(fila.peek()); // l� o primeiro da fila. Retorna null se a fila estiver vazia
		System.out.println(fila.element());// tamb�m l� o primeiro da fila. Retorna erro se a fila estiver vazia
		
		System.out.println(fila.poll()); // Retorna o primeiro elemento da fila, o tirando da fila. Ele retorna nulo quando a fila est� vazia.
		System.out.println(fila.remove());/// Retorna o primeiro elemento da fila o retirando da fila. Ele retorna um erro quando a fila est� vazia.
	}
}
