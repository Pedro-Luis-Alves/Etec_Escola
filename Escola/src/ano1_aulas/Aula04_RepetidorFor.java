package ano1_aulas;

import java.util.Scanner;

public class Aula04_RepetidorFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.println("Digite a quantidade de vezes que deseja ver a mensagem");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++){
			System.out.println("Olá,Mundo " +i);
		}

	}

}
