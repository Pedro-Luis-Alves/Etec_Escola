package ano1_trabalhos;
import java.util.Scanner;

public class Trabalho02_Falsevacinas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int qp=0, i=0, miv1=0, miv2=0, minv=0, nv=0, v1=0, v2=0, v=0, qv;
		
		System.out.print("Insira a quantidade de entrevistados: ");
		qp = read.nextInt();
		
		for(int n=1; n<=qp; n++) {
			
			System.out.println("-------------------"+n+"º Entrevistado-------------------");
			
			System.out.print("Insira sua idade: ");
			i = read.nextInt();
			
			System.out.print("Você já foi vacinado? 1 para sim, 2 para não: ");
			
			v = read.nextInt();
			
			
			if((v == 1)) {
				System.out.print("Insira quantas doses você tomou: ");
				qv = read.nextInt();
				
				if(qv == 1) {
					System.out.println(n+"º entrevistado uma dose.");
					v1 += 1;
					miv1 += i;
				}
				if(qv == 2) {
					System.out.println(n+"º entrevistado duas doses.");
					v2 += 1;
					miv2 += i;
				}
				if((qv > 2) || (qv < 1)) {
					System.out.println("Insira uma quantidade valída!");
				}
			}
			if((v == 2)) {
				System.out.println(n+"º entrevistado não vacinado.");
				nv += 1;
				minv += i;
			}
			if((v > 2) || (v < 1)) {
				System.out.println("Insira uma resposta valída!");
			}
		}
		
		System.out.println();
		
		System.out.println("-------------------Não Vacinados-------------------");
		
		System.out.println("Quantidade de pessoas não vacinadas: "+nv);
		
		if(nv >= 1) {
			System.out.println("Média de idade: "+(minv/nv));
		}
		
		System.out.println("-------------------Vacinados 1ª Dose-------------------");
		System.out.println("Quantidade de pessoas que tomaram a 1ª dose: "+v1);
		
		if(v1 >= 1) {
			System.out.println("Média de idade: "+(miv1/v1));
		}
		
		System.out.println("-------------------Vacinados 2ª Dose-------------------");
		System.out.println("Quantidade de pessoas que tomaram a 2ª dose: "+v2);
		
		if(v2 >= 1) {
			System.out.println("Média de idade: "+(miv2/v2));
		}

	}

}