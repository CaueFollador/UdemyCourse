package curso.colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Caue"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('n'); // char -> Character
		
		//A collection já converte a forma de impressão para string
		System.out.println(conjunto);
		
		System.out.println("O Tamanho é " + conjunto.size());
		
		//Ele não aceita repetição
		conjunto.add(true);
		System.out.println("O Tamanho é " + conjunto.size());
		
		//quando você tenta remover algo, ele te retorna um boolean
		System.out.println(conjunto.remove(1));
		System.out.println(conjunto.remove('h'));
		
		System.out.println(conjunto.contains('h'));
		
		HashSet conjunto2 = new HashSet();
		conjunto2.add(1);
		conjunto2.add("Nathalia");
		conjunto2.add(3);
		
		//juntando 2 collections
		conjunto2.addAll(conjunto);
		
		System.out.println(conjunto2);
		
		//deixando somente os valores diferentes
		conjunto2.retainAll(conjunto);
		
		//limpando collection
		conjunto2.clear();
	}
}
