package listaA;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  o  pre�o  de  um  produto  e  calcular  o  pre�o  �  vista  deste produto 
	 * com 10% de desconto. O programa dever� realizar os seguintes passos:
	 * 
	 *	-Estabelecer a leitura da vari�vel PRECO (pre�o bruto do produto);
	 *	-Calcular o valor do desconto (DESCONTO) dividindo o pre�o por 100 e multiplicando pelo percentual de desconto ((PRECO/100)*10).
	 *	-Calcular o pre�o do produto � vista (PRECO_VISTA), descontando o valor do desconto do pre�o bruto do produto (PRECO -DESCONTO).
	 *
	 		Apresentar  os  valores  do  pre�o  bruto  e  do  pre�o  �  vista,  al�m  do 
	 		desconto:  PRECO, DESCONTO e PRECO_VISTA.*/

public class A05 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		double p, pd;
		
		System.out.println("Digite o pre�o do produto");
		p = leia.nextInt();
	}

}
