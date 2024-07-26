import java.util.Scanner;

public class Main {

    // Function to sleep code for a certain period of time
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace(); // Print to standard error
        }
    }

    
    public static int[] getUserInput() {
        Scanner input = new Scanner(System.in);
        int[] select = new int[4];

        // User can select piece to move
        System.out.print("Select Piece (y x): ");
        String fromIn = input.nextLine();
        String fromStr[] = fromIn.split(" ");
        select[0] = Integer.parseInt(fromStr[0]);
        select[1] = Integer.parseInt(fromStr[1]);

        // User selecte position to move piece too
        System.out.print("Enter Position (y x): ");
        String toIn = input.nextLine();
        String toStr[] = toIn.split(" ");
        select[2] = Integer.parseInt(toStr[0]);
        select[3] = Integer.parseInt(toStr[1]);

        return select;

    }

    public static void main(String[] args) {

        String[][] board = GameBoard.createBoard(); 
        boolean game = true; // Check if game is running
        int count = 0; // Detmin which piece's turn it is

    
        while(game) {

            // Clear Terminal
            System.out.println("\033[H\033[2J");
            GameBoard.displayBoard(board);
            System.out.println("");

            // Append captured piece to captured arraylist
            System.out.println("White Captured: "+GameFunction.CAPTURES_WHITE); 
            System.out.println("Black Captured: "+GameFunction.CAPTURES_BLACK);
            System.out.println("");

            // Print who's turn it is
            if(count == 0) {
                System.out.println("WHITE\n");
                count++;
            }
            else {
                System.out.println("BLACK\n");
                count--;
            }

            // Conver user input into values for game functions
            int[] select = getUserInput();
            int yFrom = select[0]; int xFrom = select[1]; 
            int yTo = select[2]; int xTo = select[3];

            // execute piece move function
            PieceMove.movePiece(board, yFrom, xFrom, yTo, xTo);

            // Sleep to prevent terminal glitches
            sleep(100);


        }

       // Code Test

       //  peiceMove.movePeice(board, 7, 4, 5, 4);
       //  gameBoard.displayBoard(board);
       //  peiceMove.movePeice(board, 8, 4, 6, 4);
       //  gameBoard.displayBoard(board);
       //  peiceMove.movePeice(board, 6, 4, 6, 1);
       //  gameBoard.displayBoard(board);


    }
}
