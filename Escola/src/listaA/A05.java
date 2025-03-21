package listaA;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  o  preço  de  um  produto  e  calcular  o  preço  à  vista  deste produto 
	 * com 10% de desconto. O programa deverá realizar os seguintes passos:
	 * 
	 *	-Estabelecer a leitura da variável PRECO (preço bruto do produto);
	 *	-Calcular o valor do desconto (DESCONTO) dividindo o preço por 100 e multiplicando pelo percentual de desconto ((PRECO/100)*10).
	 *	-Calcular o preço do produto à vista (PRECO_VISTA), descontando o valor do desconto do preço bruto do produto (PRECO -DESCONTO).
	 *
	 		Apresentar  os  valores  do  preço  bruto  e  do  preço  à  vista,  além  do 
	 		desconto:  PRECO, DESCONTO e PRECO_VISTA.*/

public class A05 {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		double p, pd;
		
		System.out.println("Digite o preço do produto");
		p = leia.nextInt();
	}

}
