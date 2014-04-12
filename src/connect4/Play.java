package connect4;

import java.io.IOException;
import java.util.Scanner;
   
//This will be.. a huge code so we will have to make
//lots of methods for each aspect of the game
public class Play
{
    public static char p1 = Connect4.player1.charAt(0);
    public static char p2 = Connect4.player1.charAt(0);
    public static String pn1 = String.valueOf(p1);
    public static String pn2 = String.valueOf(p2);
//        p1 = 
//        p2 = 
    
    
  //We need to first create the basic visual pattern
  public static String[][] createPattern()
  {
     String[][] f = new String[7][15];
     
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
   
  public static void p1Turn(String[][] f)
  {
    System.out.println("Player 1, drop a disk in column (0–6): ");
    Scanner col = new Scanner (System.in); 
     
    int c = 2*col.nextInt()+1;
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = pn1;
        break;
      }
       
    }
  }
   
  public static void p2Turn(String[][] f)
  {
    System.out.println("Player 2, drop a disk in column (0–6): ");
    Scanner col = new Scanner (System.in);
    
    
    int c = 2*col.nextInt()+1;
    for (int i =5;i>=0;i--)
    {
      if (f[i][c] == " ")
      {
        f[i][c] = pn2;
        break;
      }
       
    }
  }
  
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
    System.out.println(pn1 + ", and " + pn2);
    if(pn1 == null){
        pn1 = "1";
    }
    if(pn2 == null){
        pn2 = "2";
    }
    while(loop)
    {
       if (count % 2 == 0) p1Turn(f);
       else p2Turn(f);
       count++;//We need to keep track of the turns
       printPattern(f);
       if (checkWinner(f) != null)
       {
          if (checkWinner(f) == pn1)
             System.out.println("Congratulations " + Connect4.player1 + "!  You won!");
          else if (checkWinner(f)== pn2)
            System.out.println("Congratulations " + Connect4.player2 + "!  You won!");
         loop = false;
    }
  }
    connect4.NewGame.NewGame();
}
}