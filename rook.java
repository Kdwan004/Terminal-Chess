public class rook {
    private static final String WHITE_ROOK = "|+R|";
    private static final String BLACK_ROOK = "|-R|";

    public static String[][] set(String[][] board) {
        // White Side
        board[8][8] = WHITE_ROOK;
        board[8][1] = WHITE_ROOK;

        // Black Side
        board[1][8] = BLACK_ROOK;
        board[1][1] = BLACK_ROOK;

        return board;
    }

}
