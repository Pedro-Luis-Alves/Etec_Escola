package ano2_trabalhos;

import javax.swing.JOptionPane;

/* Um cinema que possui a capacidade de 100 lugares está sempre com ocupação total. Certo dia, cada expectador respondeu
*  a um questionário, no qual constava: sua idade e sua opinião em relação ao filme
*
* 	(5 – ótimo, 4 – bom, 3 – regular, 2 – ruim, 1 – péssimo).
*
* 	Elabore um algoritmo que calcule e exiba:
*
* 		a quantidade de respostas “ótimo”;
* 		a diferença percentual entre as respostas “regular” e ”bom”; 
* 		a idade média das pessoas que responderam “ruim” e        
* 		a porcentagem de respostas “péssimo” em relação ao total.
*
*/

public class Revisao3 {

	public static void main(String[] args) {

		int pessoas = 1, idade, resposta, quantidadePessimo = 0, quantidadeRuim = 0, quantidadeRegular = 0,
				quantidadeBom = 0, quantidadeOtimo = 0, coletaneaIdadeRuim = 0, idadeMediaRuim = 0;

		double porcentagemPessimo = 0, porcentagemRegular = 0, porcentagemBom = 0, diferencaRegularBom = 0;
		boolean cancel = false;
		String[] opnion = { "Péssimo", "Ruim", "Regular", "Bom", "Ótimo", "Parar o questionário" };
		
		//----------------------------------------------------

		while (pessoas <= 100) {

			idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Idade n* " +pessoas, JOptionPane.QUESTION_MESSAGE));
			
			resposta = JOptionPane.showOptionDialog(null, "Qual a sua opnião sobre o filme?", "Resposta n* " +pessoas,
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opnion, opnion[0]);
			

			//------------------------------------------------

			if (resposta == 0) {

				quantidadePessimo++;
			} else if (resposta == 1) {

				quantidadeRuim++;
				coletaneaIdadeRuim += idade;
				
				idadeMediaRuim = coletaneaIdadeRuim / quantidadeRuim;
			} else if (resposta == 2) {

				quantidadeRegular++;
			} else if (resposta == 3) {

				quantidadeBom++;
			} else if (resposta == 4) {

				quantidadeOtimo++;
			} else if (resposta == 5) {
				
				break;
			}

			// ------------------------------------------------

			pessoas++;

		}
		
		//----------------------------------------------------

		porcentagemPessimo = (quantidadePessimo * 100) / pessoas;
		
		
		porcentagemRegular = (quantidadeRegular * 100) / pessoas;
		porcentagemBom = (quantidadeBom * 100) / pessoas;
		
		diferencaRegularBom = porcentagemRegular - porcentagemBom;
	
		//----------------------------------------------------
		
		JOptionPane.showMessageDialog(null, "a quantidade de respostas “ótimo” é: " +quantidadeOtimo+ "\n"
										+	"a diferença percentual entre as respostas “regular” e ”bom” é: " +diferencaRegularBom+ "\n"
										+	"a idade média das pessoas que responderam “ruim” é: " +idadeMediaRuim+ "\n"
										+	"a porcentagem de respostas “péssimo” em relação ao total é: " +porcentagemPessimo+ "\n");
	
	}
}