package listaF;

import java.util.Scanner;

/*Desenvolva  um  programa  para  auxiliar  uma  
		 * escolinha  de  futebol  na  classifica��o  das 
		 * categorias das equipes de futebol. O programa 
		 * dever� ler a idade da crian�a e apresentar o 
		 * nome da categoria em a crian�a deve jogar, 
		 * atrav�s da tabela abaixo:
		 * 
		 * Idade			Categoria
		 * 
		 * 6 � 8 anos		Dente de Leite
		 * 9 � 11 anos		Pr�-Mirim
		 * 12 e 13 anos		Mirim
		 * 14 e 15 anos		Infantil
		 * 16 e 17 anos		Juvenil
		 * 18 � 20 anos		Juniores*/

public class F02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int i;
		
		System.out.println("Digite a idade do entrevistado");
		i = leia.nextInt();
		
		if ((i >= 6)&&(i <= 8)){
		
			System.out.println();
			System.out.println("Liga Dente de Leite");
		}else if ((i >= 9)&&(i <= 11)){
		
			System.out.println();
			System.out.println("Liga Pr�-Mirim");
		}else if ((i == 12)||(i == 13)){
		
			System.out.println();
			System.out.println("Liga Mirim");
		}else if ((i == 14)||(i == 15)){
		
			System.out.println();
			System.out.println("Liga Infantil");
		}else if ((i == 16)||(i == 17)){
		
			System.out.println();
			System.out.println("Liga Juvenil");
		}else if ((i >= 18)&&(i <= 20)){
		
			System.out.println();
			System.out.println("Liga Juniores");
		}else {
			
			System.out.println();
			System.out.println("Por favor, digite uma idade que seja v�lida.");
		}
	}

}
