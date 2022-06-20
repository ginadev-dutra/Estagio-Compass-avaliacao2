package avaliacao2questao1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConsultarEAlterar {

	public static Statement pegaConexao() throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		Statement stm = connection.createStatement();
		
		return stm;
		
	}
	
	public static Produto consultarProduto(int id) throws SQLException {

		java.sql.Statement stm = pegaConexao();

		ResultSet rst = stm.executeQuery("SELECT ID, NOME, DESCRICAO, DESCONTO, PRECO FROM PRODUTO WHERE ID =" + id);
		Produto produtoRetornado = new Produto();
		while (rst.next()) {

			Integer idProduto = rst.getInt("ID");
			produtoRetornado.setId(idProduto);
			String nome = rst.getString("NOME");
			produtoRetornado.setNome(nome);

		}
		return produtoRetornado;
	}

	public static void atualizarPorNome(int id, String nome) throws SQLException {

		

		java.sql.Statement stm = pegaConexao();

		stm.execute("UPDATE PRODUTO SET NOME = '"+nome+"' WHERE ID =" + id);

	}

	public static void atualizarPorDescricao(int id, String descricao) throws SQLException {

		java.sql.Statement stm = pegaConexao();


		stm.execute("UPDATE PRODUTO SET DESCRICAO = '"+descricao+"' WHERE ID =" + id);

	}

	public static void atualizarPorDesconto(int id, float desconto) throws SQLException {

		java.sql.Statement stm = pegaConexao();


		stm.execute("UPDATE PRODUTO SET DESCONTO = '"+desconto+"' WHERE ID =" + id);

	}

	public static void atualizarPorPreco(int id, float preco) throws SQLException {

		java.sql.Statement stm = pegaConexao();


		stm.execute("UPDATE PRODUTO SET PRECO = '"+preco+"' WHERE ID =" + id);

	}
}
