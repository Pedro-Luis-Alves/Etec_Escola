package listaF;

import java.util.Scanner;

/* Desenvolva  um  programa  para  ler  quatro  
		 * valores  referentes  a  quatro  notas  
		 * escolares  de  um aluno e imprimir uma 
		 * mensagem dizendo que o aluno foi aprovado, 
		 * se o valor da m�dia escolar for maior ou igual 
		 * a  7. Se o valor da  m�dia for menor que  7, 
		 * solicitar a  nota  de  exame,  somar com o 
		 * valor  da  m�dia  e  obter  nova  m�dia.  
		 * Se  a  nova  m�dia for  maior  ou  igual  a  5, 
		 * apresentar  uma mensagem dizendo que o aluno 
		 * foi aprovado em exame. Se o aluno n�o foi 
		 * aprovado, indicar uma mensagem  informando  
		 * esta  condi��o.  Apresentar  junto com  as  
		 * mensagens  o  valor  da  m�dia  do aluno, 
		 * para qualquer condi��o.*/

public class F04 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3, n4, m, nx, nm;
		
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
		
		if (m >= 7){
			
			System.out.println();
			System.out.println("O aluno foi APROVADO com uma m�dia de " +m+ ".");
		}else {
			System.out.println();
			System.out.println("O valor da m�dia foi menor que o esperado, por favor digite a nota de exame");
			nx = leia.nextInt();
			
			nm = m+nx;
			
			if (nm >= 5){
				
				System.out.println();
				System.out.println("O aluno foi APROVADO com uma nova m�dia de " +nm+ ".");
			}else {
				
				System.out.println();
				System.out.println("O aluno foi REPROVADO com uma nova m�dia de " +nm+ ".");
			}
		}

		
	}

}
