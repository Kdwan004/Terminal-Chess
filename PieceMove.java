public class PieceMove {

    //    0     1     2     3     4     5
    // {"|K|","|Q|","|R|","|B|","|/|","|P|"}};

    static String[] WHITE = PieceSet.WHITE_PIECE;
    static String[] BLACK = PieceSet.BLACK_PIECE;



    public static int[][] king() {
        // Initialise all possible moves that can be made by the King

        int[][] moves = {
            {-1,-1},{-1, 0},{-1, 1},
            {0, -1},        { 0, 1},
            {1, -1},{ 1, 0},{ 1, 1}
    };
        return moves;
    }


    public static int[][] queen(int n) {
        
        // Initialise all possible moves that can be made by the Queen

            int[][] moves = {
                {-n,-n},{-n, 0},{-n, n},
                {0, -n},        { 0, n},
                {n, -n},{ n, 0},{ n, n}
            };

        return moves;

    }

    public static int[][] rook(int n) {
        
        // Initialise all possible moves that can be made by the Rook

        int[][] moves = {
            { 0, 0},{-n, 0},{ 0, 0},
            { 0,-n},        { 0, n},
            { 0, 0},{ n, 0},{ 0, 0}
        };

    return moves;

    }

    public static int[][] bishop(int n) {
        
        // Initialise all possible moves that can be made by the Bishop
        
        int[][] moves = {
            {-n,-n},{0 , 0},{-n, n},
            {0,  0},        { 0, 0},
            {n, -n},{ 0, 0},{ n, n}
        };

    return moves;
    }

    public static int[][] knight() {

        // Initialise all possible moves that can be made by the Knight

        int[][] moves = {
            {-2,-1},{ 0, 0},{-2, 1},
            { 0, 0},        { 0, 0},
            { 2,-1},{ 0, 0},{ 2, 1}
        };
        return moves;
    }

    // Function to determine piece then execute move Piece function for selected Piece. 

    public static void movePiece(String[][] board, int fromRow, int fromColumn, int toRow, int toColumn) {
        String selectedPiece = GameFunction.selectedPiece(board, fromRow, fromColumn);
        int[][] possibleMoves;

        // King moves
        if (selectedPiece == WHITE[0] || selectedPiece == BLACK[0]) {
            possibleMoves = king();
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        // Queen moves
        else if (selectedPiece == WHITE[1] || selectedPiece == BLACK[1]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = queen(n);
                GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }
        
        // Rook moves
        else if (selectedPiece == WHITE[2] || selectedPiece == BLACK[2]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = rook(n);
                GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }

        // Bishop moves
        else if (selectedPiece == WHITE[3] || selectedPiece == BLACK[3]) {
            for(int n = 1; n < 8; n++) {
                possibleMoves = bishop(n);
                GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
            }
        }

        // Knight moves
        else if (selectedPiece == WHITE[4] || selectedPiece == BLACK[4]) {
                possibleMoves = knight();
                GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }
        
        // Pawn moves
        else if (selectedPiece == WHITE[5] || selectedPiece == BLACK[5]) {
            Pawns.move(board, fromRow, fromColumn, toRow, toColumn, selectedPiece, WHITE[5], BLACK[5]);
    }
}
}
