package listaK;

import java.util.Scanner;

/*Desenvolva um programa para uma empresa fazer um pesquisa de mercado para saber se as
pessoas gostaram ou n�o de um novo produto lan�ado no mercado. Para isso, o programa dever�
solicitar o sexo do entrevistado e sua resposta (sim ou n�o). O programa dever� realizar a pesquisa
at� que a entrada de dados seja finalizada atrav�s da vari�vel RESP. Ao final o programa dever�
apresentar os seguintes resultados:

*	- O n�mero de pessoas do sexo feminino que responderam sim;
	- O n�mero de pessoas do sexo masculino que responderam n�o;
	- A porcentagem de pessoas do sexo feminino que responderam n�o;
	- A porcentagem de pessoas do sexo masculino que responderam sim;
*/

public class K05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int resp, s, r, H = 0, HN = 0, HS = 0, M = 0, MS = 0, MN = 0;
		float percHS, percMN;
		
		do{
			
			System.out.println();
			System.out.println("Qual o g�nero do entrevistado?\nDigite 1 para MASCULINO\nDigite 2 para FEMININO");
			s = leia.nextInt();
			
			 System.out.println();
			 System.out.println("Voc� gostou do produto?\nDigite 1 para SIM.\nDigite 2 para N�O.");
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
			 System.out.println("Voc� quer continuar com a entrevista?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a entrevista. ");
			 resp = leia.nextInt();

		}while (resp==1);
			 			 
			 percMN = (MN*100)/M;
			 percHS = (HS*100)/H;
			
			 System.out.println();
			 System.out.println("------------RESULTADOS------------");
			 System.out.println();
			 
			 System.out.println("O n�mero de pessoas do sexo feminino que responderam sim: " +MS);
			 System.out.println("O n�mero de pessoas do sexo masculino que responderam n�o: " +HN);
			 System.out.println("A porcentagem de pessoas do sexo feminino que responderam n�o: " +percMN);
			 System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim" +percHS);
			 
	}

}
