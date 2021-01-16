
/**
 * Write a description of class Board here.
 *
 * @author (Kai)
 * @version (1.0)
 */

import java.util.Scanner;

public class Board
{
    static void clearScreen() 
    {
        System.out.print('\u000C');
    }
    
    static String[][] buildBoard() 
    {
       String[][] board = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
       
       for (int i = 0; i < 5; i++) { 
           for (int j = 0; j < 5; j++) {  
               board[i][j] = "N/A";
           }
       }
        
       return board;
    }
    
    static void printBoard(String[][] board)  
    {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("     " + board[i][j] + "     ");
            }
            System.out.println();
        }
        
    }
        
    static String[][] customizeBoard(String[][] board) 
    {
        int number = 5;
        int iCount = 0;
        int jCount = 0;
        Scanner key = new Scanner(System.in);
        
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    iCount = i + 1;
                    jCount = j + 1;
                    
                    System.out.print("Type the value for " + iCount + ", " + jCount + ":  ");
                    board[i][j] = key.next();
                }
            }
        
        return board;
    }
    
    static String[][] changeBoardElement(String[][] board, int x, int y) 
    {
        Scanner key = new Scanner(System.in);
            
            System.out.print("Give the value for the string in position " + x + ", " + y + ":  ");
            board[x][y] = key.next();
        
        return board;
    }
    
    public static void main(String[] args) {

        boolean playAgain = true;
        boolean fillAnElement = true;
        int x, y;
        

        int number = 5;
        String[][] myBoard = {{"0","0","0","0","0"}, {"0","0","0","0","0"}, {"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
        
        int elementNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        do {
            clearScreen();

            System.out.println("Here is the board");
            
            myBoard = buildBoard();
            
            printBoard(myBoard);
            
            myBoard = customizeBoard(myBoard);
            
            printBoard(myBoard);
            
            System.out.print("Type in the x-coordinate:  ");
            x = myScanner.nextInt();
            System.out.print("Type in the y-coordinate:  ");
            y = myScanner.nextInt();
            
            changeBoardElement(myBoard, x, y);
            
            printBoard(myBoard);

            System.out.print("Do you want to do it again? Type true or false:  ");
            playAgain = myScanner.nextBoolean();
        } while (playAgain);  // Program loops while user enters true, ends when user enters false.
    }
}