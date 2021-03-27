package fundamentos;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // and
		System.out.println(condicao1 || condicao2); // or
		System.out.println(condicao1 ^ condicao2); // xor
		System.out.println(!condicao1); //not
		System.out.println(!!condicao2); //not not
		
		//Tabela verdade E (and)
		System.out.println("true & true: " + (true && true));
		System.out.println("true & false: " + (true && false));
		System.out.println("false & true: " + (false && true));
		System.out.println("false & false: " + (true && true));
		
		//Tabela verdade OU (or)
		System.out.println("true or true: " + (true || true));
		System.out.println("true or false: " + (true || false));
		System.out.println("false or true: " + (false || true));
		System.out.println("false or false: " + (true || true));

		//Tabela verdade OU exclusivo (xor)
		System.out.println("true xor true: " + (true ^ true));
		System.out.println("true xor false: " + (true ^ false));
		System.out.println("false xor true: " + (false ^ true));
		System.out.println("false xor false: " + (true ^ true));
	}
}
