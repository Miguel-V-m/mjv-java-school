package com.mjv.jdbc.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mjv.jdbc.model.Aluno;
import com.mjv.jdbc.util.FabricaConexao;


public class AlunoRepository {
	//padrao CRUD
	
	public void gravar(Aluno aluno) {
		try {
			FabricaConexao.abrirConexao();
			Connection connection = FabricaConexao.getConexao();

			StringBuilder sql = new StringBuilder();

			sql.append("insert into tab_aluno (nome, altura,sexo, ativo,cd_cidade)");
			sql.append(" values (?,?,?,?,?)");

			PreparedStatement procedimentoSql = connection.prepareStatement(sql.toString());
			procedimentoSql.setString(1, aluno.getNome());
			if(aluno.getAltura()==null)
				procedimentoSql.setNull(2, java.sql.Types.NULL);
			else
				procedimentoSql.setDouble(2, aluno.getAltura());
			
			procedimentoSql.setString(3, aluno.getSexo());
			procedimentoSql.setBoolean(4, aluno.isAtivo());
			procedimentoSql.setInt(5, 2211001);//jamais deve ser um valor fixo

			procedimentoSql.execute();

			System.out.println("registro inserido com sucesso");
			procedimentoSql.close(); //livara a conexão
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listar() {
		try {
			Connection connection = FabricaConexao.getConexao();

			String sql = "SELECT * FROM tab_aluno ";
			
			PreparedStatement procedimentoSql = connection.prepareStatement(sql);
			ResultSet result = procedimentoSql.executeQuery(sql);
			while(result.next()){
				int id = result.getInt("id");
				String nome = result.getString("nome");
				double altura = result.getDouble("altura");
				String sexo = result.getString("sexo");
				boolean ativo = result.getBoolean("ativo");
				System.out.println(id + " ==> " + nome + " ==> " + altura + " ==> " + sexo + " ==> " + ativo);

			}

		System.out.println("Select realizado com sucesso");
		procedimentoSql.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}



