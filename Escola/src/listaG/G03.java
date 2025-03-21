package listaG;

import java.util.Scanner;

/* Desenvolva um programa para calcular o reajuste 
		 * salarial dos funcion�rios de um empresa. 
		 * O programa  dever�  solicitar  a  leitura  
		 * do  c�digo  e  o  sal�rio  atual  do  
		 * funcion�rio  e  realizar  o  reajuste 
		 * salarial de acordo com a tabela abaixo. 
		 * O programa dever� apresentar os seguintes 
		 * valores: sal�rio antigo, sal�rio novo e 
		 * reajuste.
		 * 
		 * C�digo			Percentual
		 * 
		 * 5				5%
		 * 15				10%
		 * 20				15%
		 * 25				20%
		 * 30				25%
		 * 35				30%
		 * 
		 * Lembrete: F�rmulas para o c�lculo do reajuste 
		 * salarial.
		 * 
		 * REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
		 * SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;
		 * */

public class G03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int c, s, r, ns;
		
		System.out.println("Digite o c�digo.");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o seu sal�rio atual.");
		s = leia.nextInt();
		
		if (c == 5){
			
			r = (s/100)*5;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 15){
			
			r = (s/100)*10;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 20){
			
			r = (s/100)*15;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 25){
			
			r = (s/100)*20;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 30){
			
			r = (s/100)*25;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 35){
			
			r = (s/100)*30;
			ns = s+r;
			System.out.println();
			System.out.println("O seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else {
			
			System.out.println();
			System.out.println("C�digo n�o indentificado.");
		}
		
		
	}

}
