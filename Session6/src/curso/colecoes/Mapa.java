package curso.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); //no caso de Map não é .add. O método put não só adiciona, mas também substitua caso algum desses registros já exista.
		usuarios.put(1, "João");
		
		usuarios.put(2, "Mathias");
		usuarios.put(3, "Vitória");
		usuarios.put(4, "Miguel");
		usuarios.put(5, "Antonio");
		
		System.out.println(usuarios.keySet()); // trás as chaves do map
		System.out.println(usuarios.values()); // trás os valores do map
		System.out.println(usuarios.entrySet()); // trás chave e valor
		
		System.out.println(usuarios.containsKey(3)); // informa se contem uma chave
		System.out.println(usuarios.containsValue("Caue")); // informa se contem um valor
		
		System.out.println(usuarios.get(4)); // retorna um valor com base em sua chave
		
		//percorrendo todas as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrendo só os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrendo chave e valor ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}
}
