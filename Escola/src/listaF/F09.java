package listaF;

import java.util.Scanner;

/* Desenvolverum programa que efetue a leitura de 
		 * um valor numérico inteiro e apresente-o caso 
		 * este  valor  seja  divisível  por  4  e  5.  
		 * Não  sendo  divisível  por  4  e  5  o  
		 * programa  deverá  apresentar  a mensagem 
		 * “Não é divisível por 4 e 5”. */

public class F09 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um valor inteiro");
		n = leia.nextInt();
		
		if (((n % 4) != 0) && ((n % 5) != 0)){
			
			System.out.println();
			System.out.println("Não é divisível por 4 e 5");
		}else {
			
			System.out.println();
			System.out.println("É divisível por 4 e 5");
		}

	}

}
