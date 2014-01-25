/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;

/**
 *
 * @author Lorinlochridge
 */
public class Connect4 {
    String name;
    String instructions = "This is connect four. the object of the game is to get four in a row."
            + "the first player to achieve this goal wins.";
    class Player{
        int color;//color of player
        int number;// number or players
    }
    class Board{
       int boardcolor;// color of board
       int columns; //number of columns(6)
       int rows;//number of rows.(8)
       int depth;//which is 4
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
    myGame.getName();
    myGame.displayHelp();
            }
     
    public void getName() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    this.name = input.next();
    }
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
}
    

