package listaK;

import java.util.Scanner;

	/*  Desenvolva  um  programa  para  ler  um  número  e  escrever  todos  os  números  de  0  
	 * até  este número, indicando se cada um é par ou ímpar.*/

public class K02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n, nm;
	
		System.out.println("Escreva o número desejado");
		nm = leia.nextInt();
		
		n = 1;
		
		do{
			System.out.println(n);
			n++;
			
			if ((n % 2) == 0){
				System.out.println("É Impar");
				System.out.println("------------");
			}else {
				System.out.println("É Par");
				System.out.println("------------");
			}

		}while (n <= nm);
		
	}
}
