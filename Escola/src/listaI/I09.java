package listaI;

import java.util.Scanner;

/* Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes  com  20  pessoas.  
		 *O programa  deverá  solicitar  a  opção  de  melhor  saga  de  filme  para  o  usuário. 
		 *As  sagas  concorrentes são: Matrix e Senhor dos Anéis. Ao final o programa deverá indicar qual
		 *foi à saga vencedora e o total de votos de cada saga. Se ocorrer um empate, o mesmo deverá ser 
		 *indicado
		 */

public class I09 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int matrix=0,SDA=0,filme;
									
		System.out.println("Use 1 para votar em Senhor dos Anéis");
		System.out.println("Use 2 para votar em Matrix");
		System.out.println();
		
		for (int qp=1;qp<=20;qp++){
			System.out.println("voto número " +qp );
			filme =  leia.nextInt(); 
			
			if (filme == 2){
				matrix += 1;
			}else if (filme == 1){
				SDA += 1;
			}else {
				System.out.println("essa não é uma das opções");
			}}
			if (matrix>SDA){
				System.out.println("Matrix é o melhor!!");
			}else if (SDA>matrix) {
				System.out.println("Senhor dos Anéis é melhor!!!");
			}else if (SDA==matrix){
				System.out.println("EMPATE!!!");
			}
			
		}
	}


