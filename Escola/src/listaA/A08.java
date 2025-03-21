package listaA;

import java.util.Scanner;

/*Desenvolva  um  programa  para  ler  dois  valores  para  as  variáveis  A  e  B, efetuar  a  troca  dos valores 
	 * de forma que a variável A passe a possuir o valor da variável B e que a variável B passe a possuir o valor da variável A.
	 * Apresentar os valores trocados.*/

public class A08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b;
		
		
		System.out.println("Digite o valor da variável A");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor da variável B");
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
