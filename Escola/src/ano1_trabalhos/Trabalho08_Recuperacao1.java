package ano1_trabalhos;

import java.util.Scanner;

/*Desenvolvaum programa para apoiar a realiza��ouma elei��o entre dois candidatos ao cargo  de  presidente  da  CBF  
	 * (Confedera��o  Brasileira de  Futebol).  O  programa  dever� apresentar o nome dos candidatos (Rivaldo e Edilson)
	 *  para a escolha dos eleitores. Ao final o programa dever� indicar qual ser� o novo presidente da entidade, o total de 
	 *  votos e o percentual de votos de cada candidato. Se ocorrer um empate, o mesmo dever� ser indicado  e  o  programa  
	 *  dever�  solicitar  um  voto  de  desempate.  O  programa  dever� realizar o registro de votos, enquanto houvereleitores
	 *   para votar.*/

public class Trabalho08_Recuperacao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int resp, v, tov = 0, vr = 0, ve = 0;
		float percR, percE;
		
		
		do{
			
			System.out.println();
			System.out.println("Pra quem vai seu voto?\nDigite 1 para Rivaldo\nDigite 2 para Edilson");
			v = leia.nextInt();
			
			if (v == 1){
				tov += 1;
				vr += 1;
				
			}else if (v == 2){
				tov += 1;
				ve += 1;
				
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Voc� quer continuar com a vota��o?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a vota��o.");
			resp = leia.nextInt();
			
		}while (resp == 1);
		
		percR = (vr/tov*100);
		percE = (ve/tov*100);
		
	
			 System.out.println();
			 System.out.println("------------RESULTADO------------");
			 System.out.println();
			
			 if (vr > ve){
				 System.out.println("O vencedor � Rivaldo! com " +vr+ " votos, uma porcentagem de " +percR);
			 
			 }else  if (ve > vr){
				 System.out.println("O vencedor � Edilson! com " +ve+ " votos, uma porcentagem de " +percE);
			 
			 }else if (ve == vr){
				 
				 System.out.println("Temos um empate! � necess�rio mais um voto para decidir o vencedor");
				 System.out.println();
				 
				 System.out.println("Pra quem vai seu voto?\nDigite 1 para Rivaldo\nDigite 2 para Edilson");
					v = leia.nextInt();
					
					if (v == 1){
						tov += 1;
						vr += 1;
						
					}else if (v == 2){
						tov += 1;
						ve += 1;
						
					}
				 
					 if (vr > ve){
						 System.out.println("O vencedor � Rivaldo! com " +vr+ " votos, uma porcentagem de " +percR);
					 
					 }else  if (ve > vr){
						 System.out.println("O vencedor � Edilson! com " +ve+ " votos, uma porcentagem de " +percE);
					 
					 }
					
			 }
		}
	}
