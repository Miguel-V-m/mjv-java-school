package notification;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private Endereco endereço;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereço() {
		return endereço;
	}
	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}
	
	

}
