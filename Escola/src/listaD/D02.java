package listaD;

import java.util.Scanner;

	/* Desenvolva  um  programa  que  leia  um  n�mero  
	 * e  informe  se  este  n�mero  �  maior, menor ou 
	 * igual a 100.*/

public class D02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a;

		System.out.println("Digite o valor do n�mero");
		a = leia.nextInt();
		
		if (a > 100){
			System.out.println();
			System.out.println(+a+ " � maior que 100.");
			
		}else if (100 > a){
			System.out.println();
			System.out.println(+a+ " � menor que 100.");
			
		}else if (a == 100){
			System.out.println();
			System.out.println(+a+ " � igual a 100.");
		}
	}

}
