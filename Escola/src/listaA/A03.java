package listaA;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  uma  temperatura  em  graus  Centígrados  e  
	 * apresentá-la convertida em graus Fahrenheit. A fórmula deconversão é: F=(9*C+160)/5, onde F 
	 * é a temperatura em Fahrenheit e C é a temperatura em Centígrados.
	 * */

public class A03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int c, f;
		
		System.out.println("Digite a temperatura  em  graus  Centígrados");
		c = leia.nextInt();
		
		f = (9*c+160)/5;
		
		System.out.println();
		System.out.println("A temperatura em Fahrenheit é " +f+ ".");
	}

}
