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
*/
    public static void main(String[] args) {
        Connect4 myGame = new Connect4();
    myGame.getName1();
    myGame.getName2();
    myGame.display();
    myGame.play();
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
    public void play(){
        System.out.println("Press 1 to start a new game, \n" + "Press 2 for help");
            int i = 0;
            Scanner choose = new Scanner(System.in);
            if (choose.hasNextInt()) i = choose.nextInt();
            if (i == 1) newGame();
            if (i == 2) helpMenu();
            }
    public void helpMenu(){
        System.out.println("Help Menu!");
    }

    private void newGame() {
        System.out.println("New Game!");
    }
    }