package сards;

import java.util.Random;
import java.util.ArrayList;

public class Deck {

	public ArrayList<Card> deck;
	public final int deckSize;
	public int size;	
	
	public Deck(int sizeOfDeck) {
		deckSize = sizeOfDeck;
		deck = new ArrayList<Card>(sizeOfDeck);
		fillDeck();
		setSize();
	}
	
	public Deck() {
		deckSize = 52;
		deck = new ArrayList<Card>(52);
		fillDeck();
		setSize();
	}
	
	private void fillDeck() {
		
		if ( (deckSize%4)!=0 ) {
			System.out.println("Не правильно задано количество карт. /n Количество должно делиться на 4 без остатка");
			return;
		}
		
		int rankSize = deckSize / 4; // сколько карт в одной масти
		
		for (int s=1; s<=4; s++) {   // пройдемся по всем мастям
			
			//int m = rankSize * (s-1);   
			
			for (int i=2; i<=rankSize+1; i++) {
				deck.add(new Card(i, s));
			}
		}
	}
	
	public void printDeck() {
		
		int rankSize = deckSize / 4;
		
		for (int s = 1; s<=4; s++) {
			
			int m = rankSize * (s-1);
			
			for (int i=1; i<=rankSize; i++) {
				deck.get(m+i-1).printThisCard();
			}
			System.out.println();
		}
		System.out.println();
	}

	public void shuffleDeck() {
		
		ArrayList<Card> newDeck = new ArrayList<Card>(0);
		
		for (int i=1; i<=deckSize; i++) {
			Random rnd = new Random();
	    	int nextIndex = rnd.nextInt(deck.size());
	    	Card element = deck.get(nextIndex);
	    	newDeck.add(element);
	    	deck.remove(nextIndex);
	    	//System.out.println("i=" +i+ "; nextIndex=" +nextIndex+ "; element=" +element.getName()+ "; SizeOfList="+deck.size());
		}
		deck.addAll(newDeck);
	}

	public int getSize() {
		return size;
	}
	
	private void setSize() {
		size = deck.size();
	}
}
