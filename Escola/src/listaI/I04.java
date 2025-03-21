package listaI;

import java.util.Scanner;

	/* Desenvolva  um  programa  para  ler  um  número  e  apresentar  
	 * os  resultados  da  tabuada  deste número.*/
	
public class I04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner( System.in);
		int n;
		
		System.out.println("Digite um número");
		n = leia.nextInt();
		
		for (int t=1;t<=10;t++){
			
			System.out.println(+n+ " x " +t+ " = " +n*t);
			
		}
	}

}
