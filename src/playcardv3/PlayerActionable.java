package playcardv3;

import java.util.Collections;
import java.util.List;

public interface PlayerActionable {
    // Constant
    public int NUMB_PLAYER_SIMPLE = 4;

    // instance methods
    public List<PlayCard> getCards();

    public String getName();

    // default methods
    public default void addCard(PlayCard card) {
        List<PlayCard> cards = getCards();
        if (cards != null) {
            cards.add(card);
        }
    }

    public default void sortCards() {
        List<PlayCard> cards = getCards();
        if (cards != null) {
            Collections.sort(cards);
        }
    }


}
