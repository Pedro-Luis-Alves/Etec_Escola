package listaK;

import java.util.Scanner;

/* Desenvolva  um  programa  para  realizar  uma  pesquisa  de  cursos  universit�rios  para  uma Universidade. 
	 * Os  cursos  que  estar�o  na  pesquisa s�o: Ci�ncia  da  Computa��o, Direito e  Letras.
	 *  O programa  dever�  receber  o  voto  de  cada  entrevistado  e  ao final  dever�  apresentar  a  coloca��o,  
	 *  o total  de  votos  e  o  percentual  de  votos  de  cada  curso.  Os  poss�veis  empates  tamb�m  dever�o  ser
	 *   verificados.  O  programa  dever�  realizar  a  pesquisa  enquanto  houver  a  solicita��o  de  uma  nova entrada 
	 *   de dados atrav�s da vari�vel RESP.*/

public class K09 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int resp, r, v = 0, vc = 0, vd = 0, vl = 0;
		float percC, percD, percL;
		
		
		do{
			
			System.out.println();
			System.out.println("Pra quem vai seu voto?\nDigite 1 para Ci�ncia  da  Computa��o\nDigite 2 para Direito\nDigite 3 para Letras");
			r = leia.nextInt();
			
			switch (r) {
			case 1:
				v += 1;
				vc += 1;
				break;
				
			case 2:
				v += 1;
				vd += 1;
				break;
			
			case 3:
				v += 1;
				vl += 1;
				break;
			
			default:
				break;}
				
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Voc� quer continuar com a vota��o?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a vota��o.");
			resp = leia.nextInt();
			
		}while (resp == 1);

		
		
		
		
			do {
				
				 
				 System.out.println("Temos um empate! � necess�rio mais um voto para decidir o vencedor");
				 System.out.println();
			 
				 System.out.println("Pra quem vai seu voto?\nDigite 1 para Ci�ncia  da  Computa��o\nDigite 2 para Direito\nDigite 3 para Letras");
					r = leia.nextInt();
					
					if (r == 1){
						v += 1;
						vc += 1;
						
					}else if (r == 2){
						v += 1;
						vd += 1;
						
					}else if (r == 3){
						v += 1;
						vl += 1;
					}
				
			}while ((vl == vd)&&(vd == vc)||(vl == vd)||(vl == vc)||(vd == vc));
			
			
			
		percC = (vc*100)/v;
		percD = (vd*100)/v;
		percL = (vl*100)/v;

		
		System.out.println();
		System.out.println("------------RESULTADO------------");
		System.out.println();
		
			 if ((vc > vd)&&(vd > vl)){
				 System.out.println("Em primeiro lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percC);
				 System.out.println("Em segundo lugar est� Direito, com " +vd+ " votos, uma porcentagem de " +percD);
				 System.out.println("Em terceiro lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
			
			 }else if ((vc > vl)&&(vl > vd)){
					 System.out.println("Em primeiro lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percC);
					 System.out.println("Em segundo lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
					 System.out.println("Em terceiro lugar est� Direito, com " +vd+ " votos, uma porcentagem de " +percD);
				 
			 }else if ((vd > vc)&&(vc > vl)){
				 System.out.println("Em primeiro lugar est� Direito, com " +vd+ " votos, uma porcentagem de " +percD);
				 System.out.println("Em segundo lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percL);
				 System.out.println("Em terceiro lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
			 
			 }else if ((vd > vl)&&(vl > vc)){
				 System.out.println("Em primeiro lugar est�  Direito, com " +vd+ " votos, uma porcentagem de " +percD);
				 System.out.println("Em segundo lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
				 System.out.println("Em terceiro lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percC);
			 
			 }else if ((vl > vc)&&(vc > vd)){
				 System.out.println("Em primeiro lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
				 System.out.println("Em segundo lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percC);
				 System.out.println("Em terceiro lugar est� Direito, com " +vd+ " votos, uma porcentagem de " +percD);
			 
			 }else if ((vl > vd)&&(vd > vc)){
				 System.out.println("Em primeiro lugar est� Letras, com " +vl+ " votos, uma porcentagem de " +percL);
				 System.out.println("Em segundo lugar est� Direito, com " +vd+ " votos, uma porcentagem de " +percD);
				 System.out.println("Em terceiro lugar est� Ci�ncia  da  Computa��o, com " +vc+ " votos, uma porcentagem de " +percC);				
			 }
	}
}
		
		

