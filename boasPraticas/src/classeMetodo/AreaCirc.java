package classeMetodo;

public class AreaCirc {
	
	double raio;
	static final double PI =3.14;
	
	// creando um constructor
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	// criamos um método responsaavel por criar a área da circunferencia
	double area () {
		return PI*Math.pow(raio, 2);
	}
	//outra maneira é:
		static double area(double raio) {
			return PI*Math.pow(raio, 2);
		}

}
