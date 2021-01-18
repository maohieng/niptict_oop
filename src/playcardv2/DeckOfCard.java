package playcardv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCard {

    private List<PlayCard> cards;

    public DeckOfCard() {
        // Initialize 52 playing cards
        cards = new ArrayList<>();
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for (Rank rank : ranks) {
            for (Suit suit : suits) {
                cards.add(new PlayCard(rank, suit));
            }
        }
    }

    public List<PlayCard> getCards() {
        return cards;
    }

    public void sort(){
        Collections.sort(cards);
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void deal(Player[] players){
        int playerLength = players.length;
        int numberCardEachPlayer = cards.size() / playerLength;

        for (int i = 0; i < playerLength; i++) {
            List<PlayCard> playerCards = new ArrayList<>();

            for (int j = 0; j < numberCardEachPlayer; j++) {
                playerCards.add(cards.get(i + playerLength * j));
            }

            players[i].setCards(playerCards);
        }
    }
}
