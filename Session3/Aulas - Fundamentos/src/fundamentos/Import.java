package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {

	public static void main(String[] args) {
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		//importa um botão da interface java
		JButton botao = new JButton();
		
		/* o caminho inicial "java.lang" faz parte do caminho completo das classes. Ele já está implícito nos códigos
		* digitar "java.lang.System.out.println" é a mesma coisa que digitar "System.out.println".
		* digitar "java.lang.String = "bom dia"" é a mesma coisa que digitar "String = "bom dia""
		*/
		java.lang.System.out.println();
	}
}
