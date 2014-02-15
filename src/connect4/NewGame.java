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
        char play, ignore;
        for(;;) {
            do{
                System.out.println("NEW GAME!!");
                System.out.println("Start, press 1");
                System.out.println("Go back, press 2");
                
                play = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                }while(ignore != '\n');
            }while(play==1 | play==2 & play!='q');
            if (play == 'q')break;
            switch(play) {
                case '1':
                    System.out.println("Start Game");
                    break;
                case '2':
                    System.out.println("go home");
                    break;
                }while(play !='q');
            }
        }
    }
