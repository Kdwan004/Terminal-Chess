public class game {

    public static final int BOARD_SIZE = 9;
    public static final String EMPTY_CORNER = "    ";
    public static final String EMPTY_SQUARE = "|<>|";
    public static final String EMPTY_SQUARE2 = "|><|";

    public static String[][] initializeBoard() {
        // Initialize board dimensions
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

        // Board Generation
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                // Make the top-left corner empty

                if (row == 0 && column == 0) {
                    board[row][column] = EMPTY_CORNER;
                }
                // Set the first row and column to labels
                else if (row == 0) {
                    board[row][column] = " x" + column + " ";
                } else if (column == 0) {
                    board[row][column] = " y" + row + " ";
                }
                else if ((row % 2 == 0 && column % 2 == 0) || (row % 2 != 0 && column % 2 != 0)) {
                    board[row][column] = EMPTY_SQUARE2;
                }

                // Print empty squares
                else {
                    board[row][column] = EMPTY_SQUARE;
                }
            }
        }
        return board;
    }

    public static String[][] generateBoard() {
        String[][] board = initializeBoard();
        square.setupPieces(board);
        return board;
    }

    public static void displayBoard(String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); 

        String[][] board = generateBoard();
        //displayBoard(board);

        //move.pawn(board, 7, 5, 2);
        // move.pawn(board, 7, 4, 2);
        displayBoard(board);

        // move.king(board, 8, 5, 7, 5);
        // move.queen(board, 8, 4, 7, 4);
        displayBoard(board);
    }
}
