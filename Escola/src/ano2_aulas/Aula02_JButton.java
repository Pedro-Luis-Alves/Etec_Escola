package ano2_aulas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aula02_JButton extends JFrame{

	JButton jb = new JButton("Botão 1");
	
	public Aula02_JButton(){
		
		// Está dizendo que você vai definir os componentes por conta própria
		setLayout(null);
		
		// 1* = x ; 2* = y ; 3* = largura ; 4* = altura
		jb.setBounds(100, 300, 100, 60);
		
		// Método que adiciona uma componente á Janela.
		add(jb); // Também pode ser escrito como  "getContentPane().add(jb);" 
		
		// Métodos ensinados em Aula01_JFrame;
		setTitle("Título da Janela");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	
	// -----------------------------------------------------------
	// -----> Método main
	
	public static void main(String[] args) {
		
		new Aula02_JButton();
	}
}
