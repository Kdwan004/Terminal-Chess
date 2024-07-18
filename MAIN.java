public class MAIN {
    public static void main(String[] args) {
        // Clear terminal
        System.out.println("\033[H\033[2J");

        String[][] board = gameBoard.createBoard();
        peiceMove.movePeice(board, 1, 1, 2, 1);
        gameBoard.displayBoard(board);

        System.out.println("White Captured: "+gameFunction.CAPTURES_WHITE);
        System.out.println("Black Captured: "+gameFunction.CAPTURES_BLACK);
    }
}
