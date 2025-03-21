package listaK;

import java.util.Scanner;

/* Desenvolva  um  programa  para  uma  empresa  fazer  um  pesquisa  de  mercado  para  saber  se  as 
	 * pessoas  gostaram  ou  não  de  um  novo  produto  lançado  no  mercado.  Para  isso,  o  programa  
	 * deverá solicitar o sexo do entrevistado e sua resposta (sim ou não). O programa deverá realizar a 
	 * pesquisa até  que  a  entrada  de  dados  seja  finalizada  através  da  variável  RESP.  
	 * Ao  final  o  programa  deverá apresentar os seguintes resultados:
	 * 
	 * -O total de pessoas que responderam sim;
	 * -O total de pessoas que foram entrevistadas;
	 * -A porcentagem de pessoas do sexo feminino que responderam não;
	 * -A porcentagem de pessoas do sexo masculino que responderam sim.
	 * */

public class K03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int tp = 0, resp, s, v, tM = 0, tMS = 0, tF = 0, tFN = 0, ts = 0;
		float percMS, percFN;
		
		
		do{
			tp += 1;
			
			System.out.println("Qual o sexo do intrevistado?\n1 para Masculino\n2 para Feminino");
			s = leia.nextInt();
			System.out.println();
			
			System.out.println("Você gostou do produto?\nUse 1 para SIM\nUse 2 para NÃO");
					v = leia.nextInt();
					
					if ((v == 1)||(v == 1)&&(s == 2)){
						ts++;
					}
							
					if ((v == 1)&&(s == 1)){
						tMS++;
					}

					else if ((v == 2)&&(s == 2)){
						tFN++;
					}
	
					System.out.println();
	
		System.out.println("Você quer continuar com a entrevista?\nDigite 1 para Sim\nOu qualquer outro número para terminar a entrevista ");
		resp = leia.nextInt();
		System.out.println();
					
				}while (resp == 1);
				
		
		
		
		percMS = (tM*100)/tp;
		percFN = (tF*100)/tp;
			
		
		
			System.out.println("------------RESULTADOS------------");
		
			System.out.println("O total de pessoas que responderam sim: " +ts); 
			System.out.println("O total de pessoas que foram entrevistadas: " +tp);
			System.out.println("A porcentagem de pessoas do sexo feminino que responderam não: " +percFN);
			System.out.println("A porcentagem de pessoas do sexo masculino que responderam sim: " +percMS);
	
	}
}
