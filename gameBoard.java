
public class gameBoard {

    // Constructor Method
    public static final int BOARD_SIZE = 9;
    public static final String EMPTY_SQUARE1 = "|<>|";
    private static final String EMPTY_SQUARE2 = "|><|";
    private static final String EMPTY = "    ";

    // Board Rules / Boundries
    public static boolean boundWhite(String[][] board, int[][] moves, int fromRow, int fromColumn, int toRow, int toColumn) {
        // For every move in moves... loop through move[0] and move[1]
        for(int[] move: moves) {

            // Add displayed moves to selected king position (from)
            int newRow = move[0] + fromRow; // => 7
            int newColumn = move[1] + fromColumn; // => 4

            // If colour of peice infront is equal to colour of peice to go too
            // String sign = board[toRow][toColumn].substring(1, 2);
            // String colour2 = board[toRow][toColumn].substring(1, 2);

            
                if((newRow != 0 && newColumn != 0)&&(newRow == toRow && newColumn == toColumn)) {
                    // board[8][5] = board[7][5]
                    board[toRow][toColumn] = board[fromRow][fromColumn];
                    board[fromRow][fromColumn] = EMPTY_SQUARE1;
                    return true;
                }

                else {continue;}
        }
        return false;

    }

    // Define Board Characteristics
    public static void defineBoard(String[][] board, int row, int column) {
        
        // Create Empty Corner
        if(row == 0 && column == 0) {
            board[row][column] = EMPTY;
        }
        // Set Row and Column Coordinates
        else if(row == 0){board[row][column] = " x" + column + " ";}
        else if(column == 0){board[row][column] = " y" + row + " ";}

        // Alternate Board Pattern
        else{board[row][column] = (row %2!=0 && column%2!=0) || (row %2==0 && column%2==0) ? EMPTY_SQUARE1 : EMPTY_SQUARE2;
        }

    }

    // Generate Board Array
    public static String[][] initialiseBoard() {

        // Declare and initialize board
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
    
        // Generate Board Loop
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                defineBoard(board, row, column); 
            }
        }
        return board;
    }

    // Set board peices 
    public static String[][] setPieces(String[][] board) {

        queen.set(board);
        // pawn.set(board);
        king.set(board);
        bishop.set(board);
        knight.set(board);
        rook.set(board);

        return board;
    }
    

    // Add board peices to current board
    public static String[][] createBoard() {

        String[][]board = initialiseBoard();
        setPieces(board);
        return board;

    }

    // Display Board
    public static void displayBoard(String[][] board) {
        // Display Board
        System.out.print("\033[H\033[2J"); 
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // Declare board
        String[][] board = createBoard();

        boolean game = false;

        while (game) {
            king.move(board, 1, 5, 2, 4);
            displayBoard(board);
        }
    }
    
}