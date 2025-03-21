package listaI;

import java.util.Scanner;

/*
 * Desenvolva um programa para ler a média de 20 alunos e calcular a quantidade de alunos que foram aprovados.
 * Para um aluno ser aprovado a sua média deve ser maior ou igual a 6.
 */

public class I06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int media, aprovados = 0;
		
		for(int aluno=1;aluno<=20;aluno++) {
			System.out.println("Digite a média do aluno " + aluno);
			media = leia.nextInt();
			
			if(media>=6) {
				aprovados = (aprovados + 1);
			}
		}
		
		System.out.println("A quantidade de alunos aprovados é " + aprovados + ".");
		
	}

}
