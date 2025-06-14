
/*  Program to simulate Rock-Paper-Scissors
Program should randomly generate the number of 1 (Rock), 2 (Paper), 3 (Scissors)
User supplies thier own selection of the same values
After comparisson is made, message should display both selections and result
*/
import java.util.*;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user selection
        System.out.print("Select Rock (1), Paper (2), or Scissors (3): ");
        int userSelection = input.nextInt();

        // input validation
        if (userSelection < 1 || userSelection > 3) {
            System.out.println("You must select a 1, 2, or 3.");
        }

        // Get computer selection
        int compSelection = (int) (Math.random() * 3) + 1;

        // Create result variable
        String result;

        // Compare results against following conditions:
        // Handle the tie
        if (userSelection == compSelection) {
            result = "tie";

        } else {
            /*
             * Switch expresssion to handle remaining possibilities.
             * If compSelection matches, the user wins, otherwise they lose
             */
            switch (userSelection) {
                // Ternary operators used to clean up the code
                case 1 -> result = (compSelection == 3) ? "win" : "lose"; // Rock
                case 2 -> result = (compSelection == 1) ? "win" : "lose"; // Paper
                case 3 -> result = (compSelection == 2) ? "win" : "lose"; // Scissors
                default -> result = "invalid selection";
            }
        }

        // Message out. %d holds the space for the variables. %n generates a new line
        // for formatting
        System.out.printf("You chose %d and the computer chose %d.%n", userSelection, compSelection);

        // Switch to generate appropiate message
        switch (result) {
            case "tie" -> System.out.println("It was a tie! Please play again.");
            case "win" -> System.out.println("Congratulations, you win!");
            case "lose" -> System.out.println("Sorry! You lost this time.");
            default -> System.out.println("That was not a valid selection.");
        }

    }
}
