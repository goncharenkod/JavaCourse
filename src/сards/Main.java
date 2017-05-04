package ñards;

public class Main {

	public static void main(String[] args) {
		
		Deck deckOfCards = new Deck(52);
		
		deckOfCards.printDeck();
		
		deckOfCards.shuffleDeck();
		
		deckOfCards.printDeck();
		
	}
}
