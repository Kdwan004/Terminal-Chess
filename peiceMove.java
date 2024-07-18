public class peiceMove {

    public static void king(String[][] board, int fromRow, int fromColumn, int toRow, int toColumn) {
        int[][] moves = {
            {-1,-1},{-1, 0},{-1, 1},
            {0, -1},        { 0, 1},
            {1, -1},{ 1, 0},{ 1, 1}
    };
    gameFunction.move(board, moves, fromRow, fromColumn, toRow, toColumn);
    }
}
