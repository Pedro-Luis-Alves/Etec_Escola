package ano1_aulas;

import java.util.Random;

import javax.swing.JOptionPane;

/*O programa deverá gerar números inteiros aleatórios, o usuário irá definir quantos 
 * serão os números e qual o limite, partindo de 1. Após gerar os números e armazenar 
 * em um vetor, o programa deverá ordenar estes números dentro do próprio vetor e apresentar 
 * na saída, os números ordenados na ordem definida pelo usuário, crescente ou decrescente
 * 
 */

public class Aula09_Crescente_Descrecente {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		int qtd, lim, ordem, troca;
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números deseja gerar?", "MENU", JOptionPane.QUESTION_MESSAGE));
		lim = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o limite máximo do número?", "MENU", JOptionPane.QUESTION_MESSAGE));
		
		int vetor[] = new int[qtd];
		
		for (int i = 0; i < qtd; i++) {
			vetor[i] = gerador.nextInt(lim);//PRECISA MELHORAR ESTA PARTE
		}
		
		String opcoes[] = {"Crescente", "Decrescente"};
		ordem = JOptionPane.showOptionDialog(null, "Qual ordem?", "MENU", 0, JOptionPane.PLAIN_MESSAGE, null,
				opcoes, opcoes[0]);
		
		for (int i = 0; i < qtd; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		switch (ordem){
		case 0:
			for (int j = 0; j < qtd - 1; j++){	
				for (int i = j+1; i < qtd; i++) {
					if(vetor[j]>vetor[i]){
						troca = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = troca;
					}
				}
			}
			break;
		case 1:
			
			break;
		}
		System.out.println("");
		
		for (int i = 0; i < qtd; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		
		
		
		
		
	}
	
	
	
}

