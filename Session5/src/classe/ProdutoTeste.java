package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Notebook");
		Produto produto2 = new Produto();
		//produto1.nome = "Notebook";
		produto1.preco = 4356.89;
		
		produto2.nome = "Caneta";
		produto2.preco = 3.5;
		
		System.out.println(produto1.preco);
		
		double precoFinal = produto1.preco * (1 - Produto.desconto);
		
		System.out.println(precoFinal);
		
//utilizando o método criado
		precoFinal = produto1.precoComDesconto();
		
		System.out.println(precoFinal);
	}
}
