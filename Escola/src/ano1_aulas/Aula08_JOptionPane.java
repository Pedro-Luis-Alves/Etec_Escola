package ano1_aulas;

import javax.swing.JOptionPane;

public class Aula08_JOptionPane {

	
	public static void main(String[] args) {
	
		String frase, menu;
		frase = JOptionPane.showInputDialog(null, "Frase", "Entrada", JOptionPane.QUESTION_MESSAGE);

		menu = "m";
		 JOptionPane.showInputDialog(null, menu,"");
	}

}
