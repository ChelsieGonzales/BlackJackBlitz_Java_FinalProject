class GameMenu {
    private Scanner scanner;

    public GameMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                         ░█▄█░█▀█░▀█▀░█▀█░░░█▄█░█▀▀░█▀█░█░█                                        |");
        System.out.println("|                                         ░█░█░█▀█░░█░░█░█░░░█░█░█▀▀░█░█░█░█                                        |");
        System.out.println("|                                         ░▀░▀░▀░▀░▀▀▀░▀░▀░░░▀░▀░▀▀▀░▀░▀░▀▀▀                                        |");
        System.out.println("|                                                     1. PLAY                                                       |");
        System.out.println("|                                                     2. HOW?                                                       |");
        System.out.println("|                                                     3. REPLAY GAME                                                |");
        System.out.println("|                                                     4. QUIT GAME                                                  |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }

    public int getChoice() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.print("   Please enter your choice: ");
        return scanner.nextInt();
    }
}
