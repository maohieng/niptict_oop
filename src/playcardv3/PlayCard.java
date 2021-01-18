package playcardv3;

import java.io.Serializable;
import java.util.Objects;

public class PlayCard implements Comparable<PlayCard>, Serializable {
    private Rank rank;
    private Suit suit;

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

    // return 0 mean equal, 1 greater, -1 less than
    @Override
    public int compareTo(PlayCard o) {
        int compareRank = this.rank.compareTo(o.rank);
        if (compareRank == 0) {
            return this.suit.compareTo(o.suit);
        }

        return compareRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayCard playCard = (PlayCard) o;
        return rank == playCard.rank && suit == playCard.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
