# 🃏 Blackjack Blitz - Java Version OOP Project

## 🎯 Project Overview
Blackjack Blitz is a simple command-line Blackjack game built using **Java** and following **Object-Oriented Programming (OOP) principles**. The game allows a user to play against a dealer, with functionalities like shuffling a deck, dealing cards, placing bets, and determining the winner.

## 📌 How OOP is Used
This project utilizes the four fundamental principles of **OOP**:

### 1️⃣ Encapsulation 🏗️
- **Private attributes** in classes like `Card`, `Deck`, `Hand`, and `Player` ensure data protection.
- **Getter and setter methods** allow controlled access to data.

### 2️⃣ Abstraction 🎭
- The **Player** class is an abstract class that defines the common functionality for `User` and `Dealer`, but the implementation is left to the subclasses.
- The `play()` method is abstract in `Player`, meaning each subclass must define how they play their turn.

### 3️⃣ Inheritance 👪
- `User` and `Dealer` **inherit** from the `Player` class.
- This reduces code duplication by sharing common methods like `addCardToHand()`.

### 4️⃣ Polymorphism 🔄
- The `play()` method in `Player` is **overridden** in both `User` and `Dealer`.
- This allows different implementations of `play()`, where:
  - `User` prompts the player for input.
  - `Dealer` follows fixed rules to decide their moves.

## 🏗️ Project Structure
```
📂 BlackjackBlitz
├── 📄 BlackjackBlitz.java    # Main game loop
├── 📄 BlackjackGame.java     # Handles game logic
├── 📄 Player.java            # Abstract class for User & Dealer
├── 📄 User.java              # Handles player actions
├── 📄 Dealer.java            # Handles dealer actions
├── 📄 Deck.java              # Represents a deck of cards
├── 📄 Card.java              # Represents a single playing card
├── 📄 Suit.java              # Enum for card suits
├── 📄 Rank.java              # Enum for card ranks
├── 📄 Hand.java              # Represents a hand of cards
└── 📄 README.md              # Project documentation
```

## 🎮 How to Play
1. **Run the `BlackjackBlitz.java` file**.
2. **Place your bet** 💰 (starting balance: 1000 coins).
3. **Play against the dealer** 🏆:
   - Choose `(H)it` to take another card.
   - Choose `(S)tand` to keep your current hand.
4. **Win, Lose, or Tie!** 🃏

## 🚀 Future Improvements
- Add a GUI 🎨
- Implement multiplayer mode 👥
- Enhance AI for a smarter dealer 🤖

## 📜 License
This project is open-source and free to use.

Enjoy playing **Blackjack Blitz**! 🃏🎉

