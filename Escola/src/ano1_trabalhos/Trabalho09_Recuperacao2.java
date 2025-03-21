package ano1_trabalhos;

import java.util.Scanner;

/*Desenvolva  um  programa  para  ler  um  número  e  indicar  quais  números  de  1  até  este número 
	 * são múltiplos deste número lido.*/

public class Trabalho09_Recuperacao2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n;

		System.out.println("Digite um número");
		n = leia.nextInt();
		
			
		for (int i=1; i <= n; i++) {		
			
			System.out.println("-----------");
			System.out.println(n*i);
			System.out.println();
		
		}
	
	}

}
