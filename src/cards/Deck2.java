package cards;

import java.util.List;
import java.util.*;

public class Deck2 {

    public static final String[] SUIT = {
        "Diamond", "Spade", "Hearts", "Clubs"
     };

     public static final String[] NAMES = {
        "Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Jack", "Queen", "King"
     };

     public static final int[] VALUES = {
        1, 2, 3, 4, 5, 6, 7, 
        8, 9, 10, 10, 10, 10
     };
    
    protected Card2[] cards;

    public Deck2() {

        int idx = 0;

        cards = new Card2[52];

        for (int s = 0; s < SUIT.length; s++) {
            String suit = SUIT[s];

            for (int n = 0; n < NAMES.length; n++) {
                String name = NAMES[n];
                int value = VALUES[n];
                Card2 card = new Card2(suit, name, value);
                cards[idx] = card;
                idx ++;
            }
        }
    }

    public Card2 get(){
        return this.cards[0];
    }

    public Card2 get(int pos){
        return this.cards[pos];
    }

    
    

}

