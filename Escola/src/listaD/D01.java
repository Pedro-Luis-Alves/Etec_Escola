package listaD;

import java.util.Scanner;

/* Desenvolva um programa que leia dois valores e 
	 * informe qual dos valores � o maior. Se os n�meros 
	 * forem iguais, o programa dever� indicar esta 
	 * igualdade.*/

public class D01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Digite o valor do primeiro n�mero");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo n�mero");
		b = leia.nextInt();
		
		if (a > b){
			System.out.println();
			System.out.println(+a+ " � maior que " +b);
		}else if (b > a){
			System.out.println();
			System.out.println(+b+ " � maior que " +a);
		}else if (a == b){
			System.out.println();
			System.out.println(+a+ " e " +b+ " s�o iguais." );
		}

	}

}
