package listaK;

import java.util.Scanner;

/*Desenvolva um programa para realizar uma pesquisa de saga de filmes. O programa deverá
solicitar a opção de melhor saga de filme para o usuário. As sagas concorrentes são: Matrix e
Senhor dos Anéis. Ao final o programa deverá indicar qual foi à saga vencedora e o total de votos
de cada saga. Se ocorrer um empate, o mesmo deverá ser indicado. O programa deverá realizar a
pesquisa até que a entrada de dados seja finalizada através da variável RESP.*/


public class K07 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int v, vm = 0, vs = 0, resp;
		
		do{
			
			System.out.println();
			System.out.println("Qual saga você prefere \n1 - Matrix \n2 - Senhor dos Aneis");
			v = leia.nextInt();
			
			if (v == 1){
				vm += 1;
			}else if (v == 2){
				vs += 1;
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Você quer continuar com a entrevista?\nDigite 1 para Sim, Ou qualquer outro número para terminar a entrevista.");
			resp = leia.nextInt();
			
		}while (resp == 1);
		
		
			 System.out.println();
			 System.out.println("------------RESULTADO------------");
			 System.out.println();
		
			if (vs < vm){
				System.out.println("Matrix é o vencedor com " +vm+ " votos");
			}else if (vm < vs){
				System.out.println("Senhor Dos Anéis é o vencedor com " +vs+ " votos");
			}else if (vs == vm){
				System.out.println("Empate com o número de votos: " +vs);
			}
			
			
	}

}
