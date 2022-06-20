package avaliacao2questao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection resgataConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/risograma?useTimezone=true&serverTimezone=UTC", "root", "Brita1234@");		

	}
	
	

}
