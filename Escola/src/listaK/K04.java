package listaK;

import java.util.Scanner;

/* Desenvolvaum  programa  para  uma  Universidade  realizar  uma  pesquisa  entre  os  alunos  que 
 * ingressam  nesta  Universidade.  Para  isso,  o  programa  dever�  solicitar  o  sexo  do  entrevistado 
 *  e  o c�digo do curso que deseja realizar.
 *  
 *  C�digo					Curso
 *  
 *  1						Engenharia da Computa��o
 *  2						Administra��o
 *  3						Medicina
 *  4						Psicologia
 *  
 *  O programa dever� realizar a pesquisa enquanto houver a solicita��o de uma nova entrada de dados 
 *  atrav�s da vari�vel RESP. Ao final o programa dever� apresentar os seguintes resultados:
 *  
 *  -	O percentual de homens que pretendem cursar Engenharia da Computa��o;
 *  -	O percentual de mulheres que pretendem cursar Psicologia;
 *  -	O total de pessoas que pretendem cursar Medicina;
 *  -	O total de mulheres que pretendem cursar Administra��o;
 *  */

public class K04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int resp = 0, QT= 0, codigo = 0, sexo, tHe = 0, tMa = 0, tMp = 0, tMM = 0, tMpsi = 0;
		float tEG = 0, percHEG = 0, tMED = 0, percPM = 0, percMPSI = 0, tPSI = 0;
		
		System.out.println("Digite o c�digo do curso");
		codigo = leia.nextInt();
		
		System.out.println("Qual o g�nero do entrevistado?\nDigite 1 para Masculino.\nDigite 2 para Feminino." );
		sexo = leia.nextInt();
		
		do{
			
			if (resp != 3){
				QT += 1;
			}
			
			if (codigo == 1) {
				tEG += 1;
				
				if (sexo == 1){
					tHe += 1;
				}
			}else if (codigo == 2){
				
				if (sexo == 2){
					tMa += 1;
				}
			}else if (codigo == 3){
				tMED += 1;
				
			}else if (codigo == 4) {
				tPSI += 1;
				
				if (sexo == 2){
					tMpsi += 1;
				}
			}
			
			System.out.println("Digite 3 para SAIR ou qualquer outro n�mero para continuar");
			resp = leia.nextInt();
			
			if (resp != 3){
				
				System.out.println();
				System.out.println("Digite o c�digo do curso");
				codigo = leia.nextInt();
				
				System.out.println("Qual o g�nero do entrevistado?\nDigite 1 para Masculino.\nDigite 2 para Feminino." );
				sexo = leia.nextInt();
			}
		}while (resp != 3);
		
		percHEG = (tEG*100)/tHe;
		percMPSI = (tMpsi*100)/tPSI;
		
		
		
		System.out.println("-------------RESULTADOS DA ENTREVISTA-------------");
		
		System.out.println();
		System.out.println("O percentual de homens que pretendem cursar Engenharia da Computa��o: " +percHEG);
		System.out.println("O percentual de mulheres que pretendem cursar Psicologia: " +percMPSI);
		System.out.println("O total de pessoas que pretendem cursar Medicina: " +tMED);
		System.out.println("O total de mulheres que pretendem cursar Administra��o: " +tMa);
		
		
		
		
		System.out.println();
		System.out.println("-------------FIM DO PROGRAMA!!-------------");
}
	{{
}

	}

}
