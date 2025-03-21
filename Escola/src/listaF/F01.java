package listaF;

import java.util.Scanner;

/* Desenvolvaum  programa  para  auxiliar  uma  
		 * empresa  na  classificação  dos  funcionários  
		 * nos departamentos   da   empresa.   
		 * O   programa   devera   solicitar   a   cada   
		 * funcionário   o   código   do departamento em 
		 * que ele deverá trabalhar e apresentar ao 
		 * funcionário a descrição do departamento 
		 * correspondente ao código indicado.
		 * 
		 * Código			Departamento
		 * 
		 * 10				Contabilidade
		 * 12				Almoxarifado
		 * 14				Informática*/

public class F01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int c;
		
		System.out.println("Digite o código");
		c = leia.nextInt();
		
		if (c == 10){
			
			System.out.println();
			System.out.println("Departamento de Contabilidade");
		}else if (c == 12){
			
			System.out.println();
			System.out.println("Departamento de Almoxarifado");
		}else if (c == 14){
			
			System.out.println();
			System.out.println("Departamento de Informática");
		}else {
			
			System.out.println("Código não aceito, por favor digite um código já existente");
		}
	}

}
