package bancoDadosJdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FaabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		// criamos uma lista
		List<ConsulPessoa> pessoas = new ArrayList<>();
		
		// como esperamos receber multiplas linhas criamos um método
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new ConsulPessoa(codigo, nome));			
		}
		
		//percorremos à pessoa
		for(ConsulPessoa p: pessoas) {
			System.out.println(p.getCodigo() + "==>" + p.getNome());
		}
		
		stmt.close();
		conexao.close();
	}

}
