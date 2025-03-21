package ano2_aulas;

import javax.swing.JFrame;

public class Aula01_JFrame {

	public Aula01_JFrame() {
		JFrame jf = new JFrame();
		
		// Recebe com parâmetro uma String, sendo o título da janela.
		jf.setTitle("Título da Janela");
		
		// Recebe como parâmetro dois Ints, largura e altura da janela respectivamente.
		jf.setSize(500, 400);
		
		// Faz com que ao fechar a janela, feche toda a aplicação, caso contrário o programa vai continuar a rodar e acumular espaço.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Define em qual lugar da tela a janela vai aparecer. 
		jf.setLocationRelativeTo(null);
		
		// Recebe um boolean, define se a janela pode ser redimensionada
		jf.setResizable(false);
		
		// Recebe um boolean, definindo se a janela está visivel ou não. 
		jf.setVisible(true);
	}
	
	// -----------------------------------------------------------
//	
// -----> Para evitar trabalho, é possivel fazer a Classe ser herdada da classe JFrame.
//	
//	public Aula01_JFrame() extends JFrame {
//	
// -----> Assim, não é necessário instânciar o objeto, nem dizer o nome dele para usar os métodos. 
//	
//		setTitle("Título da Janela");
//		setLocationRelativeTo(null);
//		setVisible(true);
//	}
	
	// -----------------------------------------------------------
	// ------> Método main
	
	public static void main(String[] args) {
		
		new Aula01_JFrame();
	}
	
}

