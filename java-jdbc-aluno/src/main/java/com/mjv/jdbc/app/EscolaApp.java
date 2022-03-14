package com.mjv.jdbc.app;

import com.mjv.jdbc.model.Aluno;
import com.mjv.jdbc.repository.AlunoRepository;
import com.mjv.jdbc.util.FabricaConexao;

public class EscolaApp {
	public static void main(String[] args) {
		try {
			Aluno aloisio = new Aluno();
			aloisio.setAltura(1.63);
			aloisio.setAtivo(true);
			aloisio.setNome("MIGUEL");
			aloisio.setSexo("M");
			
			Aluno laysa = new Aluno();
			laysa.setAltura(1.55);
			laysa.setAtivo(true);
			laysa.setNome("LAYSA");
			laysa.setSexo("F");
			
			Aluno juan = new Aluno();
			juan.setAltura(1.85);
			juan.setAtivo(true);
			juan.setNome("JUAN");
			juan.setSexo("M");
			
			Aluno diego = new Aluno();
			diego.setAltura(1.75);
			diego.setAtivo(true);
			diego.setNome("DIEGO");
			diego.setSexo("M");
			
			AlunoRepository alunoRepository = new AlunoRepository();
			alunoRepository.gravar(aloisio);
			alunoRepository.gravar(laysa);
			alunoRepository.gravar(juan);
			alunoRepository.gravar(diego);
			
			alunoRepository.listar();
			
			//  FabricaConexao.fecharConexao();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
