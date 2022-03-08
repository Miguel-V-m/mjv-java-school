package classeMetodo;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		System.out.println(a.area());
		
		// A outra forma
		System.out.println(AreaCirc.area(100));
	}
	

}
