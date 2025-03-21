package listaA;

import java.util.Scanner;

/* Desenvolvaum programa para ler os lados de um retângulo e calcular a área deste retângulo, utilizando a fórmula:
	 *  ÁREA=LADO1*LADO2.
	 *  */

public class A02 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		int l1, l2, a;
		
		System.out.println("Digite o valor do primeiro lado");
		l1 = leia.nextInt();
		System.out.println();
		
		System.out.println("Digite o valor do segundo lado");
		l2 = leia.nextInt();
		System.out.println();
		
		a = l1*l2;
		
		System.out.println("A área do retângulo é " +a+ ".");
	}

}
