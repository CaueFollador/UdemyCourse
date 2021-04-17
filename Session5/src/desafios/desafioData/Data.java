package desafios.desafioData;

//DESAFIO: Criar os atributos "dia", "mês" e "ano", e dentro da classe "DataTeste" instanciar uma classe "Data" e dar valores aos seus atributos.
//DESAFIO2: Criar método para retornar a data formatada em dd/MM/yyyy
//DESAFIO3: Criar 2 construtores: o construtor padrão (que não recebe atributos), e um construtor que receba dia, ano. Quando o primeiro construtor for chamado, a data padrão dele deve ser 1/1/1970.
public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970); //utilizando this para chamar um construtor dentro de outro construtor
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatarData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
