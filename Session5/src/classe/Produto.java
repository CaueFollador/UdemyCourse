package classe;

//DESAFIO: Aplicar um desconto de 25% para todos os produtos, sem excess�o. O valor do desconto poder� ser alterado, mas o desconto ser� sempre o mesmo para todos os produtos

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	double precoComDesconto(int preco) {
		return preco - (preco * desconto);
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(){
		
	}
}
