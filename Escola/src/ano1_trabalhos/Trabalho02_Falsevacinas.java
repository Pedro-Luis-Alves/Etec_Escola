package ano1_trabalhos;
import java.util.Scanner;

public class Trabalho02_Falsevacinas {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int qp=0, i=0, miv1=0, miv2=0, minv=0, nv=0, v1=0, v2=0, v=0, qv;
		
		System.out.print("Insira a quantidade de entrevistados: ");
		qp = read.nextInt();
		
		for(int n=1; n<=qp; n++) {
			
			System.out.println("-------------------"+n+"� Entrevistado-------------------");
			
			System.out.print("Insira sua idade: ");
			i = read.nextInt();
			
			System.out.print("Voc� j� foi vacinado? 1 para sim, 2 para n�o: ");
			
			v = read.nextInt();
			
			
			if((v == 1)) {
				System.out.print("Insira quantas doses voc� tomou: ");
				qv = read.nextInt();
				
				if(qv == 1) {
					System.out.println(n+"� entrevistado uma dose.");
					v1 += 1;
					miv1 += i;
				}
				if(qv == 2) {
					System.out.println(n+"� entrevistado duas doses.");
					v2 += 1;
					miv2 += i;
				}
				if((qv > 2) || (qv < 1)) {
					System.out.println("Insira uma quantidade val�da!");
				}
			}
			if((v == 2)) {
				System.out.println(n+"� entrevistado n�o vacinado.");
				nv += 1;
				minv += i;
			}
			if((v > 2) || (v < 1)) {
				System.out.println("Insira uma resposta val�da!");
			}
		}
		
		System.out.println();
		
		System.out.println("-------------------N�o Vacinados-------------------");
		
		System.out.println("Quantidade de pessoas n�o vacinadas: "+nv);
		
		if(nv >= 1) {
			System.out.println("M�dia de idade: "+(minv/nv));
		}
		
		System.out.println("-------------------Vacinados 1� Dose-------------------");
		System.out.println("Quantidade de pessoas que tomaram a 1� dose: "+v1);
		
		if(v1 >= 1) {
			System.out.println("M�dia de idade: "+(miv1/v1));
		}
		
		System.out.println("-------------------Vacinados 2� Dose-------------------");
		System.out.println("Quantidade de pessoas que tomaram a 2� dose: "+v2);
		
		if(v2 >= 1) {
			System.out.println("M�dia de idade: "+(miv2/v2));
		}

	}

}