package listaI;

/*
 * Desenvolva um programa para apresentar os n�meros de 1 at� 100 
 * em ordem crescente e depois em ordem decrescente.
 */

public class I01 {

	public static void main(String[] args) {
		
		for (int num=1; num<=100;num++){
			System.out.println(num);
		}
		
		for (int num=100;num>=1;num--){
			System.out.println(num);
		}
	}

}
