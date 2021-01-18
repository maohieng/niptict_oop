package playcardv3;

import java.util.Collections;
import java.util.List;

public class Player implements PlayerActionable {
    private String name;
    private List<PlayCard> cards;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public List<PlayCard> getCards() {
        return cards;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setCards(List<PlayCard> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player{ " + name + " }";
    }
}
