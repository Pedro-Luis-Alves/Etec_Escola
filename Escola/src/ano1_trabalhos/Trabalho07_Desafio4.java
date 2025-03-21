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
		
		
		/*---------------------------------VETORES ALEATÓRIOS------------------------------------*/
		
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
			
			JOptionPane.showMessageDialog(null, "Não foi dessa vez...", "OBRIGADO", 0);
			
		}else if(acertos==1){
			
			JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número:\n" + pCertos, "OBRIGADO", 0);
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Parabéns! Você acertou os números:\n" + pCertos, "OBRIGADO", 0);
			
		}
		
	}

}