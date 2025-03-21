package listaI;

import java.util.Scanner;

/* Desenvolva um programa para ler quatro notas de 10 alunos e 
 * calcular a média destas notas por aluno.*/

public class I05 {

	public static void main(String[] args) {
			Scanner leia = new Scanner (System.in);
			int media,n1,n2,n3,n4;
			
			for (int al=1;al<=10;al++){
				System.out.println("Digite a primeira nota do aluno " +al);
				n1 = leia.nextInt();
				
				System.out.println("Digite a segunda nota do aluno " +al);
				n2 = leia.nextInt();
				
				System.out.println("Digite a terceira nota do aluno " +al);
				n3 = leia.nextInt();
				
				System.out.println("Digite a quarta nota do aluno " +al);
				n4 = leia.nextInt();
				
				media = (n1+n2+n3+n4)/4;
				
				System.out.println("a média do aluno " +al+ " é " +media);
				System.out.println();
			}
	}

}
