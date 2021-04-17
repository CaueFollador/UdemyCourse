package classe;


public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor primitivo
		
		a++;
		b--;
		
		System.out.println(a + " | " + b );
		
		Produto p1 = new Produto("Carro");
		p1.preco  = 30000;
		
		System.out.println(p1.precoComDesconto());
		
		Produto p2 = p1; //atribuição por objeto. Os dois apontam para o mesmo local de memória
		p2.preco = 50000;

		System.out.println(p1.precoComDesconto());
	}
}
