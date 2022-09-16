// Importing Packges
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Functions{
    
    // Switch positions of the board fo X
    public static void placeBoard(char [][] board, int userPlay, String player){

        char symbol = ' ';

        // IF to set X for player and 0 to CPU
        if(player.equals("player")){
            symbol = 'X';
            userPositions.add(userPlay);
        }else if(player.equals("CPU")){
            symbol = '0';
            cpuPositions.add(userPlay);
        }

        // Switch the white place on the board for X
        switch(userPlay){
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
            default:
            System.out.println("Invalid value. Choose a place (1 -9).");
            break;
        }
    }
    // Making all positions outside the main method
    static ArrayList<Integer> userPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    // Checking the winner
    public static String winner(){
        List rowOne = Arrays.asList(1, 2, 3);
        List rowTwo = Arrays.asList(4, 5, 6);
        List rowThree = Arrays.asList(7, 8, 9);
        List colOne = Arrays.asList(1, 4, 7);
        List colTwo = Arrays.asList(2, 5, 8);
        List colThree = Arrays.asList(3, 6, 9);
        List diagonalOne= Arrays.asList(1, 5, 9);
        List diagonalTwo = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(rowOne);
        winning.add(rowTwo);
        winning.add(rowThree);
        winning.add(colOne);
        winning.add(colTwo);
        winning.add(colThree);
        winning.add(diagonalOne);
        winning.add(diagonalTwo);

        for(List l : winning){
            if(userPositions.containsAll(l)){
                return "---- YOU WON !!! ----";
            }else if(cpuPositions.containsAll(l)){
                return "---- CPU WINS !! ----";
            }else if(userPositions.size() + cpuPositions.size() == 0){
                return "---- CAT ----";
            }
        }

        return "";
    }
}
