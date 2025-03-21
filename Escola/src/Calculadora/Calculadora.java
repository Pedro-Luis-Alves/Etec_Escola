package Calculadora;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
		
	//	Esse trabalho foi concluido pelos alunos do 2* DS-B:
	//		- Pedro Luis Alves dos Santos
	//		- Kevyn Cavalcanti
	//	
	//	Fontes usadas para completar este trabalho:
	//		- Curso Programação Java: https://youtube.com/playlist?list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw
	//		- Livro Java Como Programar
	//
	// -----------------------------------------------------------
	// Declarações
	
	JFrame jf = new JFrame();
	
	JTextField textInput = new JTextField();
	
	JButton[] jbNumeros = new JButton[10];
	JButton[] jbFuncoes = new JButton[6];
	JButton AdiBot, MenBot, MultBot, DivBot, DeciBot, IgualBot;
	
	JPanel painelDeBotoes;
	
	// -----------------------------------------------------------
	// Defindo parâmetros do JFrame 
	
	public Calculadora() {
	
	jf = new JFrame("Calculadora");
	painelDeBotoes= new JPanel();
	textInput = new JTextField();
	
		jf.setLayout(null);	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 400);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
	
	// -----------------------------------------------------------
	// Caixa de texto
		
		textInput.setBounds(10,10, 365, 50);
		jf.add(textInput);
	
	// -----------------------------------------------------------		
	// Botões
		
		AdiBot   = new JButton("+");
		MenBot   = new JButton("-");
		MultBot  = new JButton("*");
		DivBot   = new JButton("/");
		DeciBot  = new JButton(".");
		IgualBot = new JButton("=");
		
		jbFuncoes[0] = AdiBot;
		jbFuncoes[1] = MenBot;
		jbFuncoes[2] = MultBot;
		jbFuncoes[3] = DivBot;
		jbFuncoes[4] = DeciBot;
		jbFuncoes[5] = IgualBot;
		
		for(int i = 0 ; 1<10 ; i++) {
			jbNumeros[i] = new JButton(String.valueOf(i));
			
			if (i == 9) {
				break;
			}
		}
		
	// -----------------------------------------------------------
	// Painel dos Botões
		
		painelDeBotoes.setBounds(10, 70, 365, 280);
		painelDeBotoes.setLayout(new GridLayout(4,4, 10,20));
		painelDeBotoes.setBackground(Color.LIGHT_GRAY);
		
		jf.add(painelDeBotoes);		
		
	// -----------------------------------------------------------
	// Adicionando Botões ao painél

		for(int i = 0 ; 1<10 ; i++){
			
			painelDeBotoes.add(jbNumeros[i]);
			
			if (i == 2) {
				painelDeBotoes.add(jbFuncoes[3]);
			}
			if (i == 5) {
				painelDeBotoes.add(jbFuncoes[2]);
			}	
			if (i == 8) {
				painelDeBotoes.add(jbFuncoes[1]);
			}
			if (i == 9) {
				painelDeBotoes.add(jbFuncoes[4]);
				painelDeBotoes.add(jbFuncoes[5]);
				painelDeBotoes.add(jbFuncoes[0]);
				break;
			}
		}
	
	// -----------------------------------------------------------
	// Visibilidade
		
		jf.setVisible(true);
	}
}