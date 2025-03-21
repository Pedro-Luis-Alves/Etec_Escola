
package listaI;
	
		/*Desenvolva  um  programa  para  apresentar  todos  os  valores  
		 * numéricos  inteiros  ímpares situados na faixa de 0 à 50. Para
		 * verificar se o número é impar, efetuar dentro do laço a 
		 * verificação lógica desta condição com a instrução if, perguntando
		 * se o número é impar. Sendo, mostre-o.
		 * */

public class I12 {

	public static void main(String[] args) {
		
		for (int i=0;i<=50;i++){
			if (i % 2 !=0) {
				System.out.println("O número " +i+ " é impar.");
			}else {
				System.out.println();
			}
		}
	}

}
