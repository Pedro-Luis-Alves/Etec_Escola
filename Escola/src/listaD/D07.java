package listaD;

import java.util.Scanner;

/* Desenvolva um programa para ler um n�mero e verificar se o mesmo � menor que 5, maior que 10 ou entre 5 e 10.*/

public class D07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero .");
		n = leia.nextInt();
		
		if (n < 5){
			
			System.out.println();
			System.out.println(+n+ " � menor que 5");
			
		}else if (n > 10){
			
			System.out.println();
			System.out.println(+n+ " � maior que 10");
			
		}else if ((n > 5)&&(n < 10)){
			
			System.out.println();
			System.out.println(+n+ " est� entre 5 e 10");
			
		}

	}

}
