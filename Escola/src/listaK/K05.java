package listaK;

import java.util.Scanner;

/*Desenvolva um programa para uma empresa fazer um pesquisa de mercado para saber se as
pessoas gostaram ou não de um novo produto lançado no mercado. Para isso, o programa deverá
solicitar o sexo do entrevistado e sua resposta (sim ou não). O programa deverá realizar a pesquisa
até que a entrada de dados seja finalizada através da variável RESP. Ao final o programa deverá
apresentar os seguintes resultados:

*	- O número de pessoas do sexo feminino que responderam sim;
	- O número de pessoas do sexo masculino que responderam não;
	- A porcentagem de pessoas do sexo feminino que responderam não;
	- A porcentagem de pessoas do sexo masculino que responderam sim;
*/

public class K05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int resp, s, r, H = 0, HN = 0, HS = 0, M = 0, MS = 0, MN = 0;
		float percHS, percMN;
		
		do{
			
			System.out.println();
			System.out.println("Qual o gênero do entrevistado?\nDigite 1 para MASCULINO\nDigite 2 para FEMININO");
			s = leia.nextInt();
			
			 System.out.println();
			 System.out.println("Você gostou do produto?\nDigite 1 para SIM.\nDigite 2 para NÃO.");
			 r = leia.nextInt();
			
			 if ((s == 2)&&(r == 1)) {
				 MS += 1;
				 M += 1;
				 
			 }else if ((s == 2)&&(r == 2)){
				 MN += 1;
				 M += 1;
				 
			 }else if ((s == 1)&&(r == 1)){
				 HS += 1;
				 H += 1;
				 
			 }else if ((s == 1)&&(r == 2)){
				 HN += 1;
				 H += 1;
				 
			 }
				 		 
				 System.out.println();
			 System.out.println("Você quer continuar com a entrevista?\nDigite 1 para Sim, Ou qualquer outro número para terminar a entrevista. ");
			 resp = leia.nextInt();

		}while (resp==1);
			 			 
			 percMN = (MN*100)/M;
			 percHS = (HS*100)/H;
			
			 System.out.println();
			 System.out.println("------------RESULTADOS------------");
			 System.out.println();
			 
			 System.out.println("O número de pessoas do sexo feminino que responderam sim: " +MS);
			 System.out.println("O número de pessoas do sexo masculino que responderam não: " +HN);
			 System.out.println("A porcentagem de pessoas do sexo feminino que responderam não: " +percMN);
			 System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim" +percHS);
			 
	}

}
