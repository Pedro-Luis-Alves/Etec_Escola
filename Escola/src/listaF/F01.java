package listaF;

import java.util.Scanner;

/* Desenvolvaum  programa  para  auxiliar  uma  
		 * empresa  na  classifica��o  dos  funcion�rios  
		 * nos departamentos   da   empresa.   
		 * O   programa   devera   solicitar   a   cada   
		 * funcion�rio   o   c�digo   do departamento em 
		 * que ele dever� trabalhar e apresentar ao 
		 * funcion�rio a descri��o do departamento 
		 * correspondente ao c�digo indicado.
		 * 
		 * C�digo			Departamento
		 * 
		 * 10				Contabilidade
		 * 12				Almoxarifado
		 * 14				Inform�tica*/

public class F01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int c;
		
		System.out.println("Digite o c�digo");
		c = leia.nextInt();
		
		if (c == 10){
			
			System.out.println();
			System.out.println("Departamento de Contabilidade");
		}else if (c == 12){
			
			System.out.println();
			System.out.println("Departamento de Almoxarifado");
		}else if (c == 14){
			
			System.out.println();
			System.out.println("Departamento de Inform�tica");
		}else {
			
			System.out.println("C�digo n�o aceito, por favor digite um c�digo j� existente");
		}
	}

}
