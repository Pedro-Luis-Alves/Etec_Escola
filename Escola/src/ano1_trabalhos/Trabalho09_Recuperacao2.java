package ano1_trabalhos;

import java.util.Scanner;

/*Desenvolva  um  programa  para  ler  um  n�mero  e  indicar  quais  n�meros  de  1  at�  este n�mero 
	 * s�o m�ltiplos deste n�mero lido.*/

public class Trabalho09_Recuperacao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n;

		System.out.println("Digite um n�mero");
		n = leia.nextInt();
		
			
		for (int i=1; i <= n; i++) {		
			
			System.out.println("-----------");
			System.out.println(n*i);
			System.out.println();
		
		}
	
	}

}
