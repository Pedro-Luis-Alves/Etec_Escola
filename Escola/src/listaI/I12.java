
package listaI;
	
		/*Desenvolva  um  programa  para  apresentar  todos  os  valores  
		 * num�ricos  inteiros  �mpares situados na faixa de 0 � 50. Para
		 * verificar se o n�mero � impar, efetuar dentro do la�o a 
		 * verifica��o l�gica desta condi��o com a instru��o if, perguntando
		 * se o n�mero � impar. Sendo, mostre-o.
		 * */

public class I12 {

	public static void main(String[] args) {
		
		for (int i=0;i<=50;i++){
			if (i % 2 !=0) {
				System.out.println("O n�mero " +i+ " � impar.");
			}else {
				System.out.println();
			}
		}
	}

}
