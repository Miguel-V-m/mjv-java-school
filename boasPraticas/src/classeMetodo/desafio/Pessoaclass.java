package classeMetodo.desafio;

public class Pessoaclass {
	
	String nome;
	double peso;
	
	Pessoaclass(String nome,double peso){
		this.nome = nome;
		this.peso = peso;
	}
	// vamos criar o método comer
	
	void comer(Comida comida) {
		if(comida !=null) {
			this.peso += comida.peso;
		}
	}
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}

}
