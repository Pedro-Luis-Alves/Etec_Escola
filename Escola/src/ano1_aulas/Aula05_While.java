package ano1_aulas;

import java.util.Scanner;

public class Aula05_While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int sexo,gostou,totSim = 0,totNao = 0,resp   = 0;
		float totSimFem = 0, totNaoMasc = 0, percSimFem = 0 , percNaoMasc = 0;
		
		System.out.println("---------PROGRAMA ENTREVISTA---------");
		System.out.println();
		System.out.println("O entrevistado gostou do produto?\nDigite 1 para Sim\nDigite 2 para Não");
		gostou = leia.nextInt();
		System.out.println("Informe o sexo do entrevistado\\nDigite 1 para Masculino\nDigite 2 para Feminino");
		sexo = leia.nextInt();
		
		while (resp!=3){
			if (gostou==1){
				totSim = (totSim+1);
				if (sexo ==2){
					totSimFem = (totSimFem +1);
				}
			}else if (gostou == 2) {
				totNao = (totNao + 1);
				if (sexo == 1 ){
					totNaoMasc = (totNaoMasc + 1);
				}
			}
			System.out.println("Digite 3 para SAIR ou qualquer outro número para continuar");
			resp = leia.nextInt();
			
			if (resp != 3){
				
			System.out.println();
			System.out.println("O entrevistado gostou do produto?\nDigite 1 para Sim\nDigite 2 para Não");
			gostou = leia.nextInt();
			System.out.println("Informe o sexo do entrevistado \nDigite 1 para Masculino\nDigite 2 para Feminino");
			sexo = leia.nextInt();
			}
		}
		
		percSimFem = (totSimFem/totSim*100);
		percNaoMasc = (totNaoMasc/totNao*100);
		 
			System.out.println("Total de entrevistados que gostaram do produto: " +totSim);
			System.out.println("Total de entrevistados que não gostaram do produto: " +totNao );
			System.out.println("Dos entrevistados que gostaram do produto " +percSimFem+ "%, são mulheres.");
			System.out.println("Dos entrevistados que não gostaram do produto " +percSimFem+ "%, são homens.");
	}

}
