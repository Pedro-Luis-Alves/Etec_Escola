package listaD;

import java.util.Scanner;

		/* Desenvolva um programa para ler dois números e realizar a divisão do maior pelo menor, apresentando 
		 * o resultado. */

public class D08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, r;
		
		System.out.println("Digite o valor do primeiro número");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo número");
		b = leia.nextInt();
		
		if (a > b){
		
			r = a/b;
			System.out.println(+a+ " dividido por " +b+ " é igual á " +r);
			
		}else if (b > a){
		
			r = b/a;
			System.out.println(+b+ " dividido por " +a+ " é igual á " +r);
			
		}
		
	}

}
