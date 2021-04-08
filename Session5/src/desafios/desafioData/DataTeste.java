package desafios.desafioData;

import java.util.Scanner;

//DESAFIO: Criar os atributos "dia", "m�s" e "ano", e dentro da classe "DataTeste" instanciar uma classe "Data" e dar valores aos seus atributos.
//DESAFIO PESSOAL: Receber os valores de dia, mes e ano, e fazer uma l�gica para que eles sejam valores v�lidos.

public class DataTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Data d1 = new Data();
		
		System.out.println("Informe um ano: ");
		d1.ano = entrada.nextInt();
		
		System.out.println("Informe um m�s: ");
		int mes = entrada.nextInt();
		
		while(mes < 1 || mes > 12){
			System.out.println("M�s inv�lido!\nInforme um m�s v�lido");
			mes = entrada.nextInt();
		}
		d1.mes = mes;
		
		System.out.println("Informe um dia: ");
		int dia = entrada.nextInt();
		
		if(d1.mes == 2 && dia >= 29) {
			externo:
			while(dia >= 29) {
				if(dia == 29 && d1.ano%4 == 0) {
					break externo;
					
				} else {
					System.out.println("Dia inv�lido para esse m�s.\nInforme um dia v�lido");
					dia = entrada.nextInt();
				}
			}
			d1.dia = dia;
		
		} else if((d1.mes % 2 == 0 && d1.mes <7 && dia >= 31) || (d1.mes % 2 == 1 && d1.mes > 7 && dia >= 31)) {
			while(dia >= 31) {
				System.out.println("Dia inv�lido para esse m�s.\nInforme um dia v�lido");
				dia = entrada.nextInt();
			}
			d1.dia = dia;
		
		} else if(dia > 31) {
			while(dia > 31) {
				System.out.println("Dia inv�lido.\nInforme um dia v�lido");
				dia = entrada.nextInt();
			}
			d1.dia = dia;
		}
		d1.dia = dia;
		
		System.out.printf("Sua data �: %d/%d/%d",d1.dia,d1.mes,d1.ano);
		entrada.close();
	}
}
