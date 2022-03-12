package bancoDadosJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrindoConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306"; 
		// final String url = "jdbc:mysql://localhost:3306?useSSL=false";
		//poderia não colocar o nome(3306) da porta neste caso 
		// por estar na porta padrão link:https://dev.mysql.com/downloads/connector/j/
		// uma form de conectar de forma segura é?
		// final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "4321";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
		
 	}

}
