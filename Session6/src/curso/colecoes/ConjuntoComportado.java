package curso.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//HashSet = Lista desordenada. O system.out não imprime na ordem de inclusão
		Set<String> lista = new HashSet<String>();
		lista.add("Amanda");
		lista.add("Bruna");
		lista.add("Cauê");
		lista.add("Denis");
		lista.add("Eliana");
		lista.add("Fábio");
		
		for (String candidato: lista) {
			System.out.println(candidato);
		}
		
		System.out.println("----------------------");
		
		//TreeSet = Lista ordenada. O system.out imprime na ordem de inclusão
		//SortedSet é um conjunto ordenado
		SortedSet<String> listaAprovados= new TreeSet<>();
		listaAprovados.add("Amanda");
		listaAprovados.add("Bruna");
		listaAprovados.add("Cauê");
		listaAprovados.add("Denis");
		listaAprovados.add("Eliana");
		listaAprovados.add("Fábio");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
	}
}
