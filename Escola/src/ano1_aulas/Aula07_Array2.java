package ano1_aulas;

import java.util.Scanner;

public class Aula07_Array2 {

	public static void main(String[] args) {

		Scanner  leia = new Scanner(System.in); 
		
		int v[] = new int[3];
		float p[] = new float[7];
		int soma = 0;
		
		for (int i=0; i<3; i++){
		
		System.out.println("Digite um valor");
		v[i] = leia.nextInt();
		
		soma += v[i];
		
		}
		
		System.out.println();
		System.out.println("-----------------------");
		System.out.println();
		
		for(int i=0; i<3; i++) {
		
		System.out.println(v[i]);
		
		}
		
		
		System.out.println();
		System.out.println("Soma: " +soma);
		
	}

}
