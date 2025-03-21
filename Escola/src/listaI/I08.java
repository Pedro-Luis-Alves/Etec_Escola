package listaI;

import java.util.Scanner;

/* Desenvolva  um  programa  para  calcular  o  reajuste  salarial  de  todos  os  funcion�rios  de  um 
		 * empresa.  O  programa  dever�  solicitar  a  leitura  da  quantidade de  funcion�rios,  al�m  do  
		 * c�digo  e o sal�rio atual de cada funcion�rio e realizar o reajuste salarial de cada funcion�rio de 
		 * acordo com a tabela  abaixo.  O  programa  dever�  apresentar  os  seguintes  valores  para  cada  
		 * funcion�rio:sal�rio antigo, sal�rio novo e reajuste.
		 * 
		 * C�digo		Percentual
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
		
		System.out.println("Digite o n�mero de funcion�rios que a empresa possui");
		qtF = leia.nextInt();
		
		for (int num=1;num<=qtF;num++){
			
			System.out.println("Digite o sal�rio atual do funcion�rio " +num);
			salV = leia.nextInt();
			System.out.println("Digite o c�digo do funcion�rio " +num);
			codigo = leia.nextInt();
			
			if (codigo==1) {
				salN = salV + ((salV/100)*5);
				System.out.println("O funcion�rio " +num+ " possuia um sal�rio de " +salV+ ",agora,com um reajuste de 5%, o novo sal�rio dele � " + ((+salV) + ((salV/100)*5)) );
				System.out.println();
			}else if (codigo==2) {
				salN = salV + ((salV/100)*15);
				System.out.println("O funcion�rio " +num+ " possuia um sal�rio de " +salV+ ",agora,com um reajuste de 15%, o novo sal�rio dele � " + ((+salV) + ((salV/100)*15)) );
				System.out.println();
			}else if (codigo==3) {
				salN = salV + ((salV/100)*25);
				System.out.println("O funcion�rio " +num+ " possuia um sal�rio de " +salV+ ",agora,com um reajuste de 25%, o novo sal�rio dele � " + ((+salV) + ((salV/100)*25)) );
				System.out.println();
			}else if (codigo==4) {
				salN = salV + ((salV/100)*30);
				System.out.println("O funcion�rio " +num+ " possuia um sal�rio de " +salV+ ",agora,com um reajuste de 30%, o novo sal�rio dele � " + ((+salV) + ((salV/100)*30)) );
				System.out.println();
			}else {
				System.out.println("O c�digo inserido n�o existe");
				System.out.println();
			}
			
			
			
		}

	}

}
