package listaA;

import java.util.Scanner;

/* Desenvolva um programa para efetuar o cálculo da quantidade de litros de combustível gastos em  uma  viagem. 
	 * O  usuário deverá  fornecer  o  tempo  gasto  na  viagem  e  a  velocidade  média,  bem como informar quantos 
	 * kilometros seu veiculo percorre com cada litro de combustível. Para obter a distância percorrida, utilize a fórmula 
	 * DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de combustível 
	 * gastos na viagem.*/

public class A07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int t, vm, kl, d, ql;
		
		
		System.out.println("Digite o tempo gasto na viagem.");
		t = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite a velocidade média.");
		vm = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite quantos kilometros seu veiculo percorre com cada litro de combustível.");
		kl = leia.nextInt();
		
		d = t*vm;
		ql = d/kl;
		
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("A quantidade de litros de combustível gastos na viagem é: " +ql);
		
		
	}

}
