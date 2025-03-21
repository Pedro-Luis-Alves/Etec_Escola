package listaF;

import java.util.Scanner;

		/*Desenvolva um programa para ler três valores 
		 * (X, Y e Z). O programa deverá verificar se 
		 * estes três  valores  podem  ser  os  
		 * comprimentos  dos  lados  de  um  triângulo  
		 * e,  se  forem,  verificar  se  é  um 
		 * triângulo  eqüilátero,  isósceles  ou  
		 * escaleno.Se  eles  não  forem  um  triângulo,  
		 * escrever  uma mensagem.
		 * 
		 * Propriedades e definições dos triângulos:
		 * 
		 * -O comprimento de cada lado de um triângulo é 
		 * menor do que a soma dos comprimentos dos 
		 * outros dois lados;
		 * 
		 * -Chama-se  triângulo  eqüilátero  ao  
		 * triângulo  que  tem  os comprimentos  dos 
		 * três  lados iguais;
		 * 
		 * -Chama-se  triângulo  isósceles  ao  triângulo  
		 * que  tem  os  comprimentos  de  dois  lados 
		 * iguais. Portanto, todo triângulo eqüilátero é 
		 * também isósceles;
		 * 
		 * -Chama-se triângulo escaleno ao  triângulo 
		 * que  tem os comprimentos  de  seus  três lados 
		 * diferentes.*/

public class F07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int x, y, z, tri;
		
		System.out.println("Digite o valor de X");
		x = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor de Y");
		y = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor de Z");
		z = leia.nextInt();
		
		tri = x+y;
		
		 if (tri < z){
			
			System.out.println();
			System.out.println("Não é um triângulo");
		
		 }else if ((tri > z)&&(x == y)&&(y == z)){
			
			 System.out.println();
			System.out.println("É um triângulo do tipo EQUILÁTERO");
		}else if ((tri > z)&&(x == y)||(y == z)||(x == z)){
			
			System.out.println();
			System.out.println("É um triângulo do tipo ISÓSCELES");
		}else if ((tri > z)&&(x != y)||(y != z)||(x != z)){
			
			System.out.println();
			System.out.println("É um triângulo do tipo ESCALENO");
		}
		
		
	}

}
