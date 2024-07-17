public class pawn {
    private static final String WHITE_PAWN = "|+P|";
    private static final String BLACK_PAWN = "|-P|";

    // Set Pawn Positions
    public static String[][] set(String[][] board) {
        for(int row = 1; row < board.length; row++) {
            for(int column = 1; column < board[row].length; column++) {
                board[2][column] = BLACK_PAWN;
                board[7][column] = WHITE_PAWN;
            }

        }
        return board;
    }
    
}
