package listaD;

import java.util.Scanner;

/* Desenvolva um programa que leia dois valores e 
	 * informe qual dos valores é o maior. Se os números 
	 * forem iguais, o programa deverá indicar esta 
	 * igualdade.*/

public class D01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Digite o valor do primeiro número");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo número");
		b = leia.nextInt();
		
		if (a > b){
			System.out.println();
			System.out.println(+a+ " é maior que " +b);
		}else if (b > a){
			System.out.println();
			System.out.println(+b+ " é maior que " +a);
		}else if (a == b){
			System.out.println();
			System.out.println(+a+ " e " +b+ " são iguais." );
		}

	}

}
