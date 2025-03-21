package listaG;

import java.util.Scanner;

/* Desenvolva um programa para calcular o reajuste 
		 * salarial dos funcion�rios de um empresa de 
		 * desenvolvimento de softwares. O programa 
		 * dever� solicitar a leitura do c�digo e o 
		 * sal�rio atual do funcion�rio  e  realizar  
		 * o  reajuste  salarial  de  acordo  com  a  
		 * tabela abaixo.  O  programa  dever� apresentar 
		 * o sal�rio antigo, o novo sal�rio, o valor 
		 * do reajuste e a fun��o do funcion�rio.
		 * 
		 * C�digo		Fun��o			Percentual
		 * 
		 * 1			Operador		5%
		 * 2			Programador		10%
		 * 3			Analista		15%
		 * 4			Gerente			25%
		 **/

public class G04 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner (System.in);
		int c, s, r, ns;
		
		System.out.println("Digite o c�digo.");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o seu sal�rio atual.");
		s = leia.nextInt();
		
		if (c == 1){
			
			r = (s/100)*5;
			ns = s+r;
			System.out.println();
			System.out.println("A sua fun��o � a de Operador, o seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 2){
			
			r = (s/100)*10;
			ns = s+r;
			System.out.println();
			System.out.println("A sua fun��o � a de Programador, o seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 3){
			
			r = (s/100)*15;
			ns = s+r;
			System.out.println();
			System.out.println("A sua fun��o � a de Analista, o seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else if (c == 4){
			
			r = (s/100)*25;
			ns = s+r;
			System.out.println();
			System.out.println("A sua fun��o � a de Gerente,	o seu sal�rio antigo era de R$ " +s+ ", com um reajuste de R$ " +r+ " 0 seu novo sal�rio � de R$ " +ns );
		}else {
			
			System.out.println();
			System.out.println("C�digo n�o indentificado.");
		}
	}

}
