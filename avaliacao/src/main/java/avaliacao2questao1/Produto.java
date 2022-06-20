package avaliacao2questao1;

import java.sql.Date;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private Float desconto;
	private Float preco;
	private Date dataInicio;
	
	public Produto() {
	
	}
		
	
	public Produto(int id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Float getDesconto() {
		return desconto;
	}


	public void setDesconto(Float desconto) {
		this.desconto = desconto;
	}


	public Float getPreco() {
		return preco;
	}


	public void setPreco(Float preco) {
		this.preco = preco;
	}


	public Date getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
			
}
