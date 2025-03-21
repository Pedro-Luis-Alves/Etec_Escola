package listaI;

		/*)  Desenvolva  um  programa  para  calcular  a  soma  de  todos  os  numero  impares  de 1 à  20  e  
		 * a multiplicação de todos os números pares de 1 à 20.*/

public class I13 {

	public static void main(String[] args) {
		
		int  m = 0, s = 0;
				
		for (int i=0;i<=20;i++){
			
			if (i % 2 !=0) {
				
				s += i; 
			}else {
				
				m *= m*i; 
			}
		
		}
		System.out.println(m);
		System.out.println(s);
	}

}
