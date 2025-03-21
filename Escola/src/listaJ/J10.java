package listaJ;

	/*Desenvolva  um  programa  para  realizar  uma  pesquisa  de  mercado  sobre  os  automóveis: CORSA,
	 * PALIO e GOL. O programa deverá receber o voto de cada entrevistado e ao final deverá apresentar  a  
	 * colocação,  o  total  de  votos  e  o  percentual  de  votos  de  cada  automóvel.  Os  possíveis 
	 * empates também deverão ser verificados. O programa deverá realizar a pesquisa enquanto houver a 
	 * solicitação de uma nova entrada de dados através da variável RESP.
	 * */

import java.util.Scanner;

public class J10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int resp, voto, tVotos = 0, tCorsa = 0, tPalio = 0, tGol = 0;
		float  pCorsa = 0, pPalio = 0, pGol = 0;
		
		
		System.out.println("Deseja registrar um voto?\n1 - SIM ou outro número qualquer para NÃO.");
		resp = leia.nextInt();
		
		while (resp == 1){
			System.out.println();
			System.out.println("Qual o seu voto?\n1 - CORSA \n2 - PALIO \n3 - GOL ");
			voto = leia.nextInt();
			tVotos++;
			
			switch(voto) {
			
			case 1:
				tCorsa++;
				
			break;
			
			case 2:
				tPalio++;
				
			break;
				
			case 3:
				tGol++;
				
			break;
			}
			
			pCorsa = (tCorsa/tVotos*100);
			pPalio = (tPalio/tVotos*100);
			pGol = (tGol/tVotos*100);
			
			System.out.println();
			System.out.println("Deseja registrar outro voto?\n1 - SIM ou outro número qualquer para NÃO.");
			resp = leia.nextInt();
			
			if (resp != 1){
				System.out.println("----------------RESULTADOS DA VOTAÇÃO----------------");
				
				if ((pCorsa>pPalio)){
					
				}
				
				
				
				System.out.println();
				System.out.println("Total de votos: " +tVotos);
				System.out.println("Total de votos por CORSA: " +tCorsa+ ", sendo " +pCorsa+ "% do total de votos.");
				System.out.println("Total de votos por PALIO: " +tPalio+ ", sendo " +pPalio+ "% do total de votos.");
				System.out.println("Total de votos por GOL: " +tGol+ ", sendo " +pGol+ "% do total de votos."); 
			}
		}
	}

}
