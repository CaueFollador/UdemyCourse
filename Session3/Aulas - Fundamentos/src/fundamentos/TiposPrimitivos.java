package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 234568;
		long pontosAcumulados = 2134845223L; //os tipos "long" necessitam da letra "L" no final
		
		// Tipos num�ricos reais
		float salario = 11445.44F; //os tipos "float" necessitam da letra "F" no final
		double vendasAcumuladas = 2991797103.01;;
		
		// Tipo booleano
		boolean ferias = true; //true or false
		
		// Tipo character
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Salario
		System.out.println(id + ": ganha " + salario);
		
		// F�rias
		System.out.println(id + " est� de f�rias: " + ferias);
		
		System.out.println("Status: " + status);
	}
}
