package avaliacao2questao1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletar {

	public static Statement pegaConexao() throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		Statement stm = connection.createStatement();

		return stm;

	}

	public static void deletarPorId(int id) throws SQLException {

		java.sql.Statement stm = pegaConexao();		
	//	stm.execute("DELETE FROM PRODUTO WHERE ID = '"+id+"'");
		stm.execute("DELETE FROM PRODUTO WHERE ID =" +id);
		


	}

}
