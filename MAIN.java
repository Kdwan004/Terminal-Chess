public class MAIN {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        String[][] board = gameBoard.createBoard();
        peiceMove.king(board, 8, 5, 7, 5);
        gameBoard.displayBoard(board);
        System.out.println(gameFunction.CAPTURES_WHITE);
    }
}
