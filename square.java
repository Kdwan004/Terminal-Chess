
public class square {
    
    public static final int BOARD_SIZE = 9;
    public static final String EMPTY_SQUARE = "|<>|";
    public static final String EMPTY_SQUARE2 = "|><|";
    public static final String WHITE_PAWN = "|+P|";
    public static final String BLACK_PAWN = "|-P|";
    public static final String WHITE_KING = "|+K|";
    public static final String BLACK_KING = "|-K|";
    public static final String WHITE_QUEEN = "|+Q|";
    public static final String BLACK_QUEEN = "|-Q|";
    public static final String WHITE_ROOK = "|+R|";
    public static final String BLACK_ROOK = "|-R|";
    public static final String WHITE_BISHOP = "|+B|";
    public static final String BLACK_BISHOP = "|-B|";
    public static final String WHITE_KNIGHT = "|+H|";
    public static final String BLACK_KNIGHT = "|-H|";

    
    public static void setupPawns(String[][] board) {
        for (int column = 1; column < BOARD_SIZE; column++) {
            board[2][column] = BLACK_PAWN;
            board[7][column] = WHITE_PAWN;
        }
    }

    public static void setupKings(String[][] board) {
        board[1][5] = BLACK_KING;
        board[8][5] = WHITE_KING;
    }

    public static void setupQueens(String[][] board) {
        board[1][4] = BLACK_QUEEN;
        board[8][4] = WHITE_QUEEN;
    }

    public static void setupBishops(String[][] board) {
        board[1][6] = BLACK_BISHOP;
        board[1][3] = BLACK_BISHOP;
        board[8][6] = WHITE_BISHOP;
        board[8][3] = WHITE_BISHOP;
    }

    public static void setupKnights(String[][] board) {
        board[1][7] = BLACK_KNIGHT;
        board[1][2] = BLACK_KNIGHT;
        board[8][7] = WHITE_KNIGHT;
        board[8][2] = WHITE_KNIGHT;
    }

    public static void setupRooks(String[][] board) {
        board[1][8] = BLACK_ROOK;
        board[1][1] = BLACK_ROOK;
        board[8][8] = WHITE_ROOK;
        board[8][1] = WHITE_ROOK;
    }

    public static void setupPieces(String[][] board) {
        setupPawns(board);
        setupKings(board);
        setupQueens(board);
        setupBishops(board);
        setupKnights(board);
        setupRooks(board);
    }
}
