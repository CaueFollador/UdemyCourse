package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		//Vai imprimir qual é o caractere dentro da posição 2 na string mencionada
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		//Concatena o valor da string com o valor nos parênteses
		System.out.println(s.concat("!!!"));
		
		//Retorna um boolean para a validação. É case sensitive
		System.out.println(s.startsWith("Boa"));
		
		//Outro exemplo de resultado que dará true
		//Nesse caso, primeiro ele transforma tudo em lowerCase e depois valida o início
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		//Retorna o tamanho da string
		System.out.println(s.length());
		
		//mesma ideia do startsWith
		System.out.println(s.endsWith("!!!"));
		
		//Retorna um boolean de comparação
		//Terá um retorno falso pois é case Sensitive
		System.out.println(s.equals("boa tarde"));
		
		//Boolean de comparação sem case Sensitive
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Caue";
		String sobrenome = "Follador";
		double salario = 12345.987;
		
		//forma rápida de concatenar, usando o "printf"
		//Substitui o %s pelo valor após a vírgula. O ".2f" mostra quantas casas serão apresentadas depois da vírgula
		System.out.printf("Nome: %s %s \nSalário: %.2f", nome, sobrenome, salario);
		
		//outra forma de formatar string
		String frase = String.format("Nome: %s %s \nSalário: %.2f", nome, sobrenome, salario);
		System.out.println(frase);
		
		//boolean para ver se a string contém determinado valor
		System.out.println("Digite uma frase qualquer".contains("qual"));
		
		//informa a partir de qual posição se inicia determinado valor
		System.out.println("Digite uma frase qualquer".indexOf("qualquer"));
		
		//determinar início da impressão a partir de determinado índice informado
		System.out.println("Digite uma frase qualquer".substring(17));
		
		//determina início e fim da impressão a partir de determinados índices informados
		System.out.println("Digite uma frase qualquer".substring(17,21));
	}
}
