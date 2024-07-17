public class queen {

    // Constructor Method
    private static final String WHITE_QUEEN = "|+Q|";
    private static final String BLACK_QUEEN = "|-Q|";
    
    // Set Queen Positions
    public static String[][] set(String[][] board) {
        board[8][4] = WHITE_QUEEN;
        board[1][4] = BLACK_QUEEN;

        return board;
    }

}
