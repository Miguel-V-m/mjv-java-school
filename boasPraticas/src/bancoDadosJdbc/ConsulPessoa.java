package bancoDadosJdbc;

public class ConsulPessoa {
	// inserimos atributos
	private int codigo;
	private String nome;
	
	// geramos um costructor field
	public ConsulPessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// selecionamos os metodos getters anda setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
