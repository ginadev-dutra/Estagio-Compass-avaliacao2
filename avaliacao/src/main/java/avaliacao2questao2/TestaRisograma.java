package avaliacao2questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaRisograma {
	
	private List<String> perguntas = new ArrayList<String>();

	public TestaRisograma() {
		perguntas.add("Você está satisfeito com seu salário?");
		perguntas.add("Você está satisfeito com seus benefícios?");
		perguntas.add("Você está satisfeito com seu sua equipe de trabalho?");
		perguntas.add("Você está satisfeito com sua liderança?");
		
	}

	public static void main(String[] args) {
		
		Risograma testaRisograma = new Risograma();
				
		Scanner in = new Scanner(System.in);		
		System.out.println("Digite seu nome: ");
		testaRisograma.setNomeFuncionario(in.nextLine());
	
		System.out.println("Olá " +testaRisograma.getNomeFuncionario() + "!" + "Por favor, responda as questões abaixo: ");
		
		//questão1
		System.out.println(testaRisograma.getPerguntas().get(0));
		System.out.println("[1] :)");
		System.out.println("[2] :(");
		System.out.println("Digite sua resposta: ");
		String resposta1 = in.nextLine();
		
			
		
		
	}
	

}
