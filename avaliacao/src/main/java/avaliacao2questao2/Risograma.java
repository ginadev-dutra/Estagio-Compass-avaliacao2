package avaliacao2questao2;

import java.util.ArrayList;
import java.util.List;

public class Risograma {
	
	private String nomeFuncionario;
	private String neutro;
	private String chateado = ":(";
	private String divertido = ":)";
	private List<String> perguntas;
		
	
	public String getNeutro() {
		return neutro;
	}

	public String getChateado() {
		return chateado;
	}

	public String getDivertido() {
		return divertido;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	
	public static List<String> getPerguntas() {
		return getPerguntas();
	}
	
	
	public void insertPerguntas(String pergunta) {
		perguntas.add(pergunta);
	}
	

	public void setPerguntas(List<String> pergunta) {
		this.perguntas = pergunta;
	}
	

}

	
	
		
	


