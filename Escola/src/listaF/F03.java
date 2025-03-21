package listaF;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  quatro  
		 * valores  referentes  a  quatro  notas  
		 * escolares  de  um aluno e imprimir uma 
		 * mensagem dizendo que o aluno foi aprovado, 
		 * se o valor da média escolar for maior ou igual 
		 * a 5. Se o aluno não foi aprovado, indicar uma 
		 * mensagem informando esta condição. Apresentar 
		 * junto com a mensagem o valor da média do aluno 
		 * para qualquer condição.*/

public class F03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4, m;
		
		System.out.println("Digite a primeira nota do aluno");
		n1 = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite a segunda nota do aluno");
		n2 = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite a terceira nota do aluno");
		n3 = leia.nextInt();
		
		System.out.println();
		System.out.println("Digite a quarta nota do aluno");
		n4 = leia.nextInt();
		
		m = (n1+n2+n3+n4)/4;
		
		if (m >= 5){
			
			System.out.println();
			System.out.println("O aluno foi APROVADO com uma média de " +m+ ".");
		}else {
			System.out.println();
			System.out.println("O aluno foi REPROVADO com uma média de " +m+ ".");
		}
	}

}
