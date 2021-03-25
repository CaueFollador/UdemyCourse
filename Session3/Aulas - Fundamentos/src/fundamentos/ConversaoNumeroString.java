package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		
		//a partir do momento que voc� converte um n�mero para string, voc� pode utilizar todos os m�todos que existem dentro de uma string
		System.out.println(num1.toString().length());
		
		int num2 = 5000;
		
		//eu consigo converter um valor primitivo em uma String se eu usar o Wrapper dele
		System.out.println(Integer.toString(num2).length());
	}
}
