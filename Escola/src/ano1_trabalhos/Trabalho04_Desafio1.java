package ano1_trabalhos;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Trabalho04_Desafio1 {

	public static void main(String[] args) {

		//Esse desafio foi completado por 'Pedro Luis Alves dos Santos'
		
		Scanner leia = new Scanner (System.in);
		int n = 0, seg = 0, r;
		int curtiu = 0;
		int ncurtiu = 0;
		int nopinar = 0;

		String fra;
		
		System.out.println("Registre sua frase de efeito");
		fra = leia.next();
		
		
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println("Frase: " +fra);
		
		do {
			
			n += 1;
			seg += 1;
			
			
			System.out.println();
			System.out.println("Seguidor " +seg+ " Digite:"
					
					+ "\n1 - CURTIU\r\n"
					+ "2 - NÃO CURTIU\r\n"
					+ "3 - PREFERE NÃO OPINIAR\r\n"
					+ "4 - MOSTRAR A FRASE\r\n"
					+ "5 - SAIR");
			r = leia.nextInt();
			
			if (r == 1){
				
				
				curtiu += 1;
			}else if (r == 2){
				
				ncurtiu += 1;
			}else if (r == 3){
				
				nopinar += 1;
			}else if (r == 4){
				
				n = n - 1;
				seg = seg - 1;
				
				System.out.println();
				System.out.println("------------------------");
				System.out.println("Frase: " +fra);
				
			}else if (r == 5){
				
				n = 10;
			}else {
				n = n - 1;
				seg = seg - 1;
				System.out.println();
				System.out.println("--------------------");
				System.out.println("Número inválido!");
			}
			
		}while (n != 10);
		
		
		JOptionPane.showMessageDialog(null, "---------RESULTADO---------\n\n"
				+ "CURTIRAM: " +curtiu+ "\n"
				+ "NÃO CURTIRAM: " +ncurtiu+ "\n"
				+ "PREFERIRAM NÃO OPINAR: " +nopinar);
		
		
		
	}

}
