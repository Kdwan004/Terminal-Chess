import java.util.ArrayList;

public class gameFunction {

    public static ArrayList<String> CAPTURES_WHITE = new ArrayList<String>();
    public static ArrayList<String> CAPTURES_BLACK = new ArrayList<String>();
    static String empty1 = gameBoard.EMPTY_SQUARE[1];
    static String empty2 = gameBoard.EMPTY_SQUARE[2];


    public static void listMoves(int[][] moves, int fromRow, int fromColumn) {
        
        for(int[] move: moves) {
            int newRow = fromRow + move[0];
            int newColumn = fromColumn + move[1];
            
            System.out.print(newRow+", "+newColumn+" ");

        }
    
    }
    
    public static void move(String[][] board, int[][] moves, int fromRow, int fromColumn, int toRow, int toColumn) {
        /*
        
        Check if toBoard is possible
            1. If it is in the list of possible moves i.e. newRow/newColumn
            2. If it is empty
            3. If it doesn't conflic with the border
            4. If peice infront is opposite sign
                - If peice infront is opposite sign, then check what the peice is
                - replace selected peice with peice infront, 
                - add peice to specified captured list
                    - If captured peice sign is white, then add to CAPTURED_BLACK ~ vice versa
         */

        // Checking sign of peice infront
        // String to = board[toRow][toColumn];
        // String from = board[fromRow][fromColumn];

        // Check sign of peice to and from
        String fromSign = board[fromRow][fromColumn].substring(1,2);
        String toSign = board[toRow][toColumn].substring(1,2);
        
        for(int[] move: moves) {
            int newRow = fromRow + move[0];
            int newColumn = fromColumn + move[1];

            if((newRow == toRow && newColumn == toColumn) && (toRow!=0 && toColumn!=0)) { // Checked if possible
                if(board[toRow][toColumn] == empty1 || board[toRow][toColumn] == empty2) { // Check if square to go too is empty
                    board[toRow][toColumn] = board[fromRow][fromColumn]; // Set square going too, to square coming form
                    board[fromRow][fromColumn] =  (fromRow%2!=0||fromColumn%2!=0) && 
                            (fromRow%2==0||fromColumn%2==0) // replace square going form with correct empty square        
                            ?empty1:empty2; 
                    return;
                }
                
                else if((fromSign.equals("+")) && (toSign.equals("-"))) { // Check if the sign of the square to go too is -
                    CAPTURES_WHITE.add(board[toRow][toColumn]);
                    board[toRow][toColumn] = board[fromRow][fromColumn];
                    board[fromRow][fromColumn] =  (fromRow%2!=0||fromColumn%2!=0) && 
                            (fromRow%2==0||fromColumn%2==0) // replace square going form with correct empty square        
                            ?empty1:empty2; 
                    return;

                }

                else if((fromSign.equals("-")) && (toSign.equals("+"))) { // Check if the sign of the square to go too is -
                    CAPTURES_BLACK.add(board[toRow][toColumn]);
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
