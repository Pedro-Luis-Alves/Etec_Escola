package listaD;

import java.util.Scanner;

/* Desenvolva  um  programa  para  realizar  a  leitura  de  um  n�mero  entre  0  e  10.  
		 * O programa dever� apresentar a descri��o deste n�mero. Exemplo: 9 �nove.*/

public class D06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a;
		
		System.out.println("Digite o valor de  um  n�mero  entre  0  e  10.");
		a = leia.nextInt();
		
		if (a == 1){
			
			System.out.println(+a+ " -um");
			
		}else if (a == 2){
			
			System.out.println(+a+ " -dois");
			
		}else if (a == 3){
			
			System.out.println(+a+ " -tr�s");
			
		}else if (a == 4){
			
			System.out.println(+a+ " -quatro");
			
		}else if (a == 5){
			
			System.out.println(+a+ " -quinto");
			
		}else if (a == 6){
			
			System.out.println(+a+ " -seis");
			
		}else if (a == 7){
			
			System.out.println(+a+ " -sete");
			
		}else if (a == 8){
			
			System.out.println(+a+ " -oito");
			
		}else if (a == 9){
			
			System.out.println(+a+ " -nove");
			
		}else {
			
			System.out.println("Esse n�mero n�o pode ser aceito, tem de ser um n�mero entre 0 e 10.");
			
		}
	}

}
