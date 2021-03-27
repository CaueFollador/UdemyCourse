package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		//APLICANDO OPERADOR TERNÁRIO
		//se média >= 7.0, Aprovado. Se não, Recuperação.
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		
		System.out.println("Status Aluno: " + resultado);
		
		double nota = 9.5;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		String temDesconto = passouPorMedia && bomComportamento ? "Sim" : "Não";
		
		System.out.println("O Aluno tem desconto? " + temDesconto);
	}
}
