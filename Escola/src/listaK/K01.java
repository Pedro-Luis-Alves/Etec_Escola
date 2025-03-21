package listaK;

	/* Desenvolva  um  programa  para  apresentar  os  números  de  1  até  100  em  ordem  crescente 
	 * e depois em ordem decrescente.*/

public class K01 {

	public static void main(String[] args) {
		
		int n = 0;
		
		n = 1;
		
		do{
			System.out.println(n);
			n++;
		}while (n<=99);
		
		do{
			System.out.println(n);
			n--;
		}while (n>=1);
		
	}

}
