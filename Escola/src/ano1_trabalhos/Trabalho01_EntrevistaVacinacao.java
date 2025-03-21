package ano1_trabalhos;

		/*O programa deve auxiliar na entrevista de pessoas, o objetivo é levantar dados 

		 * sobre a vacinação do Covid 19 no bairro de Itaquera em São Paulo.
			O usuário deve informar ao programa a quantidade de entrevistados,
			 deve solicitar a idade de cada entrevistado e se ele foi ou não vacinado,
			  caso tenha sido vacinado, se tomou apenas a primeira ou as duas doses.
				Ao final, o programa deve apresentar:

1 - Quantidade e média de idade das pessoas que não foram vacinadas.
2 - Quantidade e média de idade das pessoas que receberam apenas a primeira dose da vacina.
3 - Quantidade e média de idade das pessoas que receberam as duas doses da vacina.*/

import java.util.Scanner;

public class Trabalho01_EntrevistaVacinacao {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner (System.in);
		int qtp,r=0,idade=0,doses=0,d0=0,d1=0,d2=0,media0=0,media1=0,media2=0;
		
		
		System.out.println("Quantas pessoas estão sendo entrevistadas?");
		qtp = leia.nextInt();
		
		for (int i=1; i<=qtp; i++){
			
			
			System.out.println("Qual a idade do entrevistado " +i+ " ?");
			idade = leia.nextInt();
			System.out.println();
			
			//---------------------------------------primeira pergunta------------------------------------------------------
			
			System.out.println("o entrevistado " +i+ " já se vacinou ?use 1 para 'sim', e 2 para 'não'.");
			r = leia.nextInt();
			System.out.println();
			
			
				
			
			//---------------------------------------segunda pergunta------------------------------------------------------
				
			if (r == 1){
				System.out.println("Quantas doses ele tomou?");
				doses = leia.nextInt();
				System.out.println();
				
				if (doses==1){
					System.out.println("O entreviistado " +i+ " tomou apenas a primeira dose.");
					System.out.println();
					d1 += 1;
					media1 += idade;
				}	
					if (doses==2){
						System.out.println("O entreviistado " +i+ " já tomou a segunda dose.");
						System.out.println();
						d2 += 1;
						media2 += idade;
					} 
						if ((doses < 1) || (doses > 2)){
							System.out.println("Essa quantidade não é aceitável.");
							System.out.println();
						}	
			}
			
			
			if (r == 2){
				System.out.println("O entrevistado " +i+ " não foi vacinado.");
				System.out.println();
				d0 += 1;
				media0 += idade;
			}
			
			if ((r < 1) || (r > 2)){
				System.out.println("essa não é uma das opções.");
				
			}
			
			System.out.println("-----------------------------------------------------");
		}	
		
		//MÉDIAS E QUANTIDADES
			
		System.out.println();
		System.out.println("Obrigado pelas respostas.");
		System.out.println();
		System.out.println("Quantidade de pessoas que não foram vacinadas: " +d0);
			if ((d0 >= 1) || (d0 <= 1)){
				System.out.println("Média de idade: " +(media0/d0));
			}
			
			System.out.println();
			System.out.println("Quantidade de pessoas que tomaram apenas a primeira dose: " +d1);
				if ((d1 >= 1) || (d1 <= 1)){
					System.out.println("Média de idade: " +(media1/d1));
				}
				
				System.out.println();
				System.out.println("Quantidade de pessoas que tomaram a segunda dose: " +d2);
					if ((d2 >= 1) || (d2 <= 1)){
						System.out.println("Média de idade: " +(media2/d2));
					}
		}
		
}
