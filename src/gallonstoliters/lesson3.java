/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

/**
 *
 * @author Rob
 */
public class lesson3 {
    int played = 21;
    int p1win = 9;
    int p2win = 12;
    double win = p1win/played;
    String firstplace;
    String secondplace;
    
    public static void main(String[] args){
        lesson3 myGame = new lesson3();
        myGame.place();
    }
    public void place(){
        int player1 = (p1win/played);
        int player2 = (p2win/played);
        System.out.println("Player 1 has: " + player1 + "% wins");
        System.out.println("Player 2 has: " + player2 + "% wins");
        if(player1>player2)
            firstplace = player1;
        if(player1<player2)
            firstplace = player2;
    }
}
