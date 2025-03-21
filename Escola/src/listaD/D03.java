package listaD;

import java.util.Scanner;

/*)Desenvolva um programa para auxiliar uma empresa 
	 * na classificação dos funcionários nos 
	 * departamentos da empresa. O programa devera 
	 * solicitar a cada funcionário o código do 
	 * departamento  em  que  ele  deverá  trabalhar  e  
	 * apresentar  ao  funcionário  a  descrição  do 
	 * departamento correspondente ao código indicado.
	 * 
	 * Código		Departamento
	 * 
	 * 1			Expedição
	 * 2			Recursos Humanos
	 * 3			Logística
	 * 4			Contabilidade*/

public class D03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int c;

		System.out.println("Digite o número do código");
		c = leia.nextInt();
		
		if (c == 1){
			System.out.println();
			System.out.println("Departamento de Expedição.");
			
		}else if (c == 2){
			System.out.println();
			System.out.println("Departamento de Recursos Humanos.");
			
		}else if (c == 3){
			System.out.println();
			System.out.println("Departamento de Logística.");
			
		}else if (c == 4){
			System.out.println();
			System.out.println("Departamento de Contabilidade.");
		}else {
			System.out.println();
			System.out.println("Digite um código válido.");
		}
	}

}
