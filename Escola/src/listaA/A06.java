package listaA;

	/* Desenvolva  um  programa  para  calcular  o  salário  líquido  de  um  funcionário  a  partir  do  
	 * seu salário bruto. O programa deverá realizar os seguintespassos:
	 * 
	 * -Estabelecer a leitura da variável HT (horas trabalhadas no mês);
	 * -Estabelecer a leitura da variável VH (valor da hora trabalhada);
	 * -Estabelecer a leitura da variável PD (percentual de desconto);
	 * -Calcular o salário bruto (SB), sendo este a multiplicação das variáveis HT e VH;
	 * -Calcular  o  total  de  desconto  (TD)  com  base  no  valor  de  PD  dividido  por  100  e multiplicado pelo SB;
	 * -Calcular o salário líquido (SL), deduzindo o desconto total do salário bruto (SB –TD);
	 * 
	 * Apresentar os valores dos salários bruto e líquido, além do desconto total: SB, TD e SL.*/

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int ht, vh, pd, sb,td, sl;
		
		System.out.println("Digite o total de horas trabalhadas no mês");
		ht = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor da hora trabalhada");
		vh = leia.nextInt();

		System.out.println();
		System.out.println("Digite o percentual de desconto");
		pd = leia.nextInt();
		
		sb = ht*vh;
		td = (pd/100)*sb;
		sl = sb-td;
		
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("Salário Bruto: " +sb);
		System.out.println("Salário Líquido: " +sl);
		System.out.println("Desconto Total: " +td);
		
	}

}
