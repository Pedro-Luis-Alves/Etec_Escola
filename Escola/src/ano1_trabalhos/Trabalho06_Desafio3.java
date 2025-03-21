package ano1_trabalhos;

import java.util.Scanner;
import java.util.Random;
public class Trabalho06_Desafio3 {

	public static void main(String[] args) {
		
		/* O programa deverá gerar números inteiros aleatórios, o usuário 
		 * irá definir quantos serão os números e qual o limite, 
		 * partindo de 1. Após gerar os números e armazenar em um vetor, o 
		 * programa deverá ordenar estes números dentro do 
		 * próprio vetor e apresentar na saída, os números ordenados na 
		 * ordem definida pelo usuário, crescente ou decrescente.*/
		
		
		
		/*NOME: Pedro Luis Alves dos Santos
		 * 
		 * ESTADO DO TRABALHO: Incompleto
		 * 
		 * Relatório: Consegui criar vetores aleatórios com quantidade e limite decididas
		 *            pelo usuário, porém, não fui capaz de colocar-las em ordem crescente 
		 *            ou descrescente. 
		 * */
		
		
		Scanner leia = new Scanner (System.in);
		
		int quant = 0, resp, con = 0, lim;
		
		Random ram = new Random();
		
		/*---------------------------------PERGUNTAS------------------------------------*/
		
		System.out.println("Digite a quantidade de número aleatórios que você deseja gerar");
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
		
		/*---------------------------------VETORES ALEATÓRIOS------------------------------------*/
		
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
