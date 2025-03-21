package listaF;

import java.util.Scanner;

		/*Desenvolva um programa para calcular o reajuste 
		 * salarial dos funcionários de um empresa de 
		 * desenvolvimento de softwares. O programa 
		 * deverá solicitar a leitura do código e o 
		 * salário atual do funcionário  e  realizar  o  
		 * reajuste  salarial  de  acordo  com  a  
		 * tabela  abaixo.  O  programa  deverá 
		 * apresentar o salário antigo, o novo salário, 
		 * o valor do reajuste e a função do funcionário.
		 * 
		 * Código		Função			Percentual
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
		
		System.out.println("Digite o código");
		c = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o seu salário atual");
		sa = leia.nextInt();
		
		if (c == 1){
			
			r = (sa/100)*5;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua função é a de Operador, o seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 2){
			
			r = (sa/100)*10;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua função é a de Programador, o seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 3){
			
			r = (sa/100)*15;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua função é a de Analista, o seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 4){
			
			r = (sa/100)*25;
			ns = sa + r;
			System.out.println();
			System.out.println("A sua função é a de Gerente, o seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}

	}

}
