package listaA;

import java.util.Scanner;

/*Desenvolva  um  programa  para  ler  dois  valores  para  as  vari�veis  A  e  B, efetuar  a  troca  dos valores 
	 * de forma que a vari�vel A passe a possuir o valor da vari�vel B e que a vari�vel B passe a possuir o valor da vari�vel A.
	 * Apresentar os valores trocados.*/

public class A08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Digite o valor da vari�vel A");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor da vari�vel B");
		b = leia.nextInt();
		
		a = a^b;
		b = b^a;
		a = a^b;
		
		System.out.println("---------------");
		System.out.println();
		System.out.println("Agora o valor de A foi trocado para: " +a);
		System.out.println("E o valor de B foi trocado para: " +b);
		
	}

}
