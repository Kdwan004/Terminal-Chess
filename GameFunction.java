import java.util.ArrayList;

public class GameFunction {

    public static ArrayList<String> CAPTURES_WHITE = new ArrayList<String>();
    public static ArrayList<String> CAPTURES_BLACK = new ArrayList<String>();
    static String empty1 = GameBoard.EMPTY_SQUARE[1];
    static String empty2 = GameBoard.EMPTY_SQUARE[2];


    public static String selectedPiece(String[][] board, int fromRow, int fromColumn) {

        // Determine selected piece
        
        String from = board[fromRow][fromColumn];

        for(String[] set:PieceSet.PIECE) {
            for(String pieces:set) {
                if(pieces == from) {
                    return pieces;
                }
            }
        }
        return null;

    }
    
    public static void move(String[][] board, int[][] moves, int fromRow, int fromColumn, int toRow, int toColumn) {
        /*
        
        List of rules required for piece movements

        Check if toBoard is possible
            1. If it is in the list of possible moves i.e. newRow/newColumn
            2. If it is empty
            3. If it doesn't conflic with the border
            4. If piece infront is opposite sign
                - If piece infront is opposite sign, then check what the piece is
                - replace selected piece with piece infront, 
                - add piece to specified captured list
                    - If captured piece sign is white, then add to CAPTURED_BLACK ~ vice versa
         */

        // Checking sign of piece infront
        // String to = board[toRow][toColumn];
        // String from = board[fromRow][fromColumn];

        // Check sign of piece to and from
        String fromSign = board[fromRow][fromColumn].substring(1,2);
        String toSign = board[toRow][toColumn].substring(1,2);

        // Check sign of piece being captured
        String captured = board[toRow][toColumn].substring(1,3);
        
                for(int[] move: moves) {
                    // Create new row & column variable for all potential that piece can move too
                    int newRow = fromRow + move[0]; 
                    int newColumn = fromColumn + move[1];
                    
                    // Checked if the moves are possible possible
                    if((newRow == toRow && newColumn == toColumn) && (toRow!=0 && toColumn!=0)) { 

                        // Check if square to go too is empty
                        if(board[toRow][toColumn] == empty1 || board[toRow][toColumn] == empty2) { 

                            // Set square going too, to square coming form
                            board[toRow][toColumn] = board[fromRow][fromColumn]; 

                            // replace square going form with correct empty square  
                            board[fromRow][fromColumn] =  (fromRow%2!=0||fromColumn%2!=0) && 
                                    (fromRow%2==0||fromColumn%2==0)       
                                    ?empty1:empty2; 
                            return;
                        }

                        else if((fromSign.equals("+")) && (toSign.equals("-"))) { // Check if the sign of the square to go too is -
                            CAPTURES_WHITE.add(captured);
                            board[toRow][toColumn] = board[fromRow][fromColumn];
                            board[fromRow][fromColumn] =  (fromRow%2!=0||fromColumn%2!=0) && 
                                    (fromRow%2==0||fromColumn%2==0) // replace square going form with correct empty square        
                                    ?empty1:empty2; 
                            return;
                        
                        }
                    
                        else if((fromSign.equals("-")) && (toSign.equals("+"))) { // Check if the sign of the square to go too is -
                            CAPTURES_BLACK.add(captured);
                            board[toRow][toColumn] = board[fromRow][fromColumn];
                            board[fromRow][fromColumn] =  (fromRow%2!=0||fromColumn%2!=0) && 
                                    (fromRow%2==0||fromColumn%2==0) // replace square going form with correct empty square        
                                    ?empty1:empty2; 
                            return;
                        
                        }
                    }
                
                }

    }
}
