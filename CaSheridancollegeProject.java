/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author surbhi parmar
 */


public class CaSheridancollegeProject {

  
    public static void main(String[] args) {
        
                CardGame sl = new CardGame();

                System.out.println("Card Game \n Player Options");
                System.out.println("1. Start Game \n  \n2. Exit Game");
                System.out.print("Please provide your option : ");

                int i = 1;

                while (i != 0)
                {
                        Scanner in = new Scanner(System.in);
                        i = in.nextInt();

                        switch (i)
                        {
                                case 1:
                                        System.out.println("Provide the Number of Players( should be greater than 1 and less than 4) : ");
                                        in = new Scanner(System.in);
                                        i = in.nextInt();
                                        sl.playGame(i);

                                        sl.displayWinners();
                                        break;

                                case 2:
                                        System.exit(0);
                        }

                        System.out.println();
                        System.out.println("Card Game \n Select User Options");
                        System.out.println("1. Start Game \n2. Exit Game");
                        System.out.print("Please provide your option : ");
                }
        // TODO code application logic here
    }
    
}
        



    

