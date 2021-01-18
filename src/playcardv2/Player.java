package playcardv2;

import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private List<PlayCard> cards;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<PlayCard> getCards() {
        return cards;
    }

    public void setCards(List<PlayCard> cards) {
        this.cards = cards;
    }

    public void addCard(PlayCard card) {
        if (cards != null) {
            cards.add(card);
        }
    }

    public void sortCards() {
        if (cards != null) {
            Collections.sort(cards);
        }
    }
}
