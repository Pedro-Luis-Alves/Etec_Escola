package Cards;

public class CardTester {

	public static void main(String[] args) {

		Card card1 = new Card(6 , 'a');
		Card card2 = new Card(6 , 'b');
		Card card3 = new Card(6 , 'c');
		Card card4 = new Card(1 , 'a');
		Card card5 = new Card(1 , 'b');
		
		System.out.println("A primeira carta tem o naipe: " +card1.getSuit()+ ", e valor: " +card1.getRank());
		System.out.println("A segunda carta tem o naipe: " +card2.getSuit()+ ", e valor: " +card2.getRank());
		System.out.println("A terceira carta tem o naipe: " +card3.getSuit()+ ", e valor: " +card3.getRank());
		System.out.println("A quarta carta tem o naipe: " +card4.getSuit()+ ", e valor: " +card4.getRank());
		System.out.println("A quinta carta tem o naipe: " +card5.getSuit()+ ", e valor: " +card5.getRank());
		System.out.println();
		System.out.println("PARABÉNS! É UM FULL HOUSE!!!");
	}
}
