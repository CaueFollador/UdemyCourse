package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		//JOptionPane cria uma janela para o usu�rio entrar com a informa��o
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero");
		
		//convers�es expl�citas
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		System.out.println(numero1 + numero2);
	}
}
