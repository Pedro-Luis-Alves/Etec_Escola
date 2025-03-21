package ano2_trabalhos;

import java.util.Iterator;
import java.util.Scanner;

public class A3_EliminacaoDeDuplicatas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int array[] = new int[5]; 
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println();
			System.out.println("Digite o valor na posição " +i+ " do array");
			array[i] = read.nextInt();
			
			if (array[i] < 10 || array[i] > 100) {
				
				System.out.println();
				System.out.println("Esse número não é válido,precisa ser um número entre 10 e 100.\nPor favor, tente novamente");
				i--;
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
				if (array[i] == array[j]) {
					System.out.print("	");
				}else { 
					System.out.print(array[i]);
				}
			}
			
		}
		
	}
}