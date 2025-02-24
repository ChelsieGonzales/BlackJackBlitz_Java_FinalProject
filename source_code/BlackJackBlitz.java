public class BlackjackBlitz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("                                   ░█░█░█▀▀░█░░░█▀▀░█▀█░█▄█░█▀▀░░░▀█▀░█▀█                                           ");
        System.out.println("                                   ░█▄█░█▀▀░█░░░█░░░█░█░█░█░█▀▀░░░░█░░█░█                                           ");                    
        System.out.println("                                   ░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░░░░▀░░▀▀▀                                           ");              
    
        System.out.println("██████╗ ██╗      █████╗  ██████╗██╗  ██╗     ██╗ █████╗  ██████╗██╗  ██╗   ██████╗ ██╗     ██╗████████╗███████╗");
        System.out.println("██╔══██╗██║     ██╔══██╗██╔════╝██║ ██╔╝     ██║██╔══██╗██╔════╝██║ ██╔╝   ██╔══██╗██║     ██║╚══██╔══╝╚══███╔╝");
        System.out.println("██████╔╝██║     ███████║██║     █████╔╝      ██║███████║██║     █████╔╝    ██████╔╝██║     ██║   ██║     ███╔╝");
        System.out.println("██╔══██╗██║     ██╔══██║██║     ██╔═██╗ ██   ██║██╔══██║██║     ██╔═██╗    ██╔══██╗██║     ██║   ██║    ███╔╝");
        System.out.println("██████╔╝███████╗██║  ██║╚██████╗██║  ██╗╚█████╔╝██║  ██║╚██████╗██║  ██╗   ██████╔╝███████╗██║   ██║   ███████╗");
        System.out.println("╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝   ╚═════╝ ╚══════╝╚═╝   ╚═╝   ╚══════╝");
                                                          
        int[] playerBalances = {1000, 0};
        GameMenu menu = new GameMenu(scanner);
        BlackjackGame game = new BlackjackGame(scanner, playerBalances);
        
        while(true) {
            menu.displayMenu();
            int choice = menu.getChoice();
            switch(choice) {
                case 1:
                    game.placeBet();
                    game.play();
                    game.displayRemainingBalance();
                    break;
                case 2:
                    gameInstructions();
                    break;
                case 3:
                    replayGame(scanner, playerBalances);
                    break;
                case 4:
                    System.out.println("░█▀▀░█░█░▀█▀░▀█▀░▀█▀░█▀█░█▀▀░░░▀█▀░█░█░█▀▀░░░█▀▀░█▀█░█▄█░█▀▀░░░░░░█▀▀░█▀█░█▀█░█▀▄░█▀▄░█░█░█▀▀░█");
                    System.out.println("░█▀▀░▄▀▄░░█░░░█░░░█░░█░█░█░█░░░░█░░█▀█░█▀▀░░░█░█░█▀█░█░█░█▀▀░░░░░░█░█░█░█░█░█░█░█░█▀▄░░█░░█▀▀░▀");
                    System.out.println("░▀▀▀░▀░▀░▀▀▀░░▀░░▀▀▀░▀░▀░▀▀▀░░░░▀░░▀░▀░▀▀▀░░░▀▀▀░▀░▀░▀░▀░▀▀▀░▀░░░░▀▀▀░▀▀▀░▀▀▀░▀▀░░▀▀░░░▀░░▀▀▀░▀");
                    return;
                default:
                System.out.println("   Invalid choice please choose again.");
            }
        }
    }
            
    public static void gameInstructions() {
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    System.out.println("|                                                 ░█░█░█▀█░█░█                                                     |");
    System.out.println("|                                                 ░█▀█░█░█░█▄█                                                     |");
    System.out.println("|                                                 ░▀░▀░▀▀▀░▀░▀                                                     |");
    System.out.println("| 1. This is a standard game of Blackjack played with a standard deck of 52 cards.                                 |");
    System.out.println("| 2. Each player starts with 2 cards, and the dealer reveals one of their cards.                                   |");
    System.out.println("| 3. Players decide whether to HIT (take another card) or STAND (end their turn).                                  |");
    System.out.println("| 4. Numbered cards are worth their face value, and face cards (KING, QUEEN, JACK) are worth 10 points.            |");
    System.out.println("| 5. Aces can be worth either 1 or 11 points, depending on the player's choice.                                    |");
    System.out.println("| 6. The player wins if their hand's total is closer to 21 than the dealer's without exceeding 21.                 |");
    System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }


    public static void replayGame(Scanner scanner, int[] playerBalances) {
    System.out.println("░█▀▀░▀█▀░█▀█░█▀▄░▀█▀░▀█▀░█▀█░█▀▀░░░█▀█░█▀▀░█░█░░░█▀▄░█▀█░█░█░█▀█░█▀▄░░░░░░░░░\r\n" + //
                       "░▀▀█░░█░░█▀█░█▀▄░░█░░░█░░█░█░█░█░░░█░█░█▀▀░█▄█░░░█▀▄░█░█░█░█░█░█░█░█░░░░░░░░░\r\n" + //
                       "░▀▀▀░░▀░░▀░▀░▀░▀░░▀░░▀▀▀░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀░▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀░░▀░░▀░░▀░");
    BlackjackGame game = new BlackjackGame(scanner, playerBalances);
    game.placeBet();
    game.play();
    game.displayRemainingBalance();
    }
}
