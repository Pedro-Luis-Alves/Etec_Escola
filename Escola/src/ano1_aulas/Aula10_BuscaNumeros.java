package ano1_aulas;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula10_BuscaNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = new int[12];
		String pCertos = "";
		String vetNumeros = "";
		int palpite, nPalpite, acertos = 0;
		Random gerador = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(200);
			vetNumeros += vetor[i] + " ";
		}
		
		for (nPalpite = 1; nPalpite < 4; nPalpite++) {
			System.out.println("Digite seu " + nPalpite + "�:");
			palpite = leia.nextInt();
			for (int i = 0; i < vetor.length; i++) {
				if(palpite == vetor[i]){
					acertos +=1;
					pCertos += palpite + " ";
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, vetNumeros, "VETOR", JOptionPane.INFORMATION_MESSAGE);
		if(acertos==0){
			JOptionPane.showMessageDialog(null, "N�o foi dessa vez...", "OBRIGADO", 0);
		}else if(acertos==1){
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� acertou o n�mero:\n" + pCertos, "OBRIGADO", 0);
		}else{
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� acertou os n�meros:\n" + pCertos, "OBRIGADO", 0);
		}
		

	}

}
