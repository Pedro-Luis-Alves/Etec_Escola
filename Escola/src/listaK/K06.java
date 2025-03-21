package listaK;

import java.util.Scanner;

/*Desenvolva um programa para realizar um censo na cidade de S�o Paulo. O programa dever�
solicitar a leitura da idade, da regi�o em que reside (Centro, Leste, Norte, Oeste ou Sul) e o sexo das
pessoas. O programa dever� realizar a pesquisa at� que a entrada de dados seja finalizada atrav�s da
vari�vel RESP. Ao final o programa dever� apresentar os seguintes resultados:

	- O total de homens que residem nas Zonas Leste e Central;
	- O percentual de mulheres que residem nas Zonas Oeste, Norte e Sul;
	- O total de homens menores de idade (menores de 18) que residem na Zona Norte da cidade;
	- O percentual de mulheres maiores de idade (maiores de 18) que residem na Zona Oeste da cidade;
	- O percentual de mulheres que residem na Zona Central da cidade.*/

public class K06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int resp, i, reg, s, M = 0, mN = 0, fONS = 0, fZO = 0, fZC = 0, menor, maior, tp = 0;
		float pfONS, pfZO, pfZC;
		
		
		do{
			tp += 1;
			
			System.out.println("Digite o codigo da zona em que voc� reside: \n1 - Centro \n2 - Leste \n3 - Oeste \n4 - Sul \n5 - Norte");
			reg = leia.nextInt();
			System.out.println();
			
			System.out.println("Digite seu sexo: \n1 - para Masculino \n2 - para Feminino");
			s = leia.nextInt();
			System.out.println();
			
			System.out.println("Digite sua idade");
			i = leia.nextInt();
			System.out.println();
			
			if ((reg == 1)&&(s == 1)||(reg == 2)&&(s == 1)){
				M += 1;
				
			}
			
			if ((reg == 3)&&(s == 2)||(reg == 4)&&(s == 2)||(reg == 5)&&(s == 2)){
				fONS += 1;
				
			}
			
			if ((reg == 5)&&(s == 1)&&(i < 18)){
				mN += 1;
				
			}
			
			if ((reg == 3)&&(s == 2)&&(i >= 18)){
				fZO += 1;
				
			}
			
			if ((reg == 1)&&(s == 2)){
				fZC += 1;
				
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.println("Voc� quer continuar com a entrevista?\nDigite 1 para Sim, Ou qualquer outro n�mero para terminar a entrevista.");
			resp = leia.nextInt();
		
		}while (resp == 1);
		
		pfONS = (fONS/tp*100);
		pfZO = (fZO/tp*100);
		pfZC = (fZC/tp*100);
		
			 System.out.println();
			 System.out.println("------------RESULTADOS------------");
			 System.out.println();
			
			System.out.println("O TOTAL de HOMENS que residem nas ZONAS LESTE e CENTRAL �: " + M + ".");
			System.out.println("O PERCENTUAL de MULHERES que residem nas ZONAS OESTE, NORTE e SUL �: " + pfONS + "%.");
			System.out.println("TOTAL de HOMENS MENORES DE IDADE (menores de 18) que residem na ZONA NORTE da cidade �: " + mN + ".");
			System.out.println("O PERCENTUAL de MULHERES MAIORES DE IDADE (maiores de 18) que residem na ZONA OESTE da cidade �: " + pfZO + "%." );
			System.out.println("O PERCENTUAL de MULHERES que residem na ZONA CENTRAL da cidade �: " + pfZC + "%.");
		
	}

}
