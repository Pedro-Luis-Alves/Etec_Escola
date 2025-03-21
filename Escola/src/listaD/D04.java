package listaD;

import java.util.Scanner;

		/* Desenvolvaum programa para ler dois valores 
		 * numéricos e apresentar a diferença do maior 
		 * pelo menor.*/

public class D04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, d;
		
		
		System.out.println("Digite o valor do primeiro número");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do segundo número");
		b = leia.nextInt();
		
		if (a > b){
			
			d = a - b;
			System.out.println();
			System.out.println("A diferença entre " +a+ " e " +b+ " é de " +d);
		}else if (b > a){
			
			d = b - a;
			System.out.println();
			System.out.println("A diferença entre " +b+ " e " +a+ " é de " +d);
		}else if (a == b) {
			
			System.out.println();
			System.out.println("Não existe diferença entre os dois números");
		}
	}

}
