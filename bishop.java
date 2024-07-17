public class bishop {

    private static final String WHITE_BISHOP = "|+B|";
    private static final String BLACK_BISHOP = "|-B|";

    // Set Bishops
    public static String[][] set(String[][] board) {
        // White Side
        board[8][6] = WHITE_BISHOP;
        board[8][3] = WHITE_BISHOP;

        // Black Side
        board[1][6] = BLACK_BISHOP;
        board[1][3] = BLACK_BISHOP;

        return board;
    }

}
