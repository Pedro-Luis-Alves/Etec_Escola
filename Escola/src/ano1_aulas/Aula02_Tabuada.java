package ano1_aulas;

import java.util.Scanner;

public class Aula02_Tabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n, r;

		System.out.println("Digite a tabuada desejada");
		n = leia.nextInt();
		
		for (int i=1; i<=10; i++){
			r = n*i;
			System.out.println( +n+" x " +i+ " = " +r);
		}
	}

}
