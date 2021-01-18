package playcardv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface DeckOfCardActionable {

    public List<PlayCard> getCards();

    public default void sort(){
        List<PlayCard> cards = getCards();
        Collections.sort(cards);
    }

    public default void shuffle(){
        List<PlayCard> cards = getCards();
        Collections.shuffle(cards);
    }

    /**
     * Deals cards to players. It will move the dealing cards
     * to each player and {@link #getCards()} will return the
     * remaining cards in this deck.
     *
     * @param players Array of players
     */
    public default void deal(Player[] players) {
        List<PlayCard> cards = getCards();
        int numberCardEachPlayer = cards.size() / players.length;
        deal(players, numberCardEachPlayer, true);
    }

    public default void deal(Player[] players, int numCardEachPlayer, boolean removeDealingCard) {
        List<PlayCard> cards = getCards();
        // check required cards
        if (cards.isEmpty()) {
            throw new IllegalStateException("Oop! No card to play.");
        }

        int cardSize = cards.size();
        int playerSize = players.length;
        int totalCards = playerSize * numCardEachPlayer;

        if (totalCards > cardSize) {
            throw new IllegalArgumentException("Oop! we have only " + cardSize + " cards to play.");
        }

        // deal
        for (int i = 0; i < playerSize; i++) {
            // create cards for each player
            List<PlayCard> playCards = new ArrayList<>();

            for (int j = 0; j < numCardEachPlayer; j++) {
                PlayCard card = cards.get(i + playerSize * j);
                playCards.add(card);
            }

            // set cards to player
            players[i].setCards(playCards);
        }

        // remove all dealing cards
        if (removeDealingCard) {
            cards.subList(0, totalCards).clear();
        }
    }

}
