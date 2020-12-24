package array;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCardsArrayList {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        ArrayList<String> cards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(rank + " of " + suit);
            }
        }

        System.out.println("A deck of cards");
//        System.out.println(Arrays.toString(cards));
        for (String card : cards) {
            System.out.println(card);
        }

        // Shuffle the cards
        Collections.shuffle(cards);

        System.out.println("Shuffle");
        for (String card : cards) {
            System.out.println(card);
        }

    }
}
