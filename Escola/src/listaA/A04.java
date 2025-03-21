package listaA;

import java.util.Scanner;

	/*Desenvolva  um programa para  ler o raio e a  altura  de  uma  lata  de  óleo e calcular o valor do seu volume,
	 *utilizando a fórmula: VOLUME=3.14159*R*R*ALTURA.*/

public class A04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, r, v;
		
		System.out.println("Digite o valor do Raio");
		r = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do Altura");
		a = leia.nextInt();
		
		v= 3.14159 * r * r * a;
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("O Volume da lata de óleo é " +v+ ".");
	}

}
