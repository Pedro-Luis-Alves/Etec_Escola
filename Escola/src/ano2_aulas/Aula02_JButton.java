package ano2_aulas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aula02_JButton extends JFrame{

	JButton jb = new JButton("Bot�o 1");
	
	public Aula02_JButton(){
		
		// Est� dizendo que voc� vai definir os componentes por conta pr�pria
		setLayout(null);
		
		// 1* = x ; 2* = y ; 3* = largura ; 4* = altura
		jb.setBounds(100, 300, 100, 60);
		
		// M�todo que adiciona uma componente � Janela.
		add(jb); // Tamb�m pode ser escrito como  "getContentPane().add(jb);" 
		
		// M�todos ensinados em Aula01_JFrame;
		setTitle("T�tulo da Janela");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	
	// -----------------------------------------------------------
	// -----> M�todo main
	
	public static void main(String[] args) {
		
		new Aula02_JButton();
	}
}
