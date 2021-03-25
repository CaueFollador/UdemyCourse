package desafioVariaveisEConstantes;

//Desafio: fazer uma fórmula para converter fahrenheint para Celsius

/** JAVA DOC
 * 
 * @author Cauê Follador <caue.follador@outlook.com>
 * @since 1.0
 */
public class Temperatura {

	public static void main(String[] args) {
	
		double fahrenheint;
		
		final double CALCULO = 5/9.0;
		final double AJUSTE = 32;
		
		fahrenheint = 86;
		double celsius = (fahrenheint-AJUSTE)*CALCULO;
		
		System.out.println("Resultado: " + celsius + "ºC");		
	}
	
}
