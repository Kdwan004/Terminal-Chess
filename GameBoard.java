
public class GameBoard {

    public static int BOARD_SIZE = 9;
    public static String[] EMPTY_SQUARE = {"    ", "|<>|", "|><|"};

    public static String[][] initializeBoard() {
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

        // Add Elements to row and board in board 2DArray
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {

                // Create an empty corner
                if(row==0 && column==0){board[row][column] = EMPTY_SQUARE[0];}
                
                // Create Identifier row and column
                else if(row == 0){board[0][column] = " x"+column+" ";}

                else if(column == 0){board[row][0] = " y"+row+" ";}

                // Complete the rest of the board with alternating empty squares -- |<>| & |><|
                else{board[row][column] = (row%2!=0||column%2!=0)&&(row%2==0||column%2==0)?EMPTY_SQUARE[1]:EMPTY_SQUARE[2];}
                

        }
    }

    return board;
}



    public static void initializePeices(String[][] board) {
        // Set peices on board
        PieceSet.king(board);
        PieceSet.queen(board);
        PieceSet.rook(board);
        PieceSet.bishop(board);
        PieceSet.knight(board);
        PieceSet.pawns(board);
    }

    public static String[][] createBoard() {
        // Return complete board with set pieces
        String[][] board = initializeBoard();   
        initializePeices(board);
        return board;
    }

    public static void displayBoard(String[][] board) {

        // Display board to screen
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
        }
        System.out.println();
    }
    }

}
