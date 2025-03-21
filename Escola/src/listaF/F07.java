package listaF;

import java.util.Scanner;

		/*Desenvolva um programa para ler tr�s valores 
		 * (X, Y e Z). O programa dever� verificar se 
		 * estes tr�s  valores  podem  ser  os  
		 * comprimentos  dos  lados  de  um  tri�ngulo  
		 * e,  se  forem,  verificar  se  �  um 
		 * tri�ngulo  eq�il�tero,  is�sceles  ou  
		 * escaleno.Se  eles  n�o  forem  um  tri�ngulo,  
		 * escrever  uma mensagem.
		 * 
		 * Propriedades e defini��es dos tri�ngulos:
		 * 
		 * -O comprimento de cada lado de um tri�ngulo � 
		 * menor do que a soma dos comprimentos dos 
		 * outros dois lados;
		 * 
		 * -Chama-se  tri�ngulo  eq�il�tero  ao  
		 * tri�ngulo  que  tem  os comprimentos  dos 
		 * tr�s  lados iguais;
		 * 
		 * -Chama-se  tri�ngulo  is�sceles  ao  tri�ngulo  
		 * que  tem  os  comprimentos  de  dois  lados 
		 * iguais. Portanto, todo tri�ngulo eq�il�tero � 
		 * tamb�m is�sceles;
		 * 
		 * -Chama-se tri�ngulo escaleno ao  tri�ngulo 
		 * que  tem os comprimentos  de  seus  tr�s lados 
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
			System.out.println("N�o � um tri�ngulo");
		
		 }else if ((tri > z)&&(x == y)&&(y == z)){
			
			 System.out.println();
			System.out.println("� um tri�ngulo do tipo EQUIL�TERO");
		}else if ((tri > z)&&(x == y)||(y == z)||(x == z)){
			
			System.out.println();
			System.out.println("� um tri�ngulo do tipo IS�SCELES");
		}else if ((tri > z)&&(x != y)||(y != z)||(x != z)){
			
			System.out.println();
			System.out.println("� um tri�ngulo do tipo ESCALENO");
		}
		
		
	}

}
