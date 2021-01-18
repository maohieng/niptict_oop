package playcardv3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCard implements DeckOfCardActionable {

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

    @Override
    public List<PlayCard> getCards() {
        return cards;
    }
}
