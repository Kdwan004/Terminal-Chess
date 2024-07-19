import java.util.Scanner;

public class MAIN {

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

        System.out.print("Select Peice (y x): ");
        String fromIn = input.nextLine();
        String fromStr[] = fromIn.split(" ");
        select[0] = Integer.parseInt(fromStr[0]);
        select[1] = Integer.parseInt(fromStr[1]);

        System.out.print("Enter Position (y x): ");
        String toIn = input.nextLine();
        String toStr[] = toIn.split(" ");
        select[2] = Integer.parseInt(toStr[0]);
        select[3] = Integer.parseInt(toStr[1]);

        return select;

    }

    public static void main(String[] args) {
        // Clear terminal

        String[][] board = gameBoard.createBoard();
        boolean game = true;
        int count = 0;

    
        while(game) {
            System.out.println("\033[H\033[2J");
            gameBoard.displayBoard(board);
            System.out.println("");
            System.out.println("White Captured: "+gameFunction.CAPTURES_WHITE);
            System.out.println("Black Captured: "+gameFunction.CAPTURES_BLACK);
            System.out.println("");
            if(count == 0) {
                System.out.println("WHITE\n");
                count++;
            }
            else {
                System.out.println("BLACK\n");
                count--;
            }

            int[] select = getUserInput();
            int yFrom = select[0]; int xFrom = select[1]; 
            int yTo = select[2]; int xTo = select[3];

            peiceMove.movePeice(board, yFrom, xFrom, yTo, xTo);
            sleep(100);


        }

       //  peiceMove.movePeice(board, 7, 4, 5, 4);
       //  gameBoard.displayBoard(board);
       //  peiceMove.movePeice(board, 8, 4, 6, 4);
       //  gameBoard.displayBoard(board);
       //  peiceMove.movePeice(board, 6, 4, 6, 1);
       //  gameBoard.displayBoard(board);


    }
}
