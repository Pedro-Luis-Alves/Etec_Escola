package listaA;

import java.util.Scanner;

/* Desenvolva um programa para efetuar o c�lculo da quantidade de litros de combust�vel gastos em  uma  viagem. 
	 * O  usu�rio dever�  fornecer  o  tempo  gasto  na  viagem  e  a  velocidade  m�dia,  bem como informar quantos 
	 * kilometros seu veiculo percorre com cada litro de combust�vel. Para obter a dist�ncia percorrida, utilize a f�rmula 
	 * DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel 
	 * gastos na viagem.*/

public class A07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int t, vm, kl, d, ql;
		
		
		System.out.println("Digite o tempo gasto na viagem.");
		t = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite a velocidade m�dia.");
		vm = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite quantos kilometros seu veiculo percorre com cada litro de combust�vel.");
		kl = leia.nextInt();
		
		d = t*vm;
		ql = d/kl;
		
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("A quantidade de litros de combust�vel gastos na viagem �: " +ql);
		
		
	}

}
