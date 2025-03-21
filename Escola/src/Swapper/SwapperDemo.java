package Swapper;

public class SwapperDemo {

	public static void main(String[] args) {
		
		Swapper magica = new Swapper(15 , 123450);
		
		System.out.println("Perceba que a variável x é igual a " +magica.getX()+ " e a variável y a " +magica.getY());
		System.out.println();
		System.out.println("Mas agora... Contemple!!!");
		System.out.println();
		
		magica.swap();
		
		System.out.println("O valor da variável x agora é igual a " +magica.getX()+ " e o da variável y é " +magica.getY());
	}

}