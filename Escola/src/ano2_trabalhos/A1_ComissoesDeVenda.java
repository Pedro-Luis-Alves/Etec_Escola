package ano2_trabalhos;

import java.util.Scanner;

//1)Comissões de vendas) Utilize um array 
//	unidimensional para resolver o seguinte problema: 

//	Uma empresa paga seu pessoal de vendas por comissão. 
//	O pessoal de vendas recebe R$ 200 por semana mais 9% de 
//	suas vendas brutas durante essa semana. 
//	
//	Por exemplo, um vendedor que vende R$ 5.000 brutos 
//	em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou 
//	um total de R$ 650. 
//	Escreva um aplicativo (utilizando um array de contadores)
//	que determina quanto o pessoal de vendas ganhou em cada 
//	um dos seguintes intervalos (suponha que o salário de cada 
//	vendedor foi truncado para uma quantia inteira):
//	
//	a)	$200–299 
//	b)	$300–399 
//	c)	$400–499 
//	d)	$500–599 
//	e)	$600–699 
//	f)	$700–799 
//	g)	$800–899 
//	h)	$900–999 
//	i)	R$ 1.000 e acima.


public class A1_ComissoesDeVenda {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int valorBruto = 0, valorFinal = 0;
		
		System.out.println("Por favor, digite o valor do seu salário bruto");
		valorBruto = read.nextInt();
		
		valorBruto += 200;
		valorFinal += valorBruto * 0.09;
	
		//---------------------------------------------------------------------
		
		int array[] = {299, 399, 499, 599, 699, 799, 899, 999, 1000}; 
		
		switch (valorFinal - array[2]) {
		
		case 44, 299 :
			
			break;
		}
		
		
		
	}
}