package listaF;

import java.util.Scanner;

/* Desenvolva um programa para calcular o 
		 * reajuste salarial dos funcionários de um 
		 * empresa. O programa deverá solicitar a 
		 * leitura do código e o salário atual do 
		 * funcionário e realizar o reajuste salarial 
		 * de acordo com a tabela abaixo. O programa 
		 * deverá apresentar os seguintes valores: 
		 * salário antigo, salário novo e reajuste.
		 * 
		 * Código			Percentual
		 * 
		 * 1				5%
		 * 2				10%
		 * 3				15%
		 * 4				20%
		 * 5				25%
		 * 6				30%
		 * 
		 * Lembrete: Fórmulas para o cálculo do reajuste 
		 * salarial
		 * 
		 * REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
		 * 
		 * SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;*/

public class F05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int c, sa, r, ns;
		
		System.out.println("Digite o seu salário atual");
		sa = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o código");
		c = leia.nextInt();
		
if (c == 1){
			
			r = (sa/100)*5;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 2){
			
			r = (sa/100)*10;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 3){
			
			r = (sa/100)*15;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 4){
			
			r = (sa/100)*20;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 5){
			
			r = (sa/100)*25;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else if (c == 6){
			
			r = (sa/100)*30;
			ns = sa + r;
			System.out.println();
			System.out.println("O seu antigo salário é de R$ " +sa+ ", com um reajuste de R$ " +r+ ", o seu novo salário é de R$ " +ns);
			
		}else {
			
			System.out.println();
			System.out.println("Digite um código válido!");
		}
	}

}
