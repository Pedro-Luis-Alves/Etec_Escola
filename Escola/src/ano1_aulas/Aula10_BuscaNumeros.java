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
			System.out.println("Digite seu " + nPalpite + "º:");
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
			JOptionPane.showMessageDialog(null, "Não foi dessa vez...", "OBRIGADO", 0);
		}else if(acertos==1){
			JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número:\n" + pCertos, "OBRIGADO", 0);
		}else{
			JOptionPane.showMessageDialog(null, "Parabéns! Você acertou os números:\n" + pCertos, "OBRIGADO", 0);
		}
		

	}

}
