package cards;

public class Card2 {
    
    // members that are final are either initialised here or in the constructor
    // once initialised here cannot be initialised in the constructor
    private final String name;
    private final String suit;
    private final int value;
   
    // you cannot create a blank card
    public Card2(String suit, String name, int value) {
        this.suit = suit;
        this.name = name;
        this.value = value;


    }

    public String getName() {return name;}
    public String getSuit() {return suit;}
    public int getValue() {return value;}

    // override the toString method that prints the gibberish into something that we can make meaning of
    @Override
    public String toString() {
        return "Card{suit: %s, name: %s, value: %d}".formatted(suit,name,value);
    }
    
}
