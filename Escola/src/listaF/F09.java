package listaF;

import java.util.Scanner;

/* Desenvolverum programa que efetue a leitura de 
		 * um valor num�rico inteiro e apresente-o caso 
		 * este  valor  seja  divis�vel  por  4  e  5.  
		 * N�o  sendo  divis�vel  por  4  e  5  o  
		 * programa  dever�  apresentar  a mensagem 
		 * �N�o � divis�vel por 4 e 5�. */

public class F09 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um valor inteiro");
		n = leia.nextInt();
		
		if (((n % 4) != 0) && ((n % 5) != 0)){
			
			System.out.println();
			System.out.println("N�o � divis�vel por 4 e 5");
		}else {
			
			System.out.println();
			System.out.println("� divis�vel por 4 e 5");
		}

	}

}
