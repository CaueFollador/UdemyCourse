package DesafioOperadoresAritmeticos;

/*
 * DESAFIO: resolver a seguinte equação:
 * ((((6*(3+2)²)/3*2)-((1-5)*(2-7)/2)²)³)/10³
 * 
 * O resultado da primeira parte da equação é 150
 * O resultado da segunda parte da equação é 100
 * O resultado final é 125
 */

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int eq1 = 6*(3+2);
		
		double parc1 = (Math.pow(eq1, 2))/(3*2); //Math.pow é usado para se escrever potências em Java
		
		int eq2 = ((1-5)*(2-7))/2;
		
		double parc2 = Math.pow(eq2, 2);
		
		double result = (Math.pow((parc1-parc2), 3))/Math.pow(10, 3);
		
		System.out.println(result);
		
	}
}
