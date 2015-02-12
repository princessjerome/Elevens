package Activity2;

public class DeckTester {

	public static void main(String[] args) {
		String ranks[] ={"Ace", "King", "Queen", "Jack", "10","9", "8","7","6", "5","4", "3", "2"};
                String suits[] ={"Heart", "Diamonds", "Clubs", "Spades"};
                int values[] ={11,10,10,10,10,9,8,7,6,5,4,3,2};
                Deck d = new Deck(ranks, suits, values);
                
                System.out.println("Dealt a " + d.deal());
                System.out.println("Dealt a " + d.deal());
                System.out.println("Dealt a " + d.deal());
                System.out.println(d);
	}
}
