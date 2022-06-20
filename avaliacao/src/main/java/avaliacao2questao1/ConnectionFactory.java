package avaliacao2questao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection recuperarConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/padaria?useTimezone=true&serverTimezone=UTC", "root", "Brita1234@");		

	}
	
	

}
