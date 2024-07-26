public class Pawns {

    // Set positions for where the pawn can move under all differnet conditions

    // If pawn first move
    public static int[][] firstWhiteMove = {{-2, 0}, {-1, 0}};
    public static int[][] firstBlackMove = {{ 2, 0}, { 1, 0}};

    // if pawn can attack 
    public static int[][] whiteAttackMoves = {{-1,-1}, {-1, 1}};
    public static int[][] blackAttackMoves = {{ 1,-1}, { 1, 1}};

    // if pawn move forward
    public static int[][] whiteStandardMove = {{-1, 0}, { 0, 0}};
    public static int[][] blackStandardMove = {{ 1, 0}, { 0, 0}};


    // Move pawn
    public static void move(String[][] board, int fromRow, int fromColumn, int toRow, int toColumn, String selectedPiece, String white_pawn, String black_pawn) {

        int[][] possibleMoves;

        // Get sign of square being attacked
        String toSign = board[toRow][toColumn].substring(1,2);

        // If pawns first moves
        if(selectedPiece == white_pawn && fromRow == 7) {
            possibleMoves = firstWhiteMove;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }
        else if(selectedPiece == black_pawn && fromRow == 2) {
            possibleMoves = firstBlackMove;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        // If pawn can attacks
        else if(selectedPiece == white_pawn && (toSign.equals("-"))) {
            possibleMoves = whiteAttackMoves;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        else if(selectedPiece == black_pawn && (toSign.equals("+"))) {
            possibleMoves = blackAttackMoves;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        // If pawn moves forward second move ++;
        else if(selectedPiece == white_pawn) {
            possibleMoves = whiteStandardMove;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }

        else if(selectedPiece == black_pawn) {
            possibleMoves = Pawns.blackAttackMoves;
            GameFunction.move(board, possibleMoves, fromRow, fromColumn, toRow, toColumn);
        }
    }

}