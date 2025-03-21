package listaF;

import java.util.Scanner;

/* Efetuar a leitura de cinco números inteiros e 
		 * identificar o maior e o menor valores.*/

public class F10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a, b, c, d, e;
		
		System.out.println("Digite o primeiro valor");
		a = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o segundo valor");
		b = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o terceiro valor");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o quarto valor");
		d = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o quinto valor");
		e = leia.nextInt();

		
		System.out.println("-------------------");
		
		if ((a > b)&&(a > c)&&(a > d)&&(a > e)){
					
			System.out.println();
			System.out.println("Maior: " +a);
	      
		}else if ((b > a)&&(b > c)&&(b > d)&&(b > e)){
			
			System.out.println();
			System.out.println("Maior: " +b);
			
        }else if ((c > a)&&(c > b)&&(c > d)&&(c > e)){
			
			System.out.println();
			System.out.println("Maior: " +c);
			
        }else if ((d > a)&&(d > b)&&(d > c)&&(d > e)){
			
			System.out.println();
			System.out.println("Maior: " +d);
			
        }else if ((e > a)&&(e > b)&&(e > c)&&(e > d)){
			
			System.out.println();
			System.out.println("Maior: " +e);
			
        }
		
		
		//-----------------------------------------------
		
		
		if ((a < b)&&(a < c)&&(a < d)&&(a < e)){

			System.out.println("Menor: " +a);
	      
		}else if ((b < a)&&(b < c)&&(b < d)&&(b < e)){

			System.out.println("Menor: " +b);
			
        }else if ((c < a)&&(c < b)&&(c < d)&&(c < e)){

			System.out.println("Menor: " +c);
			
        }else if ((d < a)&&(d < b)&&(d < c)&&(d < e)){
			
			System.out.println("Menor: " +d);
			
        }else if ((e < a)&&(e < b)&&(e < c)&&(e < d)){
			
			System.out.println("Menor: " +e);
			
        }
		
		
	}

}
