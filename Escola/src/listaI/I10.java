package listaI;


import java.util.Scanner;

		/* Desenvolva um programa para realizar a leitura de um 
		 * conjunto de n�meros(Nn�meros). Ao final indicar qual � 
		 * o maior e o menor n�mero deste conjunto.
		 */

public class I10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int a, b, x, z, l;
		
		System.out.println("Digite a quantidade de n�meros");
		l = leia.nextInt();
		
		for (int n=1; n<=l; n++){
			
			System.out.println("Digite o n�mero " +n);
			x = leia.nextInt();
			
		}
		
		
		
	}

}
