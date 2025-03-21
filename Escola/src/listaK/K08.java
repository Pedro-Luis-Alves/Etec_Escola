package listaK;

import java.util.Scanner;

/* Desenvolva um programa para  realizar uma  elei��o entre  dois candidatos  ao cargo de  
	 * gerente de uma empresa. O programa dever� apresentar o nome dos candidatos 
	 * (Fujiro NaKombi e Takaro N�)  para  a  escolha  dos  eleitores. 
	 *  Ao  final  o  programa dever�  indicar  qual  ser�  o  novo  gerente  da empresa,  o  total  de  votos e  o 
	 * percentual  de  votos  de  cada  candidato.  Se  ocorrer  um  empate, 
	 * o mesmo  dever�  ser  indicado  e  o  programa  dever�  solicitar  um  voto  de  desempate. 
	 * O  programa dever� realizar a  pesquisa enquanto houver a solicita��o de  uma nova entrada 
	 * de  dados  atrav�s da vari�vel RESP.
	 * */

public class K08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int resp, v, tov = 0, vf = 0, vt = 0;
		float percF, percT;
		
		
		do{
			
			System.out.println();
			System.out.println("Pra quem vai seu voto?\nDigite 1 para Fujiro NaKombi\nDigite 2 para Takaro N�");
			v = leia.nextInt();
			
			if (v == 1){
				tov += 1;
				vf += 1;
				
			}else if (v == 2){
				tov += 1;
				vt += 1;
				
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Voc� quer continuar com a vota��o?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a vota��o.");
			resp = leia.nextInt();
			
		}while (resp == 1);
		
		percF = (vf/tov*100);
		percT = (vt/tov*100);
		
	
			 System.out.println();
			 System.out.println("------------RESULTADO------------");
			 System.out.println();
			
			 if (vf > vt){
				 System.out.println("O vencedor � Fujiro NaKombi! com " +vf+ " votos, uma porcentagem de " +percF);
			 
			 }else  if (vt > vf){
				 System.out.println("O vencedor � Takaro N�! com " +vt+ " votos, uma porcentagem de " +percT);
			 
			 }else if (vt == vf){
				 
				 System.out.println("Temos um empate! � necess�rio mais um voto para decidir o vencedor");
				 System.out.println();
				 
				 System.out.println("Pra quem vai seu voto?\nDigite 1 para Fujiro NaKombi\nDigite  2 para Takaro N�");
					v = leia.nextInt();
					
					if (v == 1){
						tov += 1;
						vf += 1;
						
					}else if (v == 2){
						tov += 1;
						vt += 1;
						
					}
				 
					 if (vf > vt){
						 System.out.println("O vencedor � Fujiro NaKombi! com " +vf+ " votos, uma porcentagem de " +percF);
					 
					 }else  if (vt > vf){
						 System.out.println("O vencedor � Takaro N�! com " +vt+ " votos, uma porcentagem de " +percT);
					 
					 }
					
			 }
		}
	}


