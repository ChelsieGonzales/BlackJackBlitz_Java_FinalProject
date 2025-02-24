class Dealer extends Player {
    public void play(Deck deck) {
        while (hand.getValue() < 17) {
            addCardToHand(deck.dealCard());
        }
    }

    public void displayFirstCard() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("   Dealer's first card: " + this.getFirstCard());
    }

    public Card getFirstCard() {
        return hand.getCards().get(0);
    }
}
