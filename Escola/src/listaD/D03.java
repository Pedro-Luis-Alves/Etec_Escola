package listaD;

import java.util.Scanner;

/*)Desenvolva um programa para auxiliar uma empresa 
	 * na classifica��o dos funcion�rios nos 
	 * departamentos da empresa. O programa devera 
	 * solicitar a cada funcion�rio o c�digo do 
	 * departamento  em  que  ele  dever�  trabalhar  e  
	 * apresentar  ao  funcion�rio  a  descri��o  do 
	 * departamento correspondente ao c�digo indicado.
	 * 
	 * C�digo		Departamento
	 * 
	 * 1			Expedi��o
	 * 2			Recursos Humanos
	 * 3			Log�stica
	 * 4			Contabilidade*/

public class D03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int c;

		System.out.println("Digite o n�mero do c�digo");
		c = leia.nextInt();
		
		if (c == 1){
			System.out.println();
			System.out.println("Departamento de Expedi��o.");
			
		}else if (c == 2){
			System.out.println();
			System.out.println("Departamento de Recursos Humanos.");
			
		}else if (c == 3){
			System.out.println();
			System.out.println("Departamento de Log�stica.");
			
		}else if (c == 4){
			System.out.println();
			System.out.println("Departamento de Contabilidade.");
		}else {
			System.out.println();
			System.out.println("Digite um c�digo v�lido.");
		}
	}

}
