package ano1_trabalhos;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Trabalho07_Desafio4 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner (System.in);
		
		Random ram = new Random();
		String pCertos = "";
		String vetNumeros = "";
		int acertos = 0, npalp, palp;
		
		
		
		
		int v[] = new int[12];
		int r[] = new int[3];
		
		for (int i=0; i < 3; i++){
		
		
		
		}
		
		
		/*---------------------------------VETORES ALEAT�RIOS------------------------------------*/
		
		for (int i=0; i<v.length; i++) {

			v[i] = ram.nextInt(200); 
			vetNumeros += v[i] + " ";
			
		}
		
		/*---------------------------------ADVINHAR------------------------------------*/
		
		for (npalp = 1; npalp < 4; npalp++){
			
			System.out.println("Qual o seu " +npalp+ "* palpite: ");
			palp = leia.nextInt();

			for (int i = 0; i < v.length; i++) {
				
				if(palp == v[i]){
					acertos +=1;
					pCertos += palp + " ";
				}
				
			}
		}

		
		/*---------------------------------MOSTRAR------------------------------------*/
		
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