package listaJ;

import java.util.Scanner;

/*  Desenvolva  um  programa  para  ler  um  n�mero  e  escrever  todos  os  n�meros  de  0  at�  este 
	 * n�mero, indicando se cada um � par ou �mpar.*/

public class J2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int num = 1, l = 1;
		
		System.out.println("Digite o n�mero desejado");
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
