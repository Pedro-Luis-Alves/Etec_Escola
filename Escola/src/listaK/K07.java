package listaK;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de saga de filmes. O programa dever�
solicitar a op��o de melhor saga de filme para o usu�rio. As sagas concorrentes s�o: Matrix e
Senhor dos An�is. Ao final o programa dever� indicar qual foi � saga vencedora e o total de votos
de cada saga. Se ocorrer um empate, o mesmo dever� ser indicado. O programa dever� realizar a
pesquisa at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP.*/


public class K07 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int v, vm = 0, vs = 0, resp;
		
		do{
			
			System.out.println();
			System.out.println("Qual saga voc� prefere \n1 - Matrix \n2 - Senhor dos Aneis");
			v = leia.nextInt();
			
			if (v == 1){
				vm += 1;
			}else if (v == 2){
				vs += 1;
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Voc� quer continuar com a entrevista?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a entrevista.");
			resp = leia.nextInt();
			
		}while (resp == 1);
		
		
			 System.out.println();
			 System.out.println("------------RESULTADO------------");
			 System.out.println();
		
			if (vs < vm){
				System.out.println("Matrix � o vencedor com " +vm+ " votos");
			}else if (vm < vs){
				System.out.println("Senhor Dos An�is � o vencedor com " +vs+ " votos");
			}else if (vs == vm){
				System.out.println("Empate com o n�mero de votos: " +vs);
			}
			
			
	}

}
