package utilization;

import notification.Cadastro;
import notification.Contrato;
import notification.Pessoa;

public class NotificationSystem {
	
	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		contrato.setNumeroProtocolo(123);
		Cadastro cadastro = new Cadastro();
		cadastro.setAtivo(true);
		cadastro.setNumero(27);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("123213");
		pessoa.setNome("Gleyson Sampaio");
		pessoa.setRg("89789");
		pessoa.setTelefone("897789");
		
		Endereco  endereco = new Endereco();
		endereco.setBairrio("Santo Antonio");
		
		
		cadastro.setPessoa(pessoa);
		contrato.setCadastro(cadastro);
		
		
		
		
		
		//System.out.println(contrato.getNumeroProtocolo());
		
	}

}
