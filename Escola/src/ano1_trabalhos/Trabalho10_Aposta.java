package ano1_trabalhos;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


/*Desenvolver um programa de apostas. Inicialmente, o programa dever� atender ao seguinte enunciado. 
 * 
1 - Apresentar ao usu�rio op��o de definir quantos n�meros ser�o gerados aleatoriamente.
2 - Apresentar ao usu�rio op��o de definir o n�mero m�ximo a ser gerado e se o 0(zero) � v�lido ou n�o.
3 - Apresentar ao usu�rio 3 op��es de quantidade de palpites, sendo 1, 3 ou 5.
4 - Validar poss�veis acertos e devolver o resultado em tela, com mensagens personalizadas.

O programa deve gerar os n�meros atendendo ao definido pelo usu�rio.
A pesquisa dos palpites, no vetor pode ocorrer de forma sequencial ou bin�ria, mas o desej�vel � que seja bin�ria.
*/

public class Trabalho10_Aposta {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		String[] p = {"1" , "3" , "5" } ;
		String[] z = {"Sim" , "N�o"};
		String vN = "";
		String vNo = "";
		int troca, ordem = 0, meio;
		
		/*----------CONFIGURA��ES----------------------------------------------------------------------------*/
		
		int limN = Integer.parseInt((JOptionPane.showInputDialog(null, "Defina quantos n�meros ser�o gerados aleatoriamente")));
		
		int nF = Integer.parseInt((JOptionPane.showInputDialog(null, "Defina o n�mero m�ximo a ser gerado")));
		
		int zero = JOptionPane.showOptionDialog(null, "Defina se o 0(zero) � v�lido ou n�o", "", 0, JOptionPane.QUESTION_MESSAGE, null, z, z[0]);
		
		int Npalp = JOptionPane.showOptionDialog(null, "Decida a quantidade de palpites", "", 0, JOptionPane.QUESTION_MESSAGE, null, p, p[0]);
		
		
		System.out.println(limN);
		System.out.println(nF);
		System.out.println(zero);
		System.out.println(Npalp);
		
		
		/*----------ZERO OU N�O?----------------------------------------------------------------------------*/
		
		int[] v = new int[limN];
		
		if (zero == 0){
			
			Random ram = new Random(nF);
			
			for (int i = 0; i < limN; i++) {
				v[i] = ram.nextInt(nF);
				vN += v[i] + " ";
				
			}
			
		}else if ( zero == 1){
			
			Random ram = new Random(nF) ;

			for (int i = 0; i < limN; i++) {
				v[i] = ram.nextInt(nF) + 1;
				vN += v[i] + " ";
			}
		}
		

		System.out.println(vN);
		/*----------ORDEM CRESCENTE----------------------------------------------------------------------------*/
		
		switch (ordem){
		
		case 0:
			
			for (int j = 0; j < limN - 1; j++){	
				
				for (int i = j + 1; i < limN; i++) {
					
					if(v[j]>v[i]){
						
						troca = v[j];
						v[j] = v[i];
						v[i] = troca;
						
					}
				}
			}
		}

		vNo += v[i] + " ";
		System.out.println(vN);
		
		/*----------PALPITES----------------------------------------------------------------------------*/
		
		int palp = 0;
		

		if (Npalp == 0){
		
			int q = 1;
			
			for (int i = 0; i < q; i++){
							
				System.out.println("Qual o seu palpite?");
				palp = leia.nextInt();
				
			}
		
		}else if (Npalp == 1){
		
			int q = 3;
			
			
			for (int i = 0; i < q; i++){
							
				System.out.println("Qual o seu palpite?");
				palp = leia.nextInt();
				System.out.println();
				
			}
		
		}else if (Npalp == 2){
		
			int q = 5;
			
			
			for (int i = 0; i < q; i++){
							
				System.out.println("Qual o seu palpite?");
				palp = leia.nextInt();
				System.out.println();
				
			}
		
		}
		
		
		while (v[0] <= nF) {
			
			meio = (v[0] + nF) / 2;
			
			int k = 0;
			k++;
			
			if (palp == v[meio]){
				
				nF = meio - 1;
				
			}else {
				
				v[0] = meio + 1;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, vN, "VETOR", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
		
		
		
	}

}
