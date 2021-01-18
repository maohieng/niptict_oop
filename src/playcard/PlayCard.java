package playcard;

public class PlayCard implements Comparable<PlayCard> {
    private final Rank rank;
    private final Suit suit;

    public PlayCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "PlayCard{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    @Override
    public int compareTo(PlayCard o) {
        int rankCompare = this.rank.compareTo(o.rank);
        if (rankCompare == 0) { // rank equal
            return this.suit.compareTo(o.suit);
        }

        return rankCompare;
    }
}
