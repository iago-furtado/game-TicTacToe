public class BoardGame {
    // Board game biuld with arrays
    static char[][] board = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };

    // Print the board game
    public static void printBoard(char[][] board) {
        System.out.println("Board:");
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
        // New line
        System.out.println();
        }
    }   

    // Board Game for instructions
    // Board game biuld with arrays
    static char[][] boardInstruc = {{'1', '|', '2', '|', '3'},
                                    {'-', '+', '-', '+', '-'},
                                    {'4', '|', '5', '|', '6'},
                                    {'-', '+', '-', '+', '-'},
                                    {'7', '|', '8', '|', '9'}
    };

    // Print the Board Game Instructions
    public static void printBoardInstruc(char[][] boardInstruc) {
        System.out.println(".");
        System.out.println("GAME INSTRUCTIONS");
        System.out.println("Choose a number from 1 to 9 according to the figure below:");
        for(int i = 0; i < boardInstruc.length; i++) {
            for(int j = 0; j < boardInstruc[i].length; j++) {
                System.out.print(boardInstruc[i][j]);
            }
        // New line
        System.out.println();
        }
    } 
}
