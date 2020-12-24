package array;

import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        String[] cards = new String[52];

        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                cards[k++] = rank + " of " + suit;
            }
        }

        System.out.println("A deck of cards");
//        System.out.println(Arrays.toString(cards));
        for (String card : cards) {
            System.out.println(card);
        }

        // Shuffle the cards
        for (int i = 0; i < cards.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * cards.length);
            String temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }

        System.out.println("Shuffle");
        for (String card : cards) {
            System.out.println(card);
        }

    }
}
