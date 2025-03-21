package ano2_aulas;

import javax.swing.JFrame;

public class Aula01_JFrame {

	public Aula01_JFrame() {
		JFrame jf = new JFrame();
		
		// Recebe com par�metro uma String, sendo o t�tulo da janela.
		jf.setTitle("T�tulo da Janela");
		
		// Recebe como par�metro dois Ints, largura e altura da janela respectivamente.
		jf.setSize(500, 400);
		
		// Faz com que ao fechar a janela, feche toda a aplica��o, caso contr�rio o programa vai continuar a rodar e acumular espa�o.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Define em qual lugar da tela a janela vai aparecer. 
		jf.setLocationRelativeTo(null);
		
		// Recebe um boolean, define se a janela pode ser redimensionada
		jf.setResizable(false);
		
		// Recebe um boolean, definindo se a janela est� visivel ou n�o. 
		jf.setVisible(true);
	}
	
	// -----------------------------------------------------------
//	
// -----> Para evitar trabalho, � possivel fazer a Classe ser herdada da classe JFrame.
//	
//	public Aula01_JFrame() extends JFrame {
//	
// -----> Assim, n�o � necess�rio inst�nciar o objeto, nem dizer o nome dele para usar os m�todos. 
//	
//		setTitle("T�tulo da Janela");
//		setLocationRelativeTo(null);
//		setVisible(true);
//	}
	
	// -----------------------------------------------------------
	// ------> M�todo main
	
	public static void main(String[] args) {
		
		new Aula01_JFrame();
	}
	
}

