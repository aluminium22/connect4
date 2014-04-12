/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
//testing
package connect4;

import help.HelpMenu;
import java.io.IOException;
import java.util.Scanner;
/**
*
* @author Lorinlochridge
*/
public class Connect4 {

    String instructions = " Welcome to Connect 4!"
            + "\n" + "Lets Play!";
    //Instruction Start display:
    String toprow = " _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|";
    //board variables

    int taken;
    int newgame;
//    int help;
    public static String player1;
    public static String player2;
    public static char p1;
    public static char p2;
    
        /**
* @param args the command line arguments
     * @throws java.io.IOException
*/

    public static void main(String[] args) throws IOException{
    Start.start();
    }
    public static void StartItAll() throws IOException{
        Connect4 myGame = new Connect4();
        Start start = new Start();
        System.out.println(Start.name1 + Start.name2);
//        char p1;
//        char p2;
//        
//       myGame.getName1();
//       myGame.getName2();
//        char p1 = player1.charAt(0);
//        char p2 = player2.charAt(0);
        //HomeMenu.PlayerNames(args);
//        name1 = menu.player1;
//      name2 = menu.player2;
        //MainMenu.main(args);
        myGame.display();
        myGame.menu();
        HelpMenu.HowTo();
        HelpMenu.YourTurn();
        NewGame NG = new NewGame();
            }

    public Connect4() {
        this.player2 = Start.name2;
        this.player1 = Start.name1;
    }
   //need to enter code here, just don't know how.
//     
//   public void getName1() {
//        Scanner name = new Scanner(System.in);
//        System.out.println("Player 1, enter your name: ");
//        this.name1 = name.next();
//        p1 = Character.toString(name1.charAt(0));
//        System.out.println(name1 + ", your token will be " + p1);
//    }
//    public void getName2() {
//        Scanner name = new Scanner(System.in);
//        System.out.println("Player 2, enter your name: ");
//        this.name2 = name.next();
//        p2 = Character.toString(name2.charAt(0));
//        System.out.println("Your token will be " + p2);
//    }
    public  void display() {
        player2 = Start.name2;
        if(player1 == null){
            player1 = "Player 1";
        }
        if(player2 == null){
            player2 = "Player 2";
        }
        p1 = player1.charAt(0);
        p2 = player1.charAt(0);
        System.out.println("-----------------------------------------------------");
        System.out.println("|Welcome to Connect4!.  Let's get started!|");
        System.out.println("|Welcome " + player1 + " and " + player2 + ", Let's get started!|");
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
        char choice;
        
        for(;;) {
                choice = (char) System.in.read();
            if (choice != 1 || choice != 2)
            do {
                System.out.println(" ----------------------------------");
                System.out.println("|  Let's get started               |");
                System.out.println(" ----------------------------------");
                System.out.println("|  To start a new game, press 1    |");
                System.out.println(" ----------------------------------");
                System.out.println("|  To go to the help menu, press 2 |");
                System.out.println(" ----------------------------------");
    
            }while(choice == 1 || choice == 2);
            //else System.out.println("Invalid choice.  Input choice 1 or 2.");
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
