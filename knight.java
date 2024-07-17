public class knight {

    private static final String WHITE_KNIGHT = "|+/|";
    private static final String BLACK_KNIGHT = "|-/|";

    public static String[][] set(String[][] board) {
        // White Side
        board[8][7] = WHITE_KNIGHT;
        board[8][2] = WHITE_KNIGHT;

        // Black Side
        board[1][7] = BLACK_KNIGHT;
        board[1][2] = BLACK_KNIGHT;

        return board;
    }

}
