package playcardv2;

import java.util.List;

public class PlayCardApp {

    public static void main(String[] args) {
        DeckOfCard deck = new DeckOfCard();
        List<PlayCard> cards = deck.getCards();
        System.out.println("Original cards ================");
        for (PlayCard card : cards) {
            System.out.println(card);
        }
        System.out.println();

        // Shuffle
        deck.shuffle();
        System.out.println("Shuffled cards ================");
        for (PlayCard card : cards) {
            System.out.println(card);
        }

        // Let's play
        Player[] players = new Player[4];
        String[] names = {"ដារា", "រក្សា", "ចាន់ណា", "ករុណា"};
        // initialize players
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i]);
        }
        System.out.println();

        // Deal cards to players
        deck.deal(players);
        for (Player player : players) {
            System.out.println("Player: " + player.getName() + "=====");
            List<PlayCard> playerCards = player.getCards();
            for (PlayCard playerCard : playerCards) {
                System.out.println(playerCard);
            }
            System.out.println();
        }
    }
}
