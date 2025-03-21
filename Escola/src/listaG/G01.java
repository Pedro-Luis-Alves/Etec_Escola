package listaG;

import java.util.Scanner;

		/* Desenvolva um programa para realizar a leitura 
		 * de um código de erro e retornar a mensagem 
		 * correspondente ao código informado de acordo 
		 * com a tabela abaixo:
		 * 
		 * Código			Mensagem de Erro
		 * 
		 * 1				Identificador Inválido
		 * 2				Esperando Número Inteiro
		 * 3				Tipo de Dado Indefinido
		 * 4				Parâmetro Incorreto
		 * 5				Memória Insuficiente*/

public class G01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int c;
		
		System.out.println("Digite o código de erro.");
		c = leia.nextInt();
		
		if (c == 1){
			
			System.out.println();
			System.out.println("Identificador Inválido.");
		}else if (c == 2){
			
			System.out.println();
			System.out.println("Esperando Número Inteiro.");
		}else if (c == 3){
			
			System.out.println();
			System.out.println("Tipo de Dado Indefinido.");
		}else if (c == 4){
			
			System.out.println();
			System.out.println("Parâmetro Incorreto.");
		}else if (c == 5){
			
			System.out.println();
			System.out.println("Memória Insuficiente.");
		}else {
			
			System.out.println();
			System.out.println("Código não indentificado.");
		}
		

	}

}
