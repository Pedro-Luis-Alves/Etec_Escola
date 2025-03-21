package ano1_aulas;

import java.util.Random;

import javax.swing.JOptionPane;

/*O programa dever� gerar n�meros inteiros aleat�rios, o usu�rio ir� definir quantos 
 * ser�o os n�meros e qual o limite, partindo de 1. Ap�s gerar os n�meros e armazenar 
 * em um vetor, o programa dever� ordenar estes n�meros dentro do pr�prio vetor e apresentar 
 * na sa�da, os n�meros ordenados na ordem definida pelo usu�rio, crescente ou decrescente
 * 
 */

public class Aula09_Crescente_Descrecente {
	
	public static void main(String[] args) {
		Random gerador = new Random();
		int qtd, lim, ordem, troca;
		
		qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos n�meros deseja gerar?", "MENU", JOptionPane.QUESTION_MESSAGE));
		lim = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o limite m�ximo do n�mero?", "MENU", JOptionPane.QUESTION_MESSAGE));
		
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

