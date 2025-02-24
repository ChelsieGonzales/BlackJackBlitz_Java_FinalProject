class User extends Player {
    private Scanner scanner;

    public User(Scanner scanner) {
        super();
        this.scanner = scanner;
    }

    public void play(Deck deck) {
        while (true) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.print("   Do you want to (H)it or (S)tand? ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("H")) {
                addCardToHand(deck.dealCard());
                System.out.println("--------------------------------------------------------------------------------------------------------------------");
                System.out.println("   Your hand: " + hand);
                if (hand.getValue() > 21) {
                    System.out.println("--------------------------------------------------------------------------------------------------------------------");
                    System.out.println("   You busted!");
                    break;
                }
            } else if (choice.equalsIgnoreCase("S")) {
                break;
            } else {
                System.out.println("   Invalid choice. Please choose again.");
            }
        }
    }
}
