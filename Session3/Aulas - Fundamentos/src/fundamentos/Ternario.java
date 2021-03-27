package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		//APLICANDO OPERADOR TERN�RIO
		//se m�dia >= 7.0, Aprovado. Se n�o, Recupera��o.
		String resultado = media >= 7.0 ? "Aprovado" : "Recupera��o";
		
		System.out.println("Status Aluno: " + resultado);
		
		double nota = 9.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		String temDesconto = passouPorMedia && bomComportamento ? "Sim" : "N�o";
		
		System.out.println("O Aluno tem desconto? " + temDesconto);
	}
}
