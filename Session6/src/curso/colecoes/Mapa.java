package curso.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); //no caso de Map n�o � .add. O m�todo put n�o s� adiciona, mas tamb�m substitua caso algum desses registros j� exista.
		usuarios.put(1, "Jo�o");
		
		usuarios.put(2, "Mathias");
		usuarios.put(3, "Vit�ria");
		usuarios.put(4, "Miguel");
		usuarios.put(5, "Antonio");
		
		System.out.println(usuarios.keySet()); // tr�s as chaves do map
		System.out.println(usuarios.values()); // tr�s os valores do map
		System.out.println(usuarios.entrySet()); // tr�s chave e valor
		
		System.out.println(usuarios.containsKey(3)); // informa se contem uma chave
		System.out.println(usuarios.containsValue("Caue")); // informa se contem um valor
		
		System.out.println(usuarios.get(4)); // retorna um valor com base em sua chave
		
		//percorrendo todas as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//percorrendo s� os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//percorrendo chave e valor ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro);
		}
	}
}
