class BlackjackGame {
    private Scanner scanner;
    private int[] playerBalances;
    private int currentBet;
    private Deck deck;
    private Dealer dealer;
    private User user;

    public BlackjackGame(Scanner scanner, int[] playerBalances) {
        this.scanner = scanner;
        this.playerBalances = playerBalances;
        this.deck = new Deck();
        this.dealer = new Dealer();
        this.user = new User(scanner);
    }

    public void play() {
    deck.shuffle();
    dealer.addCardToHand(deck.dealCard());
    dealer.addCardToHand(deck.dealCard());
    user.addCardToHand(deck.dealCard());
    user.addCardToHand(deck.dealCard());

    dealer.displayFirstCard();
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("   Your hand: " + user.getHand());

    user.play(deck);

    if (user.getHand().getValue() <= 21) {
        dealer.play(deck);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("   Dealer's hand: " + dealer.getHand());
        int userValue = user.getHand().getValue();
        int dealerValue = dealer.getHand().getValue();
        if (dealerValue > 21 || userValue > dealerValue) {
            
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.println("░█▀▀░█▀█░█▀█░█▀▀░█▀▄░█▀█░▀█▀░█░█░█░░░█▀█░▀█▀░▀█▀░█▀█░█▀█░█▀▀░█░░░█░█░█▀█░█░█░░░█░█░▀█▀░█▀█░█");
            System.out.println("░█░░░█░█░█░█░█░█░█▀▄░█▀█░░█░░█░█░█░░░█▀█░░█░░░█░░█░█░█░█░▀▀█░▀░░░░█░░█░█░█░█░░░█▄█░░█░░█░█░▀");
            System.out.println("░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░░▀░░▀▀▀░▀▀▀░▀░▀░░▀░░▀▀▀░▀▀▀░▀░▀░▀▀▀░▀░░░░▀░░▀▀▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░▀");
            
            playerBalances[0] += 2 * currentBet;
        } else if (userValue < dealerValue) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.println("   ░█▀▄░█▀▀░█▀█░█░░░█▀▀░█▀▄░░░█░█░▀█▀░█▀█░█▀▀░█");
            System.out.println("   ░█░█░█▀▀░█▀█░█░░░█▀▀░█▀▄░░░█▄█░░█░░█░█░▀▀█░▀");
            System.out.println("   ░▀▀░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀");
            
        } else {
            System.out.println("--------------------------------------------------------------------------------------------------------------------");
            System.out.println("   ░▀█▀░▀█▀░▀░█▀▀░░░█▀█░░░▀█▀░▀█▀░█▀▀░█");
            System.out.println("   ░░█░░░█░░░░▀▀█░░░█▀█░░░░█░░░█░░█▀▀░▀");
            System.out.println("   ░▀▀▀░░▀░░░░▀▀▀░░░▀░▀░░░░▀░░▀▀▀░▀▀▀░▀");
            playerBalances[0] += currentBet;
        }
        
    } else {
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("   Dealer wins!");
    }
    
    System.out.println("   Remaining balance: " + playerBalances[0]);

    // removing the cards on the next round
    user.getHand().reset(); 
    dealer.getHand().reset();
}


    public void placeBet() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.print("   Place your bet (current balance: " + playerBalances[0] + "): ");
    
    
    int bet;
    do {
        while (!scanner.hasNextInt()) {
            System.out.println("   Invalid input. Please enter a valid integer.");
            scanner.next();
        }
        bet = scanner.nextInt();
        if (bet > playerBalances[0]) {
            System.out.println("   You cannot bet more than your current balance.");
            System.out.print("   Place your bet (current balance: " + playerBalances[0] + "): ");
        }
    } while (bet > playerBalances[0]);
    
    currentBet = bet;
    playerBalances[0] -= bet;
    
    System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
    
    System.out.print("   Do you want to change your bet? (Y/N): ");
    String choice = scanner.next();
    
    if (choice.equalsIgnoreCase("Y")) {
        System.out.print("   Enter your new bet (current bet: " + currentBet + ", current balance: " + playerBalances[0] + "): ");
        int newBet;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("   Invalid input. Please enter a valid integer.");
                scanner.next();
            }
            newBet = scanner.nextInt();
            if (newBet > playerBalances[0]) {
                System.out.println("   You cannot bet more than your current balance.");
                System.out.print("   Enter your new bet (current bet: " + currentBet + ", current balance: " + playerBalances[0] + "): ");
            }
        } while (newBet > playerBalances[0]);
        
        playerBalances[0] += currentBet;
        currentBet = newBet;
        playerBalances[0] -= newBet;
    }
}
