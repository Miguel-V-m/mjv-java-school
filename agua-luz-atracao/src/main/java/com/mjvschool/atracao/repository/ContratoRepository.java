package com.mjvschool.atracao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;

public class ContratoRepository {
	private List <Contrato> contratos = new ArrayList<Contrato>();
	public void gravar(Contrato contrato) {
		contratos.add(contrato);
	}
	public List <Contrato> listarTodos(){
		return contratos;
	}

}
