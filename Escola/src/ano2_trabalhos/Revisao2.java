package ano2_trabalhos;

import javax.swing.JOptionPane;

/*	Fa�a um programa que receba duas notas de seis (6) alunos, calcule e mostre:

		- A m�dia aritm�tica das duas notas de cada aluno;
		- A mensagem que est� na tabela a seguir:

			M�DIA ARITM�TICA MENSAGEM
			
			At� 3 === Reprovado
			
			Entre 3 e 7 === Exame
			
			De 7 para cima === Aprovado

		- O total de alunos aprovados;
		- O total de alunos em exame;
		- O total de alunos reprovados;
		- A m�dia da classe.
 */

	public class Revisao2 {

		public static void main(String[] args) {

			int nota1 = 0, nota2 = 0, aprovados = 0, reprovados = 0, exame = 0, m = 0;
			double MediaDaClasse = 0;
			double[] MediaAluno = new double[7];

		//-------------------------------------------------------- Inicio do 1* FOR e das duas notas do aluno 

		for (int i = 1; i <= 6; i++) {

			nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota do " + i + "* aluno"));

			nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota do " + i + "* aluno"));

			//---------------------------------------------------- Calculo da m�dia do aluno
			
			MediaAluno[m] = ((nota1 + nota2) / 2);
			
			//---------------------------------------------------- Contando o n�mero de aprovados, reprovados e alunos em exame
			
			if (MediaAluno[m] <= 3) {

				reprovados++;
			} else if ((MediaAluno[m] > 3) && (MediaAluno[m] < 7)) {

				exame++;
			} else if (MediaAluno[m] > 7) {

				aprovados++;
			}
			
			//----------------------------------------------------- Aumentando em 1 o controlador do array

			m += 1;

		}
		
		//--------------------------------------------------------- Calculando m�dia da classe

		for (int g = 0; g <= 6; g++) {

			MediaDaClasse += MediaAluno[g];
		}

		MediaDaClasse = MediaDaClasse / 6;
		
		//--------------------------------------------------------- Menssagens com os resultados
			
		JOptionPane.showMessageDialog(null, 	"Aluno 1 tem a m�dia aritm�tica de: " +MediaAluno[0]+ "\n"
											+	"Aluno 2 tem a m�dia aritm�tica de: " +MediaAluno[1]+ "\n"
											+	"Aluno 3 tem a m�dia aritm�tica de: " +MediaAluno[2]+ "\n"
											+	"Aluno 4 tem a m�dia aritm�tica de: " +MediaAluno[3]+ "\n"
											+	"Aluno 5 tem a m�dia aritm�tica de: " +MediaAluno[4]+ "\n"
											+	"Aluno 6 tem a m�dia aritm�tica de: " +MediaAluno[5]+ "\n");
		
		
		JOptionPane.showMessageDialog(null, 			"A M�DIA ARITM�TICA\r\n"
										+ "									"
										+ "				At� 3 === Reprovado\r\n"
										+ "				Entre 3 e 7 === Exame\r\n"
										+ "				De 7 para cima 	=== Aprovado");
		
	
		JOptionPane.showMessageDialog(null, 	"A quantidade de pessoas aprovados �: " +aprovados+ "\n"
											+ 	"A quantidade de pessoas em exame �: " +exame+ "\n"
											+ 	"A quantidade de pessoas reprovados �: " +reprovados+ "\n"
											+ 	"\n"
											+ 	"A m�dia da classe �: " +MediaDaClasse);
	}
}