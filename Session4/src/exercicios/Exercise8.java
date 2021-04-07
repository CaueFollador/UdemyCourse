package exercicios;

import javax.swing.JOptionPane;

//8. Criar um programa que receba uma palavra e imprime no console letra por letra.

public class Exercise8 {

	public static void main(String[] args) {
		
		String palavra = JOptionPane.showInputDialog("Informe uma palavra!");
		
//		--Modo 1--
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.substring(i, i+1));
		}
		
//		--Modo 2--
		char letras[] = palavra.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
	}
}
