package listaG;

import java.util.Scanner;

/* Desenvolva  um  programa  para  auxiliar  uma  
		 * empresa  na  classifica��o  dos  funcion�rios  
		 * nos departamentos   da   empresa.   O   
		 * programa   devera   solicitar   a   cada   
		 * funcion�rio   o   c�digo   do departamento 
		 * em que ele dever� trabalhar e apresentar ao 
		 * funcion�rio a descri��o do departamento 
		 * correspondente ao c�digo indicado.
		 * 
		 * C�digo			Departamento
		 * 
		 * 10				Expedi��o
		 * 20				Recursos Humanos
		 * 30				Log�stica
		 * 40				Contabilidade
		 * 50				Departamento Pessoal
		 * 60				Inform�tica
		 * */

public class G02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		int c;
		
		System.out.println("Digite o c�digo do departamento.");
		c = leia.nextInt();
		
		if (c == 10){
			
			System.out.println();
			System.out.println("Departamento de Expedi��o.");
		}else if (c == 20){
			
			System.out.println();
			System.out.println("Departamento de Recursos Humanos.");
		}else if (c == 30){
			
			System.out.println();
			System.out.println("Departamento de Log�stica.");
		}else if (c == 40){
			
			System.out.println();
			System.out.println("Departamento de Contabilidade.");
		}else if (c == 50){
			
			System.out.println();
			System.out.println("Departamento Pessoal.");
		}else if (c == 60){
			
			System.out.println();
			System.out.println("Departamento de Inform�tica.");
		}else {
			
			System.out.println();
			System.out.println("C�digo de Departamento n�o indentificado.");
		}
	}

}
