package listaD;

import java.util.Scanner;

		/* Desenvolva um programa para ler dois n�meros e realizar a divis�o do maior pelo menor, apresentando 
		 * o resultado. */

public class D08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, r;
		
		System.out.println("Digite o valor do primeiro n�mero");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo n�mero");
		b = leia.nextInt();
		
		if (a > b){
		
			r = a/b;
			System.out.println(+a+ " dividido por " +b+ " � igual � " +r);
			
		}else if (b > a){
		
			r = b/a;
			System.out.println(+b+ " dividido por " +a+ " � igual � " +r);
			
		}
		
	}

}
