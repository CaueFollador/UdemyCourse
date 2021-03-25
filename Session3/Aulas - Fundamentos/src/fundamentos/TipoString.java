package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		//Vai imprimir qual � o caractere dentro da posi��o 2 na string mencionada
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		//Concatena o valor da string com o valor nos par�nteses
		System.out.println(s.concat("!!!"));
		
		//Retorna um boolean para a valida��o. � case sensitive
		System.out.println(s.startsWith("Boa"));
		
		//Outro exemplo de resultado que dar� true
		//Nesse caso, primeiro ele transforma tudo em lowerCase e depois valida o in�cio
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		//Retorna o tamanho da string
		System.out.println(s.length());
		
		//mesma ideia do startsWith
		System.out.println(s.endsWith("!!!"));
		
		//Retorna um boolean de compara��o
		//Ter� um retorno falso pois � case Sensitive
		System.out.println(s.equals("boa tarde"));
		
		//Boolean de compara��o sem case Sensitive
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Caue";
		String sobrenome = "Follador";
		double salario = 12345.987;
		
		//forma r�pida de concatenar, usando o "printf"
		//Substitui o %s pelo valor ap�s a v�rgula. O ".2f" mostra quantas casas ser�o apresentadas depois da v�rgula
		System.out.printf("Nome: %s %s \nSal�rio: %.2f", nome, sobrenome, salario);
		
		//outra forma de formatar string
		String frase = String.format("Nome: %s %s \nSal�rio: %.2f", nome, sobrenome, salario);
		System.out.println(frase);
		
		//boolean para ver se a string cont�m determinado valor
		System.out.println("Digite uma frase qualquer".contains("qual"));
		
		//informa a partir de qual posi��o se inicia determinado valor
		System.out.println("Digite uma frase qualquer".indexOf("qualquer"));
		
		//determinar in�cio da impress�o a partir de determinado �ndice informado
		System.out.println("Digite uma frase qualquer".substring(17));
		
		//determina in�cio e fim da impress�o a partir de determinados �ndices informados
		System.out.println("Digite uma frase qualquer".substring(17,21));
	}
}
