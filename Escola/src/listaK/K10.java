package listaK;

import java.util.Scanner;

/*Desenvolva  um  programa  para  calcular  a  soma  de  todos  os  numero  impares  de  0  �  20  e  
	 * a multiplica��o de todos os n�meros pares de 0 � 20.*/

public class K10 {

	public static void main(String[] args) {
		
		

		Scanner leia = new Scanner (System.in);
		long i = 1, im = 1, p = 1, soma = 0, mult = 0;

		do{
			i++;
			
			if ((i % 2) == 0){
				
				p *= i;
				
			}else {
				
				im += i;
				
			}
		
		}while ( i <= 19);
		
		System.out.println("Soma dos �mpares �: " +im);
		System.out.println("Multiplica��o dos pares �: "+p);
		
	}

}
