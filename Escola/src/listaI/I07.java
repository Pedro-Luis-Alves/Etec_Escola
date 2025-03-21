package listaI;

import java.util.Scanner;

/*
 * Desenvolva um programa para ler a idade de 
 * um conjunto de alunos (N alunos) de uma sala de aula e 
 * calcular a média das idades destes alunos.
 */

public class I07 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		int qtdAlunos, idade;
		float somaIdades = 0,media;
		
		System.out.println("Digite a quantidade de alunos");
		qtdAlunos = leia.nextInt();
		
		for(int cont = 1;cont<=qtdAlunos;cont++) {
			System.out.println("Digite a idade do aluno " + cont + ".");
			idade = leia.nextInt();
			somaIdades = (somaIdades + idade);
		}
		
		media = (somaIdades/qtdAlunos);
		
		System.out.println("A média das idades dos " + qtdAlunos + " alunos é " + media+ " anos.");
	}

}
