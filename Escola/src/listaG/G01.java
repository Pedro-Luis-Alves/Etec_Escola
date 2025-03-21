package listaG;

import java.util.Scanner;

		/* Desenvolva um programa para realizar a leitura 
		 * de um c�digo de erro e retornar a mensagem 
		 * correspondente ao c�digo informado de acordo 
		 * com a tabela abaixo:
		 * 
		 * C�digo			Mensagem de Erro
		 * 
		 * 1				Identificador Inv�lido
		 * 2				Esperando N�mero Inteiro
		 * 3				Tipo de Dado Indefinido
		 * 4				Par�metro Incorreto
		 * 5				Mem�ria Insuficiente*/

public class G01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int c;
		
		System.out.println("Digite o c�digo de erro.");
		c = leia.nextInt();
		
		if (c == 1){
			
			System.out.println();
			System.out.println("Identificador Inv�lido.");
		}else if (c == 2){
			
			System.out.println();
			System.out.println("Esperando N�mero Inteiro.");
		}else if (c == 3){
			
			System.out.println();
			System.out.println("Tipo de Dado Indefinido.");
		}else if (c == 4){
			
			System.out.println();
			System.out.println("Par�metro Incorreto.");
		}else if (c == 5){
			
			System.out.println();
			System.out.println("Mem�ria Insuficiente.");
		}else {
			
			System.out.println();
			System.out.println("C�digo n�o indentificado.");
		}
		

	}

}
