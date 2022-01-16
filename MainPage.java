package facebook;
/*
***********************************************************************************************************************************************


PROBLEM STATEMENT:

Write a program in Java to implement social media network for example: Facebook, which consists of the following operations-
1. Create Account
2. Send Friend Request
3. Show Friend Requests
4. Remove Friend
5. Search Profile

***********************************************************************************************************************************************
*/

import java.io.IOException;
import java.util.*;

// Class MainPage
public class MainPage 
{
        public static void clearScreen() 
        {
        	/*ASCII escape sequence. 
        	 * \033 in ASCII is ANSI escape code (ESC)
        	 *'H' means move to top of the screen &'2J' means "clear entire screen"
        	 */


       //     System.out.print("\033[H\033[2J");

       /*
        * When you write data out to a stream, some amount of buffering will occur, 
        * and you never know for sure exactly when the last of the data will actually be sent.
        *  You might perform many operations on a stream before closing it, 
        *  and invoking the flush() method guarantees that the last of the data you thought you had already written actually gets out to the file.      
        */
            System.out.flush();
         }

        // main Function 
        public static void main(String[] args) throws IOException, InterruptedException 
        {
            clearScreen();

            // Add already created accounts
            AddAccounts.addAccounts();

            int choice;
            
            Scanner sc = new Scanner(System.in);

            // Object of CreateAccount Class
            CreateAccount obj1 = new CreateAccount();

            // Object of Login Class
            Login obj2 = new Login();

            ////////////////////////////////////// HOME PAGE ////////////////////////////////////
            
            do {
                System.out.println("\n\n\n --------------------------------------------------------------");
                System.out.println("                    WELCOME TO FACEBOOK!!!");
                System.out.println(" --------------------------------------------------------------");

                System.out.println("\n\n Create a New Account Here!!! Press 1\n\n");
                System.out.println("\n\n                                   Already have an Account?");
                System.out.println("                                               Press 2 to Login\n\n");
                System.out.println("\n\n Press 3 to Close the App");
                System.out.println(" --------------------------------------------------------------");

                System.out.print("\n\n Enter Your Choice: ");
                choice = sc.nextInt();

                switch (choice) 
                {
                    case 1:
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        // Create Account
                        obj1.createAccount();   

                        break;

                    case 2:
                        // Login
                        obj2.login();   

                        break;

                    default:
                        // Clear Screen
                        clearScreen();  
                }

            } while (choice != 3);

            sc.close();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            System.out.println("\n\n\n\n\t\t\t\t-----------------------------");
            System.out.println("\n\t\t\t\t        THANK YOU!!!");
            System.out.println("\n\t\t\t\t-----------------------------\n\n\n");
    }

}