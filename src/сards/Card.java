package сards;

public class Card {
	
	public int rank;
	public String suit;
	public String rankName;
	
	// Если карта инициализируется с мастью строкой и достоинством цифрой 
	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
		this.rankName = Card.getRankName(rank);
	}
	
	// Если карта инициализируется с мастью цифрой и достоинством цифрой
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = Card.getSuitName(suit);
		this.rankName = Card.getRankName(rank);
	}
	
	// Если карта инициализируется с мастью строкой и достоинством строкой
	public Card(String rank, String suit) {
		this.rank = Card.getRankByName(rank);
		this.suit = suit;
		this.rankName = rank;
	}
	
	public String getName() {
		String s = rankName+ " " +suit;
		return s;
	}
	
	public void printThisCard() {
		System.out.print(getName()+"; ");
	}
	
	public static int getRankByName(String name) {
		
		int res = 0;
		
		switch (String.format("%2$S", name)) {
			case " 2": res = 2;
			case " 3": res = 3;
			case " 4": res = 4;
			case " 5": res = 5; 
			case " 6": res = 6;
			case " 7": res = 7;
			case " 8": res = 8;
			case " 9": res = 9;
			case "10": res = 10;
			case " В": res = 11;
			case " Д": res = 12;
			case " К": res = 13;
			case " Т": res = 14;
			default: res = 0;
		}
		return res;
	}
	
	public static String getSuitName(int index) {
		String name = "";
		
		if (index > 4 || index < 0) 
			name = "";
		else {
			switch (index) {
				case 1: {name = "Пики ";  break;}
				case 2: {name = "Трефы";  break;}
				case 3: {name = "Бубны"; break;}
				case 4: {name = "Червы"; break;}
				default: {name = ""; break;}
			}
		}
		return name;
	}
	
	public static String getRankName(int index) {
		String name;
		
		if (index < 2 || index > 14) 
			name = "";
		else {
			switch (index) {
				case 2: {name = " 2"; break;} 
				case 3: {name = " 3"; break;}
				case 4: {name = " 4"; break;}
				case 5: {name = " 5"; break;}
				case 6: {name = " 6"; break;}
				case 7: {name = " 7"; break;}
				case 8: {name = " 8"; break;}
				case 9: {name = " 9"; break;}
				case 10: {name = "10"; break;}
				case 11: {name = " В"; break;}
				case 12: {name = " Д"; break;}
				case 13: {name = " К"; break;}
				case 14: {name =  " Т"; break;}
				default: {name = " "; break;}
			}	
		}
		
		return name; 
	}
	
	public static void printCard(Card c) {
		System.out.print(c.rankName+" "+c.suit);
	}
}
