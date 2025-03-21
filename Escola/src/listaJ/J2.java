package listaJ;

import java.util.Scanner;

/*  Desenvolva  um  programa  para  ler  um  número  e  escrever  todos  os  números  de  0  até  este 
	 * número, indicando se cada um é par ou ímpar.*/

public class J2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num = 1, l = 1;
		
		System.out.println("Digite o número desejado");
		l = leia.nextInt();
		
		if (num % 2 == l){
			
			while (num >= l){
			System.out.println("Par: " +l);
			l--;
			
			System.out.println("Impar: " +l);
			l--;
			}
			
			
		}else if (num <= l){
			
		}
	}

}
