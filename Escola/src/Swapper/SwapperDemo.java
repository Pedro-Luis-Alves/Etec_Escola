package Swapper;

public class SwapperDemo {

	public static void main(String[] args) {
		
		Swapper magica = new Swapper(15 , 123450);
		
		System.out.println("Perceba que a vari�vel x � igual a " +magica.getX()+ " e a vari�vel y a " +magica.getY());
		System.out.println();
		System.out.println("Mas agora... Contemple!!!");
		System.out.println();
		
		magica.swap();
		
		System.out.println("O valor da vari�vel x agora � igual a " +magica.getX()+ " e o da vari�vel y � " +magica.getY());
	}

}