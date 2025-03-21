package ano1_trabalhos;

import java.util.Scanner;

public class Trabalho05_Desafio2 {
	
	/* Desenvolva um programa que, leia 5 valores 
	 * numéricos, armazene em um vetor, calcule a 
	 * soma e a média destes valores e apresente. 
	 * 
	 * Depois armazene os mesmos valores em outro 
	 * vetor com as mesmas características, mas na 
	 * ordem invertida do primeiro e apresente todos 
	 * os valores dos dois vetores.
	 * */

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		float soma = 0, media = 0;
		float v[] = new float[5];
		float vb[] = new float[5];
		int t=4;
		
		for (int i=0; i<5; i++){
			
			System.out.println("Digite um número");
			v[i] = leia.nextFloat();
			System.out.println();
			
			soma += v[i];
			
		}
		
		media = soma/5;
		
		for (int i=4; i<-1 ; i--){
			
			t--;
			v[t] = vb[i]; 
			
		}
		
		
		System.out.println();
		System.out.println("------RESULTADOS------");
		System.out.println();
		
		System.out.println("Soma: " +soma);
		System.out.println("Media: " +media);
		System.out.println();
		
		System.out.println("==== Coletânea de vetores 1 ====");
		System.out.println();
		
		for (int i=0; i<5; i++ ){
			
			System.out.println("Vetor: " +v[i]);
			
		}
		
		System.out.println();
		System.out.println("==== Coletânea de vetores 2 ====");
		System.out.println();
		
		for (int i=4; i>-1; i--){
			
			System.out.println("Vetor: " +v[i]);
			
		}
		
			
		
		
	}

}
