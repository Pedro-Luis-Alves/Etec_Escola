package listaG;

import java.util.Scanner;

/* Desenvolva um programa para calcular o reajuste 
		 * salarial dos funcionários de um empresa. 
		 * O programa  deverá  solicitar  a  leitura  
		 * do  código  e  o  salário  atual  do  
		 * funcionário  e  realizar  o  reajuste 
		 * salarial de acordo com a tabela abaixo. 
		 * O programa deverá apresentar os seguintes 
		 * valores: salário antigo, salário novo e 
		 * reajuste.
		 * 
		 * Código			Percentual
		 * 
		 * 5				5%
		 * 15				10%
		 * 20				15%
		 * 25				20%
		 * 30				25%
		 * 35				30%
		 * 
		 * Lembrete: Fórmulas para o cálculo do reajuste 
		 * salarial.
		 * 
		 * REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
		 * SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;
		 * */

public class G03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int c, s, r, ns;
		
		System.out.println("Digite o código.");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o seu salário atual.");
		s = leia.nextInt();
		
		if (c == 5){
			
			r = (s/100)*5;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else if (c == 15){
			
			r = (s/100)*10;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else if (c == 20){
			
			r = (s/100)*15;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else if (c == 25){
			
			r = (s/100)*20;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else if (c == 30){
			
			r = (s/100)*25;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else if (c == 35){
			
			r = (s/100)*30;
			ns = s+r;
			System.out.println();
			System.out.println("O seu salário antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo salário é de R$ " +ns );
		}else {
			
			System.out.println();
			System.out.println("Código não indentificado.");
		}
		
		
	}

}
