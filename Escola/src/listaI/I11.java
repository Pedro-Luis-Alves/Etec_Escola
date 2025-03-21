package listaI;

		/*Desenvolva um programa para calcular e apresentar o total da soma obtida 
		 * dos cem primeiros números inteiros (1+2+3+4+5+6+7+...+96+97+98+99+100).
		 * */	

public class I11 {

	public static void main(String[] args) {
		
		int i=1,r=0;
		
		for (i=1;i<=100;i++) {
			
			r += i;
			
		}
	
		System.out.println("A  soma dos cem primeiros números inteiros é: " +r);
			
	}
}


