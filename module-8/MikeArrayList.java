/*
 * Mike Gordon
 * 7/20/2025
 * M8: Programming Assignment
 */


// import arraylist and scanner
import java.util.ArrayList;
import java.util.Scanner;

//Create a class [yourName]ArrayListTest
public class MikeArrayList {
    //The method signature is to be public static Integer max (ArrayList list).
    public static Integer max(ArrayList<Integer> list) {

        // If the ArrayList is sent in empty, the method will then return 0.
        if (list.isEmpty()) {
            return 0;
        }

        // Find the largest value in the Array
        Integer maxValue = list.get(0);
        // Loop through the array to find maxValue
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        // The method is then to return the largest value in the ArrayList.
        return maxValue;

    }

   
    public static void main(String[] args) {

        // Create scanner for user input
        Scanner userInput = new Scanner(System.in);
        
        //ArrayList to hold values
        ArrayList<Integer> numbers = new ArrayList<>();
        
        //The user input is to accept Integers that are then assigned to the ArrayList
        // until a value of 0 is entered, which is also assigned to the ArrayList.
        System.out.println ("Enter integers. Enter 0 to stop the program.: ");
        
        while (true) {
            System.out.println("Enter an integer: ");
            int input = userInput.nextInt();
            
            // Add user input to the ArrayList
            numbers.add(input);
            
            // Stop the program when 0 is entered
            if (input == 0) {
                break;
            }
        }
        
        //The ArrayList is then to be sent to the method.
        Integer biggest = max(numbers);
        
        // Show that zero is included by printing out all values
        System.out.println("All integers entered: " + numbers);

        // The method will return the largest value that is displayed to the user.
        System.out.println ("The biggest value entered is: " + biggest);

        userInput.close();
    }
    
}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */