package listaI;

import java.util.Scanner;

/* Desenvolva  um  programa  para  realizar  uma  pesquisa  de  saga  de  filmes  com  20  pessoas.  
		 *O programa  dever�  solicitar  a  op��o  de  melhor  saga  de  filme  para  o  usu�rio. 
		 *As  sagas  concorrentes s�o: Matrix e Senhor dos An�is. Ao final o programa dever� indicar qual
		 *foi � saga vencedora e o total de votos de cada saga. Se ocorrer um empate, o mesmo dever� ser 
		 *indicado
		 */

public class I09 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int matrix=0,SDA=0,filme;
									
		System.out.println("Use 1 para votar em Senhor dos An�is");
		System.out.println("Use 2 para votar em Matrix");
		System.out.println();
		
		for (int qp=1;qp<=20;qp++){
			System.out.println("voto n�mero " +qp );
			filme =  leia.nextInt(); 
			
			if (filme == 2){
				matrix += 1;
			}else if (filme == 1){
				SDA += 1;
			}else {
				System.out.println("essa n�o � uma das op��es");
			}}
			if (matrix>SDA){
				System.out.println("Matrix � o melhor!!");
			}else if (SDA>matrix) {
				System.out.println("Senhor dos An�is � melhor!!!");
			}else if (SDA==matrix){
				System.out.println("EMPATE!!!");
			}
			
		}
	}


