public class pawns {
    // If pawn first move
    public static int[][] firstWhiteMove = {{-2, 0}, {-1, 0}};
    public static int[][] firstBlackMove = {{ 2, 0}, { 1, 0}};

    // if pawn can attack 
    public static int[][] whiteAttackMoves = {{-1,-1}, {-1, 1}};
    public static int[][] blackAttackMoves = {{ 1,-1}, { 1, 1}};

    // if pawn move forward
    public static int[][] whiteStandardMove = {{-1, 0}, { 0, 0}};
    public static int[][] blackStandardMove = {{ 1, 0}, { 0, 0}};

}