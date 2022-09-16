// Importing Packges
import java.util.Random;
import java.util.Scanner;

public class TicTacToeHarness{
    // Main void
    public static void main(String[] args) {

        // Creating a new player
        Player p1 = new Player();

        // Printing the Board Game with instructions
        BoardGame.printBoardInstruc(BoardGame.boardInstruc);

        // Asking the Player's name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        p1.setNamePlayer(scan.nextLine());
        System.out.println("--- NEW GAME ---");

        
        /*********************/
        /*****   GAME   ******/
        /*********************/
        while(true){
            // Scanner the USER's information
            System.out.println(p1.getNamePlayer() + ", choose a place (1 - 9):");
            int userPlay = scan.nextInt();
            // Repeating move if location has already been chosen.
            while(Functions.userPositions.contains(userPlay) || Functions.cpuPositions.contains(userPlay)){
                System.out.println("Position taken! Enter a new place:");
                userPlay = scan.nextInt();
            }
            // Method to set the user place choice
            Functions.placeBoard(BoardGame.board, userPlay, "player");

            // CPU Ramdom
            Random rand = new Random();
            int cpuPlay = rand.nextInt(9) + 1;
            // Repeating move if location has already been chosen.
            while(Functions.userPositions.contains(cpuPlay) || Functions.cpuPositions.contains(cpuPlay)){
                System.out.println("CPU choosing new position");
                cpuPlay = rand.nextInt(9) + 1;
            }

            // Method to set the cpu choice
            Functions.placeBoard(BoardGame.board, cpuPlay, "CPU");

            // Print out the update board
            BoardGame.printBoard(BoardGame.board);

            // Checking the result
            String result = Functions.winner();
            System.out.println(result);

        }  
    }    
}