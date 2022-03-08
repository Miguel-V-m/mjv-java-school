package classeMetodo;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // atribuição por referencia (tipo objet)
		
		d1.dia = 31;
		d1.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrão(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
	// isto não é uma boa prática
	static void voltarDataParaValorPadrão(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
