package listaF;

import java.util.Scanner;

		/*Desenvolva um programa para calcular o reajuste 
		 * salarial dos funcion�rios de um empresa de 
		 * desenvolvimento de softwares. O programa 
		 * dever� solicitar a leitura do c�digo e o 
		 * sal�rio atual do funcion�rio  e  realizar  o  
		 * reajuste  salarial  de  acordo  com  a  
		 * tabela  abaixo.  O  programa  dever� 
		 * apresentar o sal�rio antigo, o novo sal�rio, 
		 * o valor do reajuste e a fun��o do funcion�rio.
		 * 
		 * C�digo		Fun��o			Percentual
		 * 
		 * 1			Operador		5%
		 * 2			Programador		10%
		 * 3			Analista		15%
		 * 4			Gerente			25%
		 * */

public class F06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int c, sa, r, ns;
		
		System.out.println("Digite o c�digo");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o seu sal�rio atual");
		sa = leia.nextInt();
		
		if (c == 1){
			
			r = (sa/100)*5;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua fun��o � a de Operador, o seu antigo sal�rio � de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo sal�rio � de R$ " +ns);
			
		}else if (c == 2){
			
			r = (sa/100)*10;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua fun��o � a de Programador, o seu antigo sal�rio � de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo sal�rio � de R$ " +ns);
			
		}else if (c == 3){
			
			r = (sa/100)*15;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua fun��o � a de Analista, o seu antigo sal�rio � de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo sal�rio � de R$ " +ns);
			
		}else if (c == 4){
			
			r = (sa/100)*25;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua fun��o � a de Gerente, o seu antigo sal�rio � de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo sal�rio � de R$ " +ns);
			
		}

	}

}
