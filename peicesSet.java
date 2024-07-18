public class peicesSet {

    public static String[][] PEICE = {{"|+K|","|+Q|","|+R|","|+B|","|+/|","|+P|"},
                                     {"|-K|","|-Q|","|-R|","|-B|","|-/|","|-P|"}};
    public static String[] WHITE_PEICE = PEICE[0];
    public static String[] BLACK_PEICE = PEICE[1];


    public static void king(String[][] board) {
        String white = WHITE_PEICE[0];
        String black = BLACK_PEICE[0];
        board[8][5] = white;
        board[1][5] = black;
    }

    public static void queen(String[][] board) {
        String white = WHITE_PEICE[1];
        String black = BLACK_PEICE[1];
        board[8][4] = white;
        board[1][4] = black;   
    }

    public static void rook(String[][] board) {
        String white = WHITE_PEICE[2];
        String black = BLACK_PEICE[2];
        board[8][8] = white;
        board[1][8] = black;   
        board[8][1] = white;
        board[1][1] = black;   
    }

    public static void bishop(String[][] board) {
        String white = WHITE_PEICE[3];
        String black = BLACK_PEICE[3];
        board[8][3] = white;
        board[1][3] = black;   
        board[8][6] = white;
        board[1][6] = black;   
    }

    public static void knight(String[][] board) {
        String white = WHITE_PEICE[4];
        String black = BLACK_PEICE[4];
        board[8][2] = white;
        board[1][2] = black;   
        board[8][7] = white;
        board[1][7] = black;   
    }

    public static void pawns(String[][] board) {
        String white = WHITE_PEICE[5];
        String black = BLACK_PEICE[5];
        for(int i = 1; i < board.length; i++) {
            board[2][i] = white;
            board[7][i] = black;
        }
    }





}