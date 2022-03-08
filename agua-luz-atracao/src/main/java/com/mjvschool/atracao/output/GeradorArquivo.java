package com.mjvschool.atracao.output;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.util.TextoUtil;

public class GeradorArquivo {
	public void gerarArquivoCsv(List<Contrato> contratos) {
		StringBuilder conteudo = new StringBuilder();
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getNome().concat(";").concat(ct.getCadastro().getCpf()));
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("/home/miguel/mjv_java_school/agua_luz_output/");
		
		if(!output.exists()) {
			output.mkdirs();
			
		}
		
		Path path = Paths.get("/home/miguel/mjv_java_school/agua_luz_output/agua_luz_contratos.csv");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void gerarArquivoTxt(List<Contrato> contratos) {
		StringBuilder conteudo = new StringBuilder();
		
		for(Contrato ct: contratos) {
			conteudo.append(ct.getCadastro().getCpf());
			conteudo.append(TextoUtil.ajustar(ct.getCadastro().getNome(), 30) );
			conteudo.append(ct.getCadastro().getCelular());
			conteudo.append("\n");
		}
		
		System.out.println(conteudo.toString());
		
		File output = new File("/home/miguel/mjv_java_school/agua_luz_output");
		
		if(!output.exists()) {
			output.mkdirs();
		}
		
		Path path = Paths.get("/home/miguel/mjv_java_school/agua_luz_output/agua_luz_contratos.txt");

		try {
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
