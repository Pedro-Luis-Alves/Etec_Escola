package listaD;

import java.util.Scanner;

		/* Desenvolvaum programa para ler dois valores 
		 * num�ricos e apresentar a diferen�a do maior 
		 * pelo menor.*/

public class D04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, d;
		
		
		System.out.println("Digite o valor do primeiro n�mero");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo n�mero");
		b = leia.nextInt();
		
		if (a > b){
			
			d = a - b;
			System.out.println();
			System.out.println("A diferen�a entre " +a+ " e " +b+ " � de " +d);
		}else if (b > a){
			
			d = b - a;
			System.out.println();
			System.out.println("A diferen�a entre " +b+ " e " +a+ " � de " +d);
		}else if (a == b) {
			
			System.out.println();
			System.out.println("N�o existe diferen�a entre os dois n�meros");
		}
	}

}
