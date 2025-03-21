package listaI;


import java.util.Scanner;

		/* Desenvolva um programa para realizar a leitura de um 
		 * conjunto de números(Nnúmeros). Ao final indicar qual é 
		 * o maior e o menor número deste conjunto.
		 */

public class I10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int a, b, x, z, l;
		
		System.out.println("Digite a quantidade de números");
		l = leia.nextInt();
		
		for (int n=1; n<=l; n++){
			
			System.out.println("Digite o número " +n);
			x = leia.nextInt();
			
		}
		
		
		
	}

}
