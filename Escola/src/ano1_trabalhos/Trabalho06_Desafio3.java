package ano1_trabalhos;

import java.util.Scanner;
import java.util.Random;
public class Trabalho06_Desafio3 {

	public static void main(String[] args) {
		
		/* O programa dever� gerar n�meros inteiros aleat�rios, o usu�rio 
		 * ir� definir quantos ser�o os n�meros e qual o limite, 
		 * partindo de 1. Ap�s gerar os n�meros e armazenar em um vetor, o 
		 * programa dever� ordenar estes n�meros dentro do 
		 * pr�prio vetor e apresentar na sa�da, os n�meros ordenados na 
		 * ordem definida pelo usu�rio, crescente ou decrescente.*/
		
		
		
		/*NOME: Pedro Luis Alves dos Santos
		 * 
		 * ESTADO DO TRABALHO: Incompleto
		 * 
		 * Relat�rio: Consegui criar vetores aleat�rios com quantidade e limite decididas
		 *            pelo usu�rio, por�m, n�o fui capaz de colocar-las em ordem crescente 
		 *            ou descrescente. 
		 * */
		
		
		Scanner leia = new Scanner (System.in);
		
		int quant = 0, resp, con = 0, lim;
		
		Random ram = new Random();
		
		/*---------------------------------PERGUNTAS------------------------------------*/
		
		System.out.println("Digite a quantidade de n�mero aleat�rios que voc� deseja gerar");
		quant = leia.nextInt();
		System.out.println();
		
		System.out.println("Digite o limite");
		lim = leia.nextInt();
		System.out.println();
		
		System.out.println("Digite: \n1 - Para Crescente\n2 - Para Descrescente"); 
		resp = leia.nextInt();
		System.out.println();
		
		
		int a = ram.nextInt(lim)+1;
		
		int v[] = new int[quant];
		
		/*---------------------------------VETORES ALEAT�RIOS------------------------------------*/
		
		for (int i=0; i<quant; i++) {
			
			v[i]  += ram.nextInt(lim)+1; 
			
		}
		
		/*---------------------------------MOSTRAR------------------------------------*/
		
		System.out.println("===========================");
		System.out.println();
		
		for (int j=0; j < quant; j ++){
			
			
			System.out.println(v[j]);

		}
		
		
		
		
	}

}
