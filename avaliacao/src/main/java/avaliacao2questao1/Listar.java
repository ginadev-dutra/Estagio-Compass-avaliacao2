package avaliacao2questao1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Listar {

	public static Statement pegaConexao() throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		Statement stm = connection.createStatement();

		return stm;

	}

	public static Produto listarProdutos() throws SQLException {

		java.sql.Statement stm = pegaConexao();
		stm.execute("SELECT ID, NOME, DESCRICAO, DESCONTO, PRECO, DATA_DE_INICIO FROM Produto");		
		ResultSet rst = stm.getResultSet();	
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println(descricao);
			Float desconto = rst.getFloat("DESCONTO");
			System.out.println(desconto);
			float preco = rst.getFloat("PRECO");
			System.out.println(preco);
			Date dataInicio = rst.getDate("DATA_DE_INICIO");
			System.out.println(dataInicio);
		

	}
		return (null);

}

}