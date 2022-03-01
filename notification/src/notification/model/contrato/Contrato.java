package notification.model.contrato;

import java.util.Date;

import notification.model.cadastro.Cadastro;

public class Contrato {
	
	private long numeroProtocolo;
	private Cadastro cadastro;
	private Date dataHora;
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
	public long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public Cadastro getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtocolo=" + numeroProtocolo + ", dataHora=" + dataHora + "]";
	}
	
	

}
