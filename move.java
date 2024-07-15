public class move {
    public static boolean pawn(String[][] board, int row, int column, int step) {
        if(step == 1 || step == 2)
            // Move White Pawn forward 
            if (board[row][column] == square.WHITE_PAWN) {
                if(board[row-step][column] == square.EMPTY_SQUARE){
                    board[row][column] = square.EMPTY_SQUARE;
                    board[row-step][column] = square.WHITE_PAWN;
                }
                if(board[row-step][column] == square.EMPTY_SQUARE2) {
                    board[row][column] = square.EMPTY_SQUARE2;
                    board[row-1][column] = square.WHITE_PAWN;
                }
                return true;
            }

            // Move Black Pawn forward 
            else if (board[row][column] == square.BLACK_PAWN){
                if(board[row+step][column] == square.EMPTY_SQUARE){
                    board[row][column] = square.EMPTY_SQUARE;
                    board[row+step][column] = square.BLACK_PAWN;
                }
                if(board[row+step][column] == square.EMPTY_SQUARE2){
                    board[row][column] = square.EMPTY_SQUARE2;
                    board[row+step][column] = square.BLACK_PAWN;
                }
                return true;
            }
        return false;
    
    }

    public static boolean king(String[][] board, int fRow, int fColumn, int sRow, int sColumn) {
        // Possible King Moves
        int[][] kingMoves = {
            {-1,-1},{-1, 0},{-1, 1},
            { 0,-1},        { 0, 1},
            {1, -1},{ 1, 0},{ 1, 1}
        };

        for (int[] move : kingMoves) {
            int newRow = fRow + move[0];
            int newColumn = fColumn + move[1];
    
            // Check if the new position is within bounds
            if (newRow >= 1 && newRow < 9 && newColumn >= 1 && newColumn < 9) {
                // Check if the destination is empty
                // Check if destinatino is oponents peice substring(1, 2) --> starts at 1, ends before 2. Returns peice sign
                if (board[newRow][newColumn].equals(square.EMPTY_SQUARE) || !board[newRow][newColumn].substring(1, 2).equals(board[fRow][fColumn].substring(1, 2))) {
                    if (newRow == sRow && newColumn == sColumn) {
                        // Move the king
                        board[sRow][sColumn] = board[fRow][fColumn];
                        board[fRow][fColumn] = square.EMPTY_SQUARE;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean queen(String[][] board, int fRow, int fColumn, int sRow, int sColumn) {

    for(int n = 0; n < 8; n++) {
        int[][] queenMoves = {

            {-n,-n},{ 0,-n},{-n, n},
            { 0,-n},        { 0, n},
            { n,-n},{ 0, n},{ n, n}

    };
    

        for (int[] move : queenMoves) {
            int newRow = fRow + move[0];
            int newColumn = fColumn + move[1];
    
            // Check if the new position is within bounds
            if (newRow >= 1 && newRow < 9 && newColumn >= 1 && newColumn < 9) {
                // Check if the destination is empty
                // Check if destinatino is oponents peice substring(1, 2) --> starts at 1, ends before 2. Returns peice sign
                if (board[newRow][newColumn].equals(square.EMPTY_SQUARE) || !board[newRow][newColumn].substring(1, 2).equals(board[fRow][fColumn].substring(1, 2))) {
                    if (newRow == sRow && newColumn == sColumn) {
                        // Move the king
                        board[sRow][sColumn] = board[fRow][fColumn];
                        board[fRow][fColumn] = square.EMPTY_SQUARE;
                        return true;
                    }
                }
            }
        }
    }
    return false;
    } 
}
