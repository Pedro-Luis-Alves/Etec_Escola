package ano2_trabalhos;

import java.util.Iterator;
import java.util.Scanner;

public class A3_EliminacaoDeDuplicatas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		int array[] = new int[5]; 
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println();
			System.out.println("Digite o valor na posi��o " +i+ " do array");
			array[i] = read.nextInt();
			
			if (array[i] < 10 || array[i] > 100) {
				
				System.out.println();
				System.out.println("Esse n�mero n�o � v�lido,precisa ser um n�mero entre 10 e 100.\nPor favor, tente novamente");
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