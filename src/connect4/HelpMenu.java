/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;

import java.io.IOException;

/**
 *
 * @author Rob
 */
public class HelpMenu {
    String ready;
    String directions;
    public static void HelpMenu() 
        throws java.io.IOException{
        char help, ignore;
    
        for(;;) {
            do {
        System.out.println("How can we help?");
        System.out.println("Learn how to play? press 1");
        System.out.println("What about your turn? press 2");
        System.out.println("To go home, press 3");
        
        help = (char) System.in.read();
        do {
            ignore = (char) System.in.read();
        }while(ignore != '\n');
            }while(help == 1 | help == 2 | help ==3 & help != 'q');
            if (help == 'q')break;
            switch(help) {
                case '1':
                    System.out.println("how to play");
                    HowTo();
                     break;
                case '2':
                    System.out.println("On your turn");
                    YourTurn();
                    break;
                case '3':
                    System.out.println("go home");
                    Connect4 home = new Connect4();
                    home.menu();
                    break;
            }while(help!= 'q');
        }
        System.out.println("just another test line");
        
    }
    public static void HowTo() throws IOException{
    String toprow = " _ _ _ _ _ _ _ ";
    String midrows = "|_|_|_|_|_|_|_|";
        System.out.println("You start with a blank board like this one");
        System.out.println(toprow);
        System.out.println(midrows);
        System.out.println(midrows);
        System.out.println(midrows);
        System.out.println(midrows);
        System.out.println(midrows);
        System.out.println(midrows);
        System.out.println("Player 1 starts the game choosing a" + "\n");
        System.out.println("column to drop their first token." + "\n");
        System.out.println("As the game continues, the players" + "\n");
        System.out.println("take turns placing their tokens as" + "\n");
        System.out.println("their tokens stack up in the columns.  The" + "\n");
        System.out.println("game ends when a player creates a row" + "\n");
        System.out.println("of 4 pieces inside the board.  That" + "\n");
        System.out.println("row can be any direction including" + "\n");
        System.out.println("vertical, horizontal, or at a diagonal." + "\n");
        System.out.println("A game will look like this when 'X' wins:");
        System.out.println(" _ _ _ _ _ _ _ ");
        System.out.println("|_|_|_|_|_|_|_|");
        System.out.println("|_|_|_|_|_|_|_|");
        System.out.println("|X|_|_|_|_|_|_|");
        System.out.println("|X|_|_|_|_|_|_|");
        System.out.println("|X|O|O|O|_|_|_|");
        System.out.println("|X|X|O|X|_|_|_|");
        System.out.println("On your turn, select a column to place your piece." + "\n" + 
                "Your piece will drop in the column and will stack on top of the" + "\n" + 
                "piece below it.  I yours is the first it will be on the bottom of the stack.");
        HelpMenu();
        
    }
    public static void YourTurn() throws IOException{
        System.out.println("On your turn, select a column to place your piece." + "\n" + 
                "Your piece will drop in the column and will stack on top of the" + "\n" + 
                "piece below it.  I yours is the first it will be on the bottom of the stack.");
        HelpMenu();
    }
    }
