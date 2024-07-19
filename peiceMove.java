public class peiceMove {

    //    0     1     2     3     4     5
    // {"|K|","|Q|","|R|","|B|","|/|","|P|"}};

    static String[] WHITE = peicesSet.WHITE_PEICE;
    static String[] BLACK = peicesSet.BLACK_PEICE;



    public static int[][] king() {
        int[][] moves = {
            {-1,-1},{-1, 0},{-1, 1},
            {0, -1},        { 0, 1},
            {1, -1},{ 1, 0},{ 1, 1}
    };
        return moves;
    }


    public static int[][] queen(int n) {
        
            int[][] moves = {
                {-n,-n},{-n, 0},{-n, n},
                {0, -n},        { 0, n},
                {n, -n},{ n, 0},{ n, n}
            };

        return moves;

    }

    public static int[][] rook(int n) {
        
        int[][] moves = {
            { 0, 0},{-n, 0},{ 0, 0},
            { 0,-n},        { 0, n},
            { 0, 0},{ n, 0},{ 0, 0}
        };

    return moves;

    }

    public static int[][] bishop(int n) {
        
        int[][] moves = {
            {-n,-n},{0 , 0},{-n, n},
            {0,  0},        { 0, 0},
            {n, -n},{ 0, 0},{ n, n}
        };

    return moves;
    }

    public static int[][] knight() {
        int[][] moves = {
            {-2,-1},{ 0, 0},{-2, 1},
            { 0, 0},        { 0, 0},
            { 2,-1},{ 0, 0},{ 2, 1}
        };
        return moves;
    }

    // Function to determine peice then execute move peice function for selected peice. 

    public static void movePeice(String[][] board, int fromRow, int fromColumn, int toRow, int toColumn) {
        String selectedPeice = gameFunction.selectedPeice(board, fromRow, fromColumn);
        int[][] possibleMoves;

        // King moves
        if (selectedPeice == WHITE[0] || selectedPeice == BLACK[0]) {
            possibleMoves = king();
            gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        // Queen moves
        else if (selectedPeice == WHITE[1] || selectedPeice == BLACK[1]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = queen(n);
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }
        
        // Rook moves
        else if (selectedPeice == WHITE[2] || selectedPeice == BLACK[2]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = rook(n);
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }

        // Bishop moves
        else if (selectedPeice == WHITE[3] || selectedPeice == BLACK[3]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = bishop(n);
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }

        // Knight moves
        else if (selectedPeice == WHITE[4] || selectedPeice == BLACK[4]) {
                possibleMoves = knight();
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }
        
        // Pawn moves
        else if (selectedPeice == WHITE[5] || selectedPeice == BLACK[5]) {
            

            // Get sign of square being attacked
            String toSign = board[toRow][toColumn].substring(1,2);

            // If pawns first move
            if(selectedPeice == WHITE[5] && fromRow == 7) {
                possibleMoves = pawns.firstWhiteMove;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
            else if(selectedPeice == BLACK[5] && fromRow == 2) {
                possibleMoves = pawns.firstBlackMove;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }

            // If pawn can attack
            else if(selectedPeice == WHITE[5] && (toSign.equals("-"))) {
                possibleMoves = pawns.whiteAttackMoves;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }

            else if(selectedPeice == BLACK[5] && (toSign.equals("+"))) {
                possibleMoves = pawns.blackAttackMoves;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }

            // If pawn moves forward second move ++;
            else if(selectedPeice == WHITE[5]) {
                possibleMoves = pawns.whiteStandardMove;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }

            else if(selectedPeice == BLACK[5]) {
                possibleMoves = pawns.blackAttackMoves;
                gameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }





    }
}
}
