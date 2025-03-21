package ano2_trabalhos;

import javax.swing.JOptionPane;

/* Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto 
 * lançado. Para isso, forneceu o sexo do entrevistado e sua resposta (S – sim; ou N – não). 
 * Sabe-se que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:

	· O número de pessoas que responderam sim;

	· O número de pessoas que responderam não;

	· O número de mulheres que responderam sim;
	
	· O número de homens que responderam não; e
	
	· A porcentagem de homens que responderam não, dentre todos os homens analisados.

*/
public class Revisao1 {

	public static void main(String[] args) {

		int answer, gender, WomanYes = 0, ManNo = 0, answerYes = 0, answerNo = 0, NumberMan = 0;
		String[] option1 = { "Homem", "Mulher" };
		String[] option2 = { "Sim", "Não" };

		// -------------------------------------------------------------------

		for (int i = 1; i <= 10; i++) {

			gender = JOptionPane.showOptionDialog(null, "Qual o gênero do " + i + "* entrevistado?", "Gênero",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option1, option1[0]);

			answer = JOptionPane.showOptionDialog(null, "Você gostou do novo produto?", "Resposta",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option2, option2[0]);

			// ---------------------------------------------------------------

			if (answer == 0) { // Resposta SIM
				answerYes += 1;

				if (gender == 1) { // Mulheres com resposta SIM
					WomanYes += 1;
				} else if (gender == 0) { // Contando quantidade de homens
					NumberMan += 1;
				}

			} else if (answer == 1) { // Resposta NÃo
				answerNo += 1;

				if (gender == 0) { // Homens com resposta NÃO
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
				" O número de pessoas que responderam 'sim' é: " + answerYes + "\n"
						+ " O número de pessoas que responderam 'não' é: " + answerNo + "\n"
						+ " O número de mulheres que responderam 'sim' é: " + WomanYes + "\n"
						+ " O número de homens que responderam 'não' é: " + ManNo + "\n"
						+ " A porcentagem de homens que responderam não, dentre todos os homens analisados, é: "
						+ percentManNo + "%");

	}

}