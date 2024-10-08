package cards;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Deck2 deck = new Deck2();
        Card2 card = deck.get(5);
        System.out.printf("suit: %s, name: %s, value: %d\n", card.getSuit(), card.getName(), card.getValue());
        System.out.println(deck);
        
        // arrange cards into a list
        List<Card2> deckList = new ArrayList<Card2>();
        

        for (int k = 0; k < 52; k++) {

            // get card from deck
            Card2 cardList = deck.get(k);

            // add card to list
            deckList.add(cardList);
        
        }
    
    for (int j = 0; j < deckList.size(); j++)
    System.out.printf("Card %d: %s\n", j+1, deckList.get(j));
}
}