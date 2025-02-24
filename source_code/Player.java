abstract class Player {
    protected Hand hand;

    public Player() {
        hand = new Hand();
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public Hand getHand() {
        return hand;
    }

    public abstract void play(Deck deck);
}
