/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author surbhi parmar, 2020
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Collections;

public class TestGame 
{
   
  public TestGame()
        {

        }

        public static void main(String[] args)
        {
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
        }
    
}//end class
