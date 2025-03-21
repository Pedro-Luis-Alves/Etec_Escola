package ano2_aulas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aula03_ActionListener extends JFrame implements ActionListener{

	JButton jb = new JButton("Bot�o 1");
	
	// Temos que reescrever o �nico m�todo da ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		//c�digo que vai ser executado quando o bot�o for clicado
		JOptionPane.showMessageDialog(null, "Bot�o Acionado");
	}
	
	public Aula03_ActionListener(){
		
		// Informando que o bot�o vai ser tratado nesta classe
		jb.addActionListener(this);
		
		//-------------------------------------
		// M�todos ensinados em Aula02_JButton;
		setLayout(null);
		jb.setBounds(100, 300, 100, 60);
		add(jb);
		
		//-------------------------------------
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
		
		new Aula03_ActionListener();
	}
}
