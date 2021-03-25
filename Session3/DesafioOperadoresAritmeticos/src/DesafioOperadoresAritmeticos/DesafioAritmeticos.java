package DesafioOperadoresAritmeticos;

/*
 * DESAFIO: resolver a seguinte equa��o:
 * ((((6*(3+2)�)/3*2)-((1-5)*(2-7)/2)�)�)/10�
 * 
 * O resultado da primeira parte da equa��o � 150
 * O resultado da segunda parte da equa��o � 100
 * O resultado final � 125
 */

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int eq1 = 6*(3+2);
		
		double parc1 = (Math.pow(eq1, 2))/(3*2); //Math.pow � usado para se escrever pot�ncias em Java
		
		int eq2 = ((1-5)*(2-7))/2;
		
		double parc2 = Math.pow(eq2, 2);
		
		double result = (Math.pow((parc1-parc2), 3))/Math.pow(10, 3);
		
		System.out.println(result);
		
	}
}
