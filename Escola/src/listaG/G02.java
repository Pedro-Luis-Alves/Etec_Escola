package listaG;

import java.util.Scanner;

/* Desenvolva  um  programa  para  auxiliar  uma  
		 * empresa  na  classificação  dos  funcionários  
		 * nos departamentos   da   empresa.   O   
		 * programa   devera   solicitar   a   cada   
		 * funcionário   o   código   do departamento 
		 * em que ele deverá trabalhar e apresentar ao 
		 * funcionário a descrição do departamento 
		 * correspondente ao código indicado.
		 * 
		 * Código			Departamento
		 * 
		 * 10				Expedição
		 * 20				Recursos Humanos
		 * 30				Logística
		 * 40				Contabilidade
		 * 50				Departamento Pessoal
		 * 60				Informática
		 * */

public class G02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int c;
		
		System.out.println("Digite o código do departamento.");
		c = leia.nextInt();
		
		if (c == 10){
			
			System.out.println();
			System.out.println("Departamento de Expedição.");
		}else if (c == 20){
			
			System.out.println();
			System.out.println("Departamento de Recursos Humanos.");
		}else if (c == 30){
			
			System.out.println();
			System.out.println("Departamento de Logística.");
		}else if (c == 40){
			
			System.out.println();
			System.out.println("Departamento de Contabilidade.");
		}else if (c == 50){
			
			System.out.println();
			System.out.println("Departamento Pessoal.");
		}else if (c == 60){
			
			System.out.println();
			System.out.println("Departamento de Informática.");
		}else {
			
			System.out.println();
			System.out.println("Código de Departamento não indentificado.");
		}
	}

}
