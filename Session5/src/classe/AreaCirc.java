package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	AreaCirc(){
		
	}
	
	double area() {
		return raio * raio * PI;
	}
	
	static double area(double raio) {
		return (raio * raio * PI);
	}
}
