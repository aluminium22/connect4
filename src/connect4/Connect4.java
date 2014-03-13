/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
//testing
package connect4;


import java.io.IOException;
import java.util.Scanner;

/**
*
* @author Lorinlochridge
*/
public class Connect4 {
    String instructions = " Welcome to Connect 4!"
            + "\n" + "Lets Play!";
    //Instruction board display:
    String toprow = " _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|";
    //board variables
    int taken;
    int newgame;
    int help;
    String name1;
    String name2;
    public String p1;
    public String p2;
    
    
        /**
* @param args the command line arguments
     * @throws java.io.IOException
*/
    public static void main(String[] args) 
        throws IOException {
        Connect4 myGame = new Connect4();
        myGame.getName1();
        myGame.getName2();
        myGame.display();
        myGame.menu();
        HelpMenu.HowTo();
        HelpMenu.YourTurn();
        NewGame NG = new NewGame();
            }
        
     
    public void getName1() {
        Scanner name = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        this.name1 = name.next();
        p1 = Character.toString(name1.charAt(0));
        System.out.println("Your token will be " + p1);
    }
    public void getName2() {
        Scanner name = new Scanner(System.in);
        System.out.println("Player 2, enter your name: ");
        this.name2 = name.next();
        p2 = Character.toString(name2.charAt(0));
        System.out.println("Your token will be " + p2);
    }
    public void display() {
        System.out.println("-----------------------------------------------------");
        System.out.println("| Welcome " + this.name1 + " and " + this.name2 + "  |");
        System.out.println("-----------------------------------------------------");
        System.out.println(this.instructions);
        System.out.println(this.toprow);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
        System.out.println(this.midrows);
    }
    public void menu()
        throws java.io.IOException {
        char choice, ignore;
        
        for(;;) {
            do {
                System.out.println(" -----------------------------------");
                System.out.println("|  Let's get started                |");
                System.out.println(" -----------------------------------");
                System.out.println("|  To start a new game, choose 1    |");
                System.out.println(" -----------------------------------");
                System.out.println("|  To go to the help menu, choose 2 |");
                System.out.println(" -----------------------------------");
    
                choice = (char) System.in.read();
                /* do {
                    ignore = (char) System.in.read();
                    } while(ignore != '\n'); */
            }while(choice == 1 || choice == 2);
            if(choice != 1 || choice != 2) 
                System.out.println("Bad Choice.  Try again.");
            switch(choice) {
                case '1':
                    System.out.println("New Game");
                    NewGame.NewGame();
                case '2':
                    System.out.println("Help Menu");
                    HelpMenu.HelpMenu();
            }
        }  
    }
}