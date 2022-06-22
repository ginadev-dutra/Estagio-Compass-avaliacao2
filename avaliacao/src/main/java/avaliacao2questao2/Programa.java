package avaliacao2questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
				
		Scanner in = new Scanner(System.in);		
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		System.out.println("Digite uma frase: ");
	    String mensagem = in.nextLine();
		
	    Risograma testaRisograma = new Risograma(nome,mensagem);
			
			
		
		
	}
	

}
