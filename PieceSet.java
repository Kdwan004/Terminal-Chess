public class PieceSet {

    // Initialse all game pieces
    public static String[][] PIECE = {{"|+K|","|+Q|","|+R|","|+B|","|+/|","|+P|"},
                                     {"|-K|","|-Q|","|-R|","|-B|","|-/|","|-P|"}};

    // Seperate white and balck pieces
    public static String[] WHITE_PIECE = PIECE[0];
    public static String[] BLACK_PIECE = PIECE[1];


    // Decalre position of white and black KINGS
    public static void king(String[][] board) {
        String white = WHITE_PIECE[0];
        String black = BLACK_PIECE[0];
        board[8][5] = white;
        board[1][5] = black;
    }

    // Decalre position of white and black QUEENS
    public static void queen(String[][] board) {
        String white = WHITE_PIECE[1];
        String black = BLACK_PIECE[1];
        board[8][4] = white;
        board[1][4] = black;   
    }

    // Decalre position of white and black ROOKS
    public static void rook(String[][] board) {
        String white = WHITE_PIECE[2];
        String black = BLACK_PIECE[2];
        board[8][8] = white;
        board[1][8] = black;   
        board[8][1] = white;
        board[1][1] = black;   
    }

    // Decalre position of white and black BISHOPS
    public static void bishop(String[][] board) {
        String white = WHITE_PIECE[3];
        String black = BLACK_PIECE[3];
        board[8][3] = white;
        board[1][3] = black;   
        board[8][6] = white;
        board[1][6] = black;   
    }

    // Decalre position of white and black KNIGHTS
    public static void knight(String[][] board) {
        String white = WHITE_PIECE[4];
        String black = BLACK_PIECE[4];
        board[8][2] = white;
        board[1][2] = black;   
        board[8][7] = white;
        board[1][7] = black;   
    }

    // Decalre position of white and black PAWNS
    public static void pawns(String[][] board) {
        String white = WHITE_PIECE[5];
        String black = BLACK_PIECE[5];
        for(int i = 1; i < board.length; i++) {
            board[7][i] = white;
            board[2][i] = black;
        }
    }





}