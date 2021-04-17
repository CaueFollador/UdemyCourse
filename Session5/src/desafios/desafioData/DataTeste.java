package desafios.desafioData;

import java.util.Scanner;

//DESAFIO: Criar os atributos "dia", "m�s" e "ano", e dentro da classe "DataTeste" instanciar uma classe "Data" e dar valores aos seus atributos.
//DESAFIO PESSOAL: Receber os valores de dia, mes e ano, e fazer uma l�gica para que eles sejam valores v�lidos.

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		int ano = entrada.nextInt();
		
		System.out.println("Informe um m�s: ");
		int mes = entrada.nextInt();
		
		while(mes < 1 || mes > 12){
			System.out.println("M�s inv�lido!\nInforme um m�s v�lido");
			mes = entrada.nextInt();
		}
		
		System.out.println("Informe um dia: ");
		int dia = entrada.nextInt();
		
		if(mes == 2 && dia >= 29) {
			
			while(dia >= 29) {
				if(dia == 29 && ano%4 == 0) {
					break;
					
				} else {
					System.out.println("Dia inv�lido para esse m�s.\nInforme um dia v�lido");
					dia = entrada.nextInt();
				}
			}
		
		} else if((mes % 2 == 0 && mes <7 && dia >= 31) || (mes % 2 == 1 && mes > 7 && dia >= 31)) {
			while(dia >= 31) {
				System.out.println("Dia inv�lido para esse m�s.\nInforme um dia v�lido");
				dia = entrada.nextInt();
			}
		
		} else if(dia > 31) {
			while(dia > 31) {
				System.out.println("Dia inv�lido.\nInforme um dia v�lido");
				dia = entrada.nextInt();
			}
		}
				
		entrada.close();
		
		Data d1 = new Data(dia, mes, ano);
		Data d2 = new Data();
		
		System.out.println(d1.formatarData());
		System.out.println(d2.formatarData());
	}
}
