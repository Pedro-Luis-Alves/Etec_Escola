package listaK;

import java.util.Scanner;

	/*  Desenvolva  um  programa  para  ler  um  n�mero  e  escrever  todos  os  n�meros  de  0  
	 * at�  este n�mero, indicando se cada um � par ou �mpar.*/

public class K02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n, nm;
	
		System.out.println("Escreva o n�mero desejado");
		nm = leia.nextInt();
		
		n = 1;
		
		do{
			System.out.println(n);
			n++;
			
			if ((n % 2) == 0){
				System.out.println("� Impar");
				System.out.println("------------");
			}else {
				System.out.println("� Par");
				System.out.println("------------");
			}

		}while (n <= nm);
		
	}
}
