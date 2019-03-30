//Χρυσούλα Ντέρα 2118181 Σε συνεργασία με Αναστασία Πηρίγκου 2118046 (Β'Εξάμηνο)
package tictactoe;

import java.util.*;

public class TicTacToe {
    static int array1[][] = new int[3][3];

    public static void printgameboard()
   {
           System.out.println("The game board:");
           System.out.println(array1[0][0]+" | "+array1[0][1]+" | "+array1[0][2]);
           System.out.println("----------");
           System.out.println(array1[1][0]+" | "+array1[1][1]+" | "+array1[1][2]);
           System.out.println("----------");
           System.out.println(array1[2][0]+" | "+array1[2][1]+" | "+array1[2][2]);
          
   }
    
    public static void turns(int m){
       
           System.out.println("Type the coordinates of the spot (x,y):");
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           Scanner sc2 = new Scanner(System.in);
           int b = sc2.nextInt();
           
         
           while(array1[a-1][b-1]!=0)
           {
            System.out.println("Wrong input try again:");
            System.out.println("Type the coordinates of the spot (x,y):");
            Scanner sc3 = new Scanner(System.in);
            a = sc3.nextInt();
            Scanner sc4 = new Scanner(System.in);
            b = sc4.nextInt();
          }
                         
          if(m%2==0)
             {
              array1[a-1][b-1]=1;
             }
            else
             {
              array1[a-1][b-1]=2;    
             }
                     
          }
    public static int winnerwinner(){   
        int x =0;
        int y =0;
        int end1=0;
        for(y=0;y<3;y++)
        {
          if(array1[x][y]!=0&&array1[x+1][y]!=0){
            if(array1[x][y]==array1[x+1][y]&&array1[x][y]==array1[x+2][y])
            {
              end1=9;
            }
           
           }
        } 
        y=0;
        for(x=0;x<3;x++){
           if(array1[x][y]!=0&&array1[x][y+1]!=0){
             if(array1[x][y]==array1[x][y+1]&&array1[x][y]==array1[x][y+2])
             {
               end1=9;
             }
           }
        }
        
        y=0;
        for(x=0;x<3;x++)
        {
          if(array1[x][y]!=0&&array1[x][y+1]!=0)
          {
              if(array1[y][y]==array1[y+1][y+1]&&array1[y][y]==array1[y+2][y+2])
              {
                end1=9;
              }          
          }
        }
   
        y=2;
         for(x=0;x<3;x++)
        {
          if(array1[x][y]!=0&&array1[y-1][y-1]!=0)
          {
             if(array1[x][y]==array1[y-1][y-1]&&array1[x][y]==array1[y][x])
               {
                 end1=9;
               }
           }
        }
        return end1;
    }


    public static void main(String[] args) {       
        int i;
        int end=0;
        int m=0;
        int end1=0;
        
        printgameboard();
        System.out.println("Player 1 uses 1 for X");
        System.out.println("Player 2 uses 2 for O");
        
        while(end!=9&&end1!=9)
       { 
                turns(m);
                end++;
                printgameboard();
                end1= winnerwinner(); 
                if (end1==9)
                {
                  System.out.println("The winner is Player"+(m%2+1));
                }
                m++;
       }                      
        if (end==9)
        {
            System.out.println("Nobody is the winner :)");
        }
    }
}

