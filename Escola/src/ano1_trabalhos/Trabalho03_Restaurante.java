package ano1_trabalhos;

import java.util.Scanner;

/*PRIMEIRO ENUNCIADO:
Em um restaurante ser� feita uma vota��o para saber quais s�o os pratos favoritos dos clientes, 
as op��es a serem votadas s�o: hamburguer, macarronada, lasanha e peixe empanado.

� necess�rio que o programa tenha:
    	
- A OP��O de acrescentar UM prato a mais.

- Op��es de votar em um prato, votar nulo (conta como voto), pular o voto (n�o conta como voto)
ou de terminar a vota��o (ap�s pelo menos 5 pessoas terem votado).
	
- No final, mostre o total de votos de cada um dos pratos e quantidade de votos nulos.
- No final, mostre um podium do mais votado pro menos votado 
	
OBS: JOptionPane e m�todo de ordena��o opcional.
*/

import javax.swing.JOptionPane;

public class Trabalho03_Restaurante {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int r, r2, voto, votoN = 0, ham = 0, mac = 0, las = 0, pei = 0;
		String op;
		
		for (int i=0 ; i <= 5; i++){
		
		System.out.println("Decida: \n 1 - votar\n 2 - votar nulo\n 3 - pular seu voto");
		r = leia.nextInt();
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		if (r == 1){
			
			System.out.println("Para qual dos pratos voc� deseja entregar seu voto? "
					+ "\n1 - Hamburguer\n2 - Macarronada\n3 - Lasanha\n4 - Peixe Empanado  ");
			voto = leia.nextInt();
				System.out.println();
				System.out.println("============================");
				System.out.println();
				
				if (voto == 1){
					
					ham += 1;
					
				}else if (voto == 2){
					
					mac += 1;
					
				}else if (voto == 3){
					
					las += 1;
					
				}else if (voto == 4){
					
					pei += 1;
					
				}// if 2
		
		}else if (r == 2){
			
			votoN += 1;
			
		}else if (r == 3){
			
			i--;
			
		}// if 1
	}//for at� 5
		
		
		System.out.println("Decida: \n 1 - votar\n 2 - votar nulo\n 3 - pular seu voto\n4 - acabar com a vota��o");
			r2 = leia.nextInt();
			System.out.println();
			System.out.println("============================");
			System.out.println();
			
		do {
			
			
			if (r2 == 1){
				
				System.out.println("Para qual dos pratos voc� deseja entregar seu voto? "
						+ "\n1 - Hamburguer\n2 - Macarronada\n3 - Lasanha\n 4 - Peixe Empanado  ");
				voto = leia.nextInt();
				System.out.println();
				System.out.println("============================");
				System.out.println();
					
					if (voto == 1){
						
						ham += 1;
						
					}else if (voto == 2){
						
						mac += 1;
						
					}else if (voto == 3){
						
						las += 1;
						
					}else if (voto == 4){
						
						pei += 1;
						
					}// if 2
			
	
			}else if (r2 == 2){
		
			votoN += 1;
		
			}
			
			}while (r2 != 4);
			
			
		System.out.println();
		System.out.println("==============Resultados===============");
		System.out.println();
		
		System.out.println("total de votos pro Hamburguer: " +ham);
		System.out.println("total de votos pro Macarronada: " +mac);
		System.out.println("total de votos pro Lasanha: " +las);
		System.out.println("total de votos pro Peixe Empanado: " +pei);
		
	}

}
