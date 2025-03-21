package listaI;

import java.util.Scanner;

/* Desenvolva  um  programa  para  calcular  o  reajuste  salarial  de  todos  os  funcionários  de  um 
		 * empresa.  O  programa  deverá  solicitar  a  leitura  da  quantidade de  funcionários,  além  do  
		 * código  e o salário atual de cada funcionário e realizar o reajuste salarial de cada funcionário de 
		 * acordo com a tabela  abaixo.  O  programa  deverá  apresentar  os  seguintes  valores  para  cada  
		 * funcionário:salário antigo, salário novo e reajuste.
		 * 
		 * Código		Percentual
		 * 
		 * 1			5%
		 * 2			15%	
		 * 3			25%
		 * 4			30%
		 * */


public class I08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int salN,salV,qtF,codigo,pc;
		
		System.out.println("Digite o número de funcionários que a empresa possui");
		qtF = leia.nextInt();
		
		for (int num=1;num<=qtF;num++){
			
			System.out.println("Digite o salário atual do funcionário " +num);
			salV = leia.nextInt();
			System.out.println("Digite o código do funcionário " +num);
			codigo = leia.nextInt();
			
			if (codigo==1) {
				salN = salV + ((salV/100)*5);
				System.out.println("O funcionário " +num+ " possuia um salário de " +salV+ ",agora,com um reajuste de 5%, o novo salário dele é " + ((+salV) + ((salV/100)*5)) );
				System.out.println();
			}else if (codigo==2) {
				salN = salV + ((salV/100)*15);
				System.out.println("O funcionário " +num+ " possuia um salário de " +salV+ ",agora,com um reajuste de 15%, o novo salário dele é " + ((+salV) + ((salV/100)*15)) );
				System.out.println();
			}else if (codigo==3) {
				salN = salV + ((salV/100)*25);
				System.out.println("O funcionário " +num+ " possuia um salário de " +salV+ ",agora,com um reajuste de 25%, o novo salário dele é " + ((+salV) + ((salV/100)*25)) );
				System.out.println();
			}else if (codigo==4) {
				salN = salV + ((salV/100)*30);
				System.out.println("O funcionário " +num+ " possuia um salário de " +salV+ ",agora,com um reajuste de 30%, o novo salário dele é " + ((+salV) + ((salV/100)*30)) );
				System.out.println();
			}else {
				System.out.println("O código inserido não existe");
				System.out.println();
			}
			
			
			
		}

	}

}
