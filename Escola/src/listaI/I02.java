package listaI;

 
/* Desenvolva um programa para apresentar as letras de “a” até “z” 
 * em ordem crescente e depois em ordem decrescente
 **/

public class I02 {

	public static void main(String[] args) {
		
		char le;
		
		for(le='a';le<='z';le++) {
			System.out.println(le);
		}

		
		for(le='z';le>='a';le--) {
			System.out.println(le);
		}

	}

}
