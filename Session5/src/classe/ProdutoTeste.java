package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.nome = "Notebook";
		produto1.preco = 4356.89;
		produto1.desconto = 0.25;
		
		System.out.println(produto1.preco);
		
		double precoFinal = produto1.preco * (1 - produto1.desconto);
		
		System.out.println(precoFinal);
	}
}
