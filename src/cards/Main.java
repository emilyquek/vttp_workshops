package cards;

public class Main {
    public static void main(String[] args) {
        
        Deck2 deck = new Deck2();
        Card2 card = deck.get(5);
        System.out.printf("suit: %s, name: %s, value: %d\n", card.getSuit(), card.getName(), card.getValue());
        System.out.println(deck);
    }
}
