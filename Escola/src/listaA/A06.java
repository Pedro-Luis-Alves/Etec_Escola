package listaA;

	/* Desenvolva  um  programa  para  calcular  o  sal�rio  l�quido  de  um  funcion�rio  a  partir  do  
	 * seu sal�rio bruto. O programa dever� realizar os seguintespassos:
	 * 
	 * -Estabelecer a leitura da vari�vel HT (horas trabalhadas no m�s);
	 * -Estabelecer a leitura da vari�vel VH (valor da hora trabalhada);
	 * -Estabelecer a leitura da vari�vel PD (percentual de desconto);
	 * -Calcular o sal�rio bruto (SB), sendo este a multiplica��o das vari�veis HT e VH;
	 * -Calcular  o  total  de  desconto  (TD)  com  base  no  valor  de  PD  dividido  por  100  e multiplicado pelo SB;
	 * -Calcular o sal�rio l�quido (SL), deduzindo o desconto total do sal�rio bruto (SB �TD);
	 * 
	 * Apresentar os valores dos sal�rios bruto e l�quido, al�m do desconto total: SB, TD e SL.*/

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int ht, vh, pd, sb,td, sl;
		
		System.out.println("Digite o total de horas trabalhadas no m�s");
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
		System.out.println("Sal�rio Bruto: " +sb);
		System.out.println("Sal�rio L�quido: " +sl);
		System.out.println("Desconto Total: " +td);
		
	}

}
