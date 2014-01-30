/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//testing
package connect4;

import java.util.Scanner;

/**
 *
 * @author Lorinlochridge
 */
public class Connect4 {
    String name;
    String instructions = "This is connect four. the object of the game is to get four in a row."
            + "the first player to achieve this goal wins.";
    //board body:
    String toprow = " _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|";
    //board vars
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
    myGame.getName();
    myGame.displayHelp();
    myGame.displayBoard();
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
    public void displayBoard() {
        System.out.println(this.toprow);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
    }
    }
