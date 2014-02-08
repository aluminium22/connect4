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
    public int played = 21;
    public int p1win = 9;
    public int p2win = 12;
    public double win = p1win/played;
    String firstplace;
    String secondplace;
    
    public static void main(String[] args){
        lesson3 myGame = new lesson3();
        myGame.place();
    }
    public void place(){
        double player1 = (p1win/played);
        double player2 = (p2win/played);
        System.out.println("Player 1 has: " + player1 + "% wins");
        System.out.println("Player 2 has: " + player2 + "% wins");
        if(player1>player2)
            firstplace = "player1";
        else if(player1<player2)
            firstplace = "player2";
        else firstplace = " tied";
        System.out.println("firstplace is" + firstplace);
    }
}
