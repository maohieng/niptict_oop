package playcard;

import java.util.List;

public class Player {

    private final String name;
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

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
