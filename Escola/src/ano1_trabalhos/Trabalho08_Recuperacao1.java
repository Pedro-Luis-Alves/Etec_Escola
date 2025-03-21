package ano1_trabalhos;

import java.util.Scanner;

/*Desenvolvaum programa para apoiar a realizaçãouma eleição entre dois candidatos ao cargo  de  presidente  da  CBF  
	 * (Confederação  Brasileira de  Futebol).  O  programa  deverá apresentar o nome dos candidatos (Rivaldo e Edilson)
	 *  para a escolha dos eleitores. Ao final o programa deverá indicar qual será o novo presidente da entidade, o total de 
	 *  votos e o percentual de votos de cada candidato. Se ocorrer um empate, o mesmo deverá ser indicado  e  o  programa  
	 *  deverá  solicitar  um  voto  de  desempate.  O  programa  deverá realizar o registro de votos, enquanto houvereleitores
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
			System.out.println("Você quer continuar com a votação?\nDigite 1 para Sim, Ou qualquer outro número para terminar a votação.");
			resp = leia.nextInt();
			
		}while (resp == 1);
		
		percR = (vr/tov*100);
		percE = (ve/tov*100);
		
	
			 System.out.println();
			 System.out.println("------------RESULTADO------------");
			 System.out.println();
			
			 if (vr > ve){
				 System.out.println("O vencedor é Rivaldo! com " +vr+ " votos, uma porcentagem de " +percR);
			 
			 }else  if (ve > vr){
				 System.out.println("O vencedor é Edilson! com " +ve+ " votos, uma porcentagem de " +percE);
			 
			 }else if (ve == vr){
				 
				 System.out.println("Temos um empate! É necessário mais um voto para decidir o vencedor");
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
						 System.out.println("O vencedor é Rivaldo! com " +vr+ " votos, uma porcentagem de " +percR);
					 
					 }else  if (ve > vr){
						 System.out.println("O vencedor é Edilson! com " +ve+ " votos, uma porcentagem de " +percE);
					 
					 }
					
			 }
		}
	}
