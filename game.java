public class game {

    private static final int BOARD_SIZE = 9;
    private static final String EMPTY_CORNER = "   ";
    private static final String EMPTY_SQUARE = "|<>|";
    private static final String WHITE_PAWN = "|+P|";
    private static final String BLACK_PAWN = "|-P|";
    private static final String WHITE_KING = "|+K|";
    private static final String BLACK_KING = "|-K|";
    private static final String WHITE_QUEEN = "|+Q|";
    private static final String BLACK_QUEEN = "|-Q|";
    private static final String WHITE_ROOK = "|+R|";
    private static final String BLACK_ROOK = "|-R|";
    private static final String WHITE_BISHOP = "|+B|";
    private static final String BLACK_BISHOP = "|-B|";
    private static final String WHITE_KNIGHT = "|+H|";
    private static final String BLACK_KNIGHT = "|-H|";

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
                // Print empty squares
                else {
                    board[row][column] = EMPTY_SQUARE;
                }
            }
        }
        return board;
    }

    public static void setupPieces(String[][] board) {
        // Set pawns
        for (int column = 1; column < BOARD_SIZE; column++) {
            board[2][column] = BLACK_PAWN;
            board[7][column] = WHITE_PAWN;
        }
        // Set Kings
        board[1][5] = BLACK_KING;
        board[8][5] = WHITE_KING;
        // Set Queens
        board[1][4] = BLACK_QUEEN;
        board[8][4] = WHITE_QUEEN;
        // Set Bishops
        board[1][6] = BLACK_BISHOP;
        board[1][3] = BLACK_BISHOP;
        board[8][6] = WHITE_BISHOP;
        board[8][3] = WHITE_BISHOP;
        // Set Knights
        board[1][7] = BLACK_KNIGHT;
        board[1][2] = BLACK_KNIGHT;
        board[8][7] = WHITE_KNIGHT;
        board[8][2] = WHITE_KNIGHT;
        // Set Rooks
        board[1][8] = BLACK_ROOK;
        board[1][1] = BLACK_ROOK;
        board[8][8] = WHITE_ROOK;
        board[8][1] = WHITE_ROOK;

        
    }

    public static String[][] generateBoard() {
        String[][] board = initializeBoard();
        setupPieces(board);
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
        displayBoard(board);
    }
}
