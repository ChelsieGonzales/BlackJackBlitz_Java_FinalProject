import java.util.ArrayList;

class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getValue() {
        int value = 0;
        int numAces = 0;
        for (Card card : cards) {
            Rank rank = card.getRank();
            if (rank == Rank.ACE) {
                numAces++;
            } else {
                value += rank.getRankValue();
            }
        }
        for (int i = 0; i < numAces; i++) {
            if (value + 11 <= 21) {
                value += 11;
            } else {
                value += 1;
            }
        }
        return value;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Card card : cards) {
            builder.append(card).append(", ");
        }
        return builder.toString();
    }

    public void reset() {
        cards.clear();
    }
}
