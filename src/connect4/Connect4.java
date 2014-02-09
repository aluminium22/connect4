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
    String name1;
    String name2;
    String instructions = " The first player to achieve this goal wins."
            + "This is connect four. The object of the game is to get four in a row. \n You can make your connections of 4 any direction, including vertical, horizontal, and angled. \n This is how the playing board looks:";
    //Instruction board display:
    String toprow = " _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|";
    //board variables
    int taken;
    int newgame;
    int help;
    
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
        HelpMenu HM = new HelpMenu();
        HM.HelpMenu();
        NewGame NG = new NewGame();
        NG.NewGame();
            }
     
    public void getName1() {
    Scanner input = new Scanner(System.in);
    System.out.println("Player 1, enter your name: ");
    this.name1 = input.next();
    }
    public void getName2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 2, enter your name: ");
        this.name2 = input.next();
    }
    public void display() {
        System.out.println("Welcome " + this.name1 + " and " + this.name2 + "\n");
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
    System.out.println("\n" + "Let's get started");
    System.out.println("To start a new game, choose 1");
    System.out.println("To go to the help menu, choose 2");
    
    choice = (char) System.in.read();
    do {
        ignore = (char) System.in.read();
    } while(ignore != '\n');
            } while( choice == 1 | choice == 2 & choice != 'q');
            if(choice == 'q') break;
            
            switch(choice) {
                case '1':
                    System.out.println("New Game");
                    NewGame.NewGame();
                    break;
                case '2':
                    System.out.println("Help Menu");
                    HelpMenu.HelpMenu();
                    break;
            }
    }
    }
}