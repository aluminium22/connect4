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
    //int players; // number or players
    //int board; // color of board
    //int rows; // number of rows (6)
    //int columns; //number of columns (8)
    //int depth; // which is 4
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
        System.out.println("\nWelcom " + this.name + "\n");
        System.out.print.ln(this.instructions);
    }
}
    

