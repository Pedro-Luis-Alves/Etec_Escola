package listaK;

import java.util.Scanner;

/*
 * Desenvolva um programa para ler um n�mero e calcular o fatorial deste n�mero.
 * 
 * Fatorial: F(4) = 4! = 4*3*2*1 = 24
 * F(0) = 0! = 1
 */

public class K11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		long fat;
		int n;
		
		System.out.println("Digite o n�mero para o c�culo do fatorial");
		n = leia.nextInt();
		
		fat = n;
		
		do {
			
			n--;
			
			fat = (fat*n);
			
		}while(n>1);
		
		System.out.println("O fatorial � " + fat + ".");

	}

}
