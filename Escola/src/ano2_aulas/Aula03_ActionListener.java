package ano2_aulas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aula03_ActionListener extends JFrame implements ActionListener{

	JButton jb = new JButton("Botão 1");
	
	// Temos que reescrever o único método da ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		//código que vai ser executado quando o botão for clicado
		JOptionPane.showMessageDialog(null, "Botão Acionado");
	}
	
	public Aula03_ActionListener(){
		
		// Informando que o botão vai ser tratado nesta classe
		jb.addActionListener(this);
		
		//-------------------------------------
		// Métodos ensinados em Aula02_JButton;
		setLayout(null);
		jb.setBounds(100, 300, 100, 60);
		add(jb);
		
		//-------------------------------------
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
		
		new Aula03_ActionListener();
	}
}
