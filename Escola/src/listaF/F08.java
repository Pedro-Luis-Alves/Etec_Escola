package listaF;

import java.util.Scanner;

/*Desenvolva  um  programa  para  efetuar  a  
		 * leitura  de  três  valores  (A,  B  e  C)  e 
		 * apresentar  os valores dispostos em ordem 
		 * crescente.*/

public class F08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor de A");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor de B");
		b = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor de C");
		c = leia.nextInt();
		
		
		
		if ((a > b)&&(b > c)){
			
			System.out.println();
			System.out.println("Primeiro: " +a);
			System.out.println("Segundo: " +b);
			System.out.println("Terceiro: " +c);
			
		}else if ((a > c)&&(c > b)){
			
			System.out.println();
			System.out.println("Primeiro: " +a);
			System.out.println("Segundo: " +c);
			System.out.println("Terceiro: " +b);
			
		}else if ((b > a)&&(a > c)){
			
			System.out.println();
			System.out.println("Primeiro: " +b);
			System.out.println("Segundo: " +a);
			System.out.println("Terceiro: " +c);
			
		}else if ((b > c)&&(c > a)){
			
			System.out.println();
			System.out.println("Primeiro: " +b);
			System.out.println("Segundo: " +c);
			System.out.println("Terceiro: " +a);
			
		}else if ((c > a)&&(a > b)){
			
			System.out.println();
			System.out.println("Primeiro: " +c);
			System.out.println("Segundo: " +a);
			System.out.println("Terceiro: " +b);
			
		}else if ((c > b)&&(b > a)){
			
			System.out.println();
			System.out.println("Primeiro: " +c);
			System.out.println("Segundo: " +b);
			System.out.println("Terceiro: " +a);
			
		}
	}

}
