package avaliacao2questao1;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws SQLException {
		try {
		Scanner in = new Scanner(System.in);
		int entrada;
		System.out.println("Digite a opção desejada: ");
		System.out.println("");
		do {
			
			System.out.println("1 inserir");
			System.out.println("2 atualizar");
			System.out.println("3 deletar");
			System.out.println("4 listar");
			System.out.println("5 sair");
			entrada = in.nextInt();
			

			if (entrada == 1) {
				Produto produto = new Produto();
			

				try {
					Scanner id_ = new Scanner(System.in);
					System.out.println("Digite o Id: ");
					produto.setId(id_.nextInt());

					Scanner nome_ = new Scanner(System.in);
					System.out.println("Digite o nome: ");
					produto.setNome(nome_.nextLine());

					Scanner descricao_ = new Scanner(System.in);
					System.out.println("Digite a descrição: ");
					produto.setDescricao(descricao_.nextLine());

					Scanner desconto_ = new Scanner(System.in);
					System.out.println("Digite o valor do desconto: ");
					produto.setDesconto(descricao_.nextFloat());

					Scanner preco_ = new Scanner(System.in);
					System.out.println("Digite o valor do preço: ");
					produto.setPreco(preco_.nextFloat());

					System.out.println(ProdutoDao.inserirProduto(produto));

				} catch (SQLException e) {
					e.printStackTrace();
				} catch (InputMismatchException e) {
					System.out.println("valor inválido");
				}
			}
			if (entrada == 2) {
				try {
					Scanner id_ = new Scanner(System.in);
					System.out.println("Digite o Id: ");
					Produto produtoAAtualizar = ProdutoDao.consultarProduto(id_.nextInt());

					System.out.println("Deseja alterar esse produto? " + produtoAAtualizar.getNome());
					Scanner produto = new Scanner(System.in);
					System.out.println("1 - Sim");
					System.out.println("2 - Não");
					int entrada2 = produto.nextInt();
					do {

						if (entrada2 == 1) {
							System.out.println("Digite a opção que deseja alterar");
							System.out.println("");
							System.out.println("1 nome");
							System.out.println("2 descrição");
							System.out.println("3 desconto");
							System.out.println("4 preço");
							System.out.println("5 sair");
							int opcao = produto.nextInt();
							if (opcao == 1) {
								Scanner recebaNome = new Scanner(System.in);
								System.out.println("Digite o nome que deseja alterar: ");
								String opcaoNome = recebaNome.nextLine();
								ProdutoDao.atualizarPorNome(produtoAAtualizar.getId(), opcaoNome);
							}
							if (opcao == 2) {
								Scanner recebaDescricao = new Scanner(System.in);
								System.out.println("Digite a descricao que deseja alterar: ");
								String opcaoDescricao = recebaDescricao.nextLine();
								ProdutoDao.atualizarPorDescricao(produtoAAtualizar.getId(), opcaoDescricao);
							}
							if (opcao == 3) {
								Scanner recebaDesconto = new Scanner(System.in);
								System.out.println("Digite o valor do desconto que deseja alterar: ");
								float opcaoDesconto = recebaDesconto.nextFloat();
								ProdutoDao.atualizarPorDesconto(produtoAAtualizar.getId(), opcaoDesconto);
							}
							if (opcao == 4) {
								Scanner recebaPreco = new Scanner(System.in);
								System.out.println("Digite o valor do preço que deseja alterar: ");
								float opcaoPreco = recebaPreco.nextFloat();
								ProdutoDao.atualizarPorPreco(produtoAAtualizar.getId(), opcaoPreco);
							}

							if (opcao == 5) {
								entrada = 5;
								System.out.println("Dados atualizados com sucesso!");
							}

						}
						if (entrada2 == 2) {
							entrada = 5;
						}

					} while (entrada != 5);
				} catch (SQLException e) {
					e.printStackTrace();	
		
				}

			}
			if (entrada == 3) {
				try {
				Scanner id_ = new Scanner(System.in);
				System.out.println("Digite o Id: ");
				Produto produtoADeletar = ProdutoDao.consultarProduto(id_.nextInt());

				System.out.println("Deseja excluir esse produto? " + produtoADeletar.getNome());
				Scanner produto = new Scanner(System.in);
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				int entrada3 = produto.nextInt();
				

				if (entrada3 == 1) {

					ProdutoDao.deletarPorId(produtoADeletar.getId());
					System.out.println("O produto foi deletado!");
				} }catch (InputMismatchException e) {
					System.out.println("valor inválido");
				}
				while (entrada != 2);
				

			}

			if (entrada == 4) {
				ProdutoDao.listarProdutos();
			}

		} while (entrada != 5);
		System.out.println("Você saiu do programa.");
		}
		catch (InputMismatchException e) {
			System.out.println("Por favor digite uma opção de 1 a 5.");
		}
	}
}
