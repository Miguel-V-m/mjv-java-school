package bancoDadosJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FaabricaConexao {
	
	public static Connection getConexao() {
		
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "4321"; 
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	

}
