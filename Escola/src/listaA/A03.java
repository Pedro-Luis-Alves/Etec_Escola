package listaA;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  uma  temperatura  em  graus  Cent�grados  e  
	 * apresent�-la convertida em graus Fahrenheit. A f�rmula deconvers�o �: F=(9*C+160)/5, onde F 
	 * � a temperatura em Fahrenheit e C � a temperatura em Cent�grados.
	 * */

public class A03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int c, f;
		
		System.out.println("Digite a temperatura  em  graus  Cent�grados");
		c = leia.nextInt();
		
		f = (9*c+160)/5;
		
		System.out.println();
		System.out.println("A temperatura em Fahrenheit � " +f+ ".");
	}

}
