package ano2_trabalhos;

import javax.swing.JOptionPane;

/* Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou n�o de um novo produto 
 * lan�ado. Para isso, forneceu o sexo do entrevistado e sua resposta (S � sim; ou N � n�o). 
 * Sabe-se que foram entrevistadas dez pessoas. Fa�a um programa que calcule e mostre:

	� O n�mero de pessoas que responderam sim;

	� O n�mero de pessoas que responderam n�o;

	� O n�mero de mulheres que responderam sim;
	
	� O n�mero de homens que responderam n�o; e
	
	� A porcentagem de homens que responderam n�o, dentre todos os homens analisados.

*/
public class Revisao1 {

	public static void main(String[] args) {

		int answer, gender, WomanYes = 0, ManNo = 0, answerYes = 0, answerNo = 0, NumberMan = 0;
		String[] option1 = { "Homem", "Mulher" };
		String[] option2 = { "Sim", "N�o" };

		// -------------------------------------------------------------------

		for (int i = 1; i <= 10; i++) {

			gender = JOptionPane.showOptionDialog(null, "Qual o g�nero do " + i + "* entrevistado?", "G�nero",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);

			answer = JOptionPane.showOptionDialog(null, "Voc� gostou do novo produto?", "Resposta",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);

			// ---------------------------------------------------------------

			if (answer == 0) { // Resposta SIM
				answerYes += 1;

				if (gender == 1) { // Mulheres com resposta SIM
					WomanYes += 1;
				} else if (gender == 0) { // Contando quantidade de homens
					NumberMan += 1;
				}

			} else if (answer == 1) { // Resposta N�o
				answerNo += 1;

				if (gender == 0) { // Homens com resposta N�O
					ManNo += 1;
					NumberMan += 1;
				}
			} // Fim dos IF's
		} // Fim do FOR

		// ----------------------------------------------------------------------

		float a = NumberMan;
		float b = ManNo;
		float percentManNo = a / 100;
		percentManNo = b / percentManNo;
		
		//------------------------------------------------------------------------

		JOptionPane.showMessageDialog(null,
				" O n�mero de pessoas que responderam 'sim' �: " + answerYes + "\n"
						+ " O n�mero de pessoas que responderam 'n�o' �: " + answerNo + "\n"
						+ " O n�mero de mulheres que responderam 'sim' �: " + WomanYes + "\n"
						+ " O n�mero de homens que responderam 'n�o' �: " + ManNo + "\n"
						+ " A porcentagem de homens que responderam n�o, dentre todos os homens analisados, �: "
						+ percentManNo + "%");

	}

}