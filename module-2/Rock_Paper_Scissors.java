/*  Program to simulate Rock-Paper-Scissors
Program should randomly generate the number of 1 (Rock), 2 (Paper), 3 (Scissors)
User supplies thier own selection of the same values
After comparisson is made, message should display both selections and result
*/
import java.util.*;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        // Get user selection
        Scanner input = new Scanner(System.in);
        System.out.print("Select Rock (1), Paper (2), or Scissors (3): ");
        int userSelection = input.nextInt();
        
        // input validation
        if (userSelection < 1 || userSelection > 3) {
            System.out.println("You must select a 1, 2, or 3." );
        }
        
        // Get computer selection
        int compSelection = (int) (Math.random() * 5);

        // Compare results against following conditions

        // Create result variable
        String result;

        // Handle the tie
        if (userSelection == compSelection) {
            result = "tie";
            
        }else{ 
            // Switch expresssion to handle remaining possibilities
            switch (userSelection){
                case 1 -> result = (compSelection == 3) ? "win" : "lose"; // Rock
                case 2 -> result = (compSelection == 1) ? "win" : "lose"; // Paper
                case 3 -> result = (compSelection == 2) ? "win" : "lose"; // Scissors            
                default -> result = "invalid";
            }
          }
        
          // Switch to generate appropiate message
          switch (result) {
              case "tie" -> System.out.println("It was a tie! Please play again.");
              case "win" -> System.out.println("Congratulations, you win!");
              case "lose" -> System.out.println("Sorry! You lost this time.");
              default -> System.out.println("That was not a valid selection.");
          }

        // Message out
        System.out.printf("You chose %d and the computer chose %d.", userSelection, compSelection, result);



        

    }
}
