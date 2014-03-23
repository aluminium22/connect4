package connect4;

import java.io.IOException;
import java.util.Scanner;
   
//This will be.. a huge code so we will have to make
//lots of methods for each aspect of the game
public class Play
{
    static String p1 = Connect4.p1;
    static String p2 = Connect4.p2;
    
    
  //We need to first create the basic visual pattern
  public static String[][] createPattern()
  {
     String[][] f = new String[7][15];
     
    //Time to loop over each row from up to down
    for (int i =0;i<f.length;i++)
    {
       for (int j =0;j<f[i].length;j++)
      {
        if (j% 2 == 0) f[i][j] ="|";
        else f[i][j] = " ";
         
        if (i==6) f[i][j]= "-";
      }
       
    }
    return f;
  }
   
  //create playing field
  public static void printPattern(String[][] f)
  {
    for (int i =0;i<f.length;i++)
    {
      for (int j=0;j<f[i].length;j++)
      {
        System.out.print(f[i][j]);
      }
      System.out.println();
    }
  }
   
  //player 1s turn (red)
  public static void p1Turn(String[][] f)
  {
    System.out.println("Player 1, drop a disk in column (0–6): ");
    Scanner col = new Scanner (System.in); 
     
    int c = 2*col.nextInt()+1;
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = p1;
        break;
      }
       
    }
  }
   
  //player 2s turn(yellow)
  public static void p2Turn(String[][] f)
  {
    System.out.println("Player 2, drop a disk in column (0–6): ");
    Scanner col = new Scanner (System.in);
    
    
    int c = 2*col.nextInt()+1;
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = p2;
        break;
      }
       
    }
  }
   
 //did someone win yet?
  public static String checkWinner(String[][] f)
  {
     
    for (int i =0;i<6;i++)
    {
      for (int j=0;j<7;j+=2)
      {
        if ((f[i][j+1] != " ")
        && (f[i][j+3] != " ")
        && (f[i][j+5] != " ")
        && (f[i][j+7] != " ")
        && ((f[i][j+1] == f[i][j+3])
        && (f[i][j+3] == f[i][j+5])
        && (f[i][j+5] == f[i][j+7])))
 
          return f[i][j+1]; 
      }
    }
     
    for (int i=1;i<15;i+=2)
    {
      for (int j =0;j<3;j++)
      {
            if((f[j][i] != " ")
            && (f[j+1][i] != " ")
            && (f[j+2][i] != " ")
            && (f[j+3][i] != " ")
            && ((f[j][i] == f[j+1][i])
            && (f[j+1][i] == f[j+2][i])
            && (f[j+2][i] == f[j+3][i])))
              return f[j][i]; 
      } 
    }
     
    for (int i=0;i<3;i++)
    {
       
      for (int j=1;j<9;j+=2)
      {
            if((f[i][j] != " ")
            && (f[i+1][j+2] != " ")
            && (f[i+2][j+4] != " ")
            && (f[i+3][j+6] != " ")
            && ((f[i][j] == f[i+1][j+2])
            && (f[i+1][j+2] == f[i+2][j+4])
            && (f[i+2][j+4] == f[i+3][j+6])))
              return f[i][j]; 
      } 
    }
     
    for (int i=0;i<3;i++)
    {
      for (int j=7;j<15;j+=2)
      {
            if((f[i][j] != " ")
            && (f[i+1][j-2] != " ")
            && (f[i+2][j-4] != " ")
            && (f[i+3][j-6] != " ")
            && ((f[i][j] == f[i+1][j-2])
            && (f[i+1][j-2] == f[i+2][j-4])
            && (f[i+2][j-4] == f[i+3][j-6])))
              return f[i][j]; 
      } 
    }
     
    return null;
  }
   
  
  //let's play!
  public static void playgame () throws IOException
  {
    String[][] f = createPattern();
    boolean loop = true;
    int count = 0;
    printPattern(f);
    System.out.println(p1 + ", and " + p2);
    while(loop)
    {
       if (count % 2 == 0) p1Turn(f);
       else p2Turn(f);
       count++;//We need to keep track of the turns
       printPattern(f);
       if (checkWinner(f) != null)
       {
          if (checkWinner(f) == p1)
             System.out.println("Congratulations " + Connect4.name1 + "!  You won!");
          else if (checkWinner(f)== p2)
            System.out.println("Congratulations " + Connect4.name2 + "!  You won!");
         loop = false;
    }
  }
    connect4.NewGame.NewGame();
}
}