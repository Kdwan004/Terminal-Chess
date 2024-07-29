# Terminal Chess Game

This is a simple terminal-based chess game implemented in Java. The game allows two players to take turns moving pieces on a chessboard, with each player entering the coordinates for their moves through the terminal.

## Features

- Simple text-based interface
- Two-player mode
- Displays captured pieces for both players
- Clear and easy-to-read game board

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Play

1. Clone this repository to your local machine.
2. Compile the Java files using the following command:

    ```sh
    javac Main.java
    ```

3. Run the game using the following command:

    ```sh
    java Main
    ```

4. The game will start and display the initial chessboard. Players take turns entering their moves.
5. For each move, the current player will be prompted to enter the coordinates of the piece they want to move and the position they want to move it to. The format for input is `y x` for both the piece selection and the destination position.
6. The game will update the board and display the current state after each move.

## Code Structure

- `Main.java`: The main class that initializes the game and handles the game loop.
- `GameBoard.java`: Contains methods for creating and displaying the game board.
- `GameFunction.java`: Manages the game state, including captured pieces.
- `PieceMove.java`: Handles the logic for moving pieces on the board.
- `PieceSet.java`: Initialises peice positions on board.
- `Pawns.java`: Game functions for pawn peice.

## TODO

- Seperate players and add player rules
- Add check and checkmate



