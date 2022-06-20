package avaliacao2questao1;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Inclusao {

	public static String inserirProduto(Produto produto) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();	
		Connection connection = connectionFactory.recuperarConexao();
		
		java.sql.Statement stm = connection.createStatement();
		stm.execute("INSERT INTO PRODUTO (ID, NOME, DESCRICAO, DESCONTO, PRECO, DATA_DE_INICIO) " 
				+ "VALUES ("+produto.getId()+
				", '"+produto.getNome()+
				"', '"+produto.getDescricao()+
				"', "+produto.getDesconto()+
				", "+produto.getPreco()+
				", current_date())");
		
		return "O produto foi inserido.";

	}

}
