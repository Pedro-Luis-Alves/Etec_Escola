package listaD;

import java.util.Scanner;

	/* Desenvolva  um  programa  que  leia  um  número  
	 * e  informe  se  este  número  é  maior, menor ou 
	 * igual a 100.*/

public class D02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a;

		System.out.println("Digite o valor do número");
		a = leia.nextInt();
		
		if (a > 100){
			System.out.println();
			System.out.println(+a+ " é maior que 100.");
			
		}else if (100 > a){
			System.out.println();
			System.out.println(+a+ " é menor que 100.");
			
		}else if (a == 100){
			System.out.println();
			System.out.println(+a+ " é igual a 100.");
		}
	}

}
