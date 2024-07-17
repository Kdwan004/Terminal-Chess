public class king {

    private static final String WHITE_KING = "|+K|";
    private static final String BLACK_KING = "|-K|";
    public static int[] WHITE_KING_POS = {8, 5};
    public static int[] BLACK_KING_POS = {1, 5};


    // Set Kings
    public static String[][] set(String[][] board) {
        board[WHITE_KING_POS[0]][WHITE_KING_POS[1]] = WHITE_KING;
        board[BLACK_KING_POS[0]][BLACK_KING_POS[1]] = BLACK_KING;
        return board;
    }

    public static void move(String[][] board, int fromRow, int fromColumn, int toRow, int toColumn) {
        
        // Declare all posisble moves that a king can do
        int[][] moves = { // 1, 5
            {-1,-1},{-1, 0},{-1, 1}, // 0, 4 / 0, 5 / 0, 6
            { 0,-1},        { 0, 1}, // 1, 4 / 1, 5 / 1, 6
            { 1,-1},{ 1, 0},{ 1, 1}, // 2, 4 / 2, 5 / 2, 6
        };

        boolean newPosWhite = gameBoard.boundWhite(board, moves, fromRow, fromColumn, toRow, toColumn);

        if(newPosWhite) {
            // Set new pos for white king
            WHITE_KING_POS[0] = toRow;
            WHITE_KING_POS[1] = toColumn;
        }
        
    }
}
