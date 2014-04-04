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
public class NewGame {
    String ready;
    String directions;
    public static void NewGame() 
            throws IOException {
        start();
    }
    public static void start() 
        throws IOException{
        char play;
        for(;;) {
            do{
                System.out.println("--------------------");
                System.out.println("| NEW GAME!!       |");
                System.out.println("--------------------");
                System.out.println("| Start, press 1   |");
                System.out.println("--------------------");
                System.out.println("| Go back, press 2 |");
                System.out.println("--------------------");
                
                play = (char) System.in.read();
                /* do {
                    ignore = (char) System.in.read();
                }while(ignore != '\n'); */
            }while(play==1 || play==2);
            switch(play) {
                case '1':
                    Play game = new Play();
                    game.playgame();
                    System.out.println("Start Game");
                    break;
                case '2':
                    System.out.println("go home");
                    Connect4 home = new Connect4();
                    home.menu();
                    break;
                }
            }
        }
    public static void board() throws IOException{
        
        int a, b;
        String board[][] = new String[13][15];
        
        for(a=0; a<13; a++){
            for(b=0; b<15; b++){
                String e;
                if (b%2==0) e="|";
                else e="O";
                if (a%2==0) e="-";
                board[a][b] = e;
                System.out.print(board[a][b] + " ");
            }
            System.out.println();
        }
        start();
    }
    }
