/*
 * Mike Gordon
 * 7/26/25
 * M9 Program 1
 */

// Import util for ArrayList
import java.util.ArrayList;
// Import util for user input
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        // Array with ten strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("this");
        stringList.add("is");
        stringList.add("a");
        stringList.add("ten");
        stringList.add("word");
        stringList.add("string");
        stringList.add("list");
        stringList.add("that");
        stringList.add("I");
        stringList.add("created");

        // loop to print the ArrayList collection
        System.out.println("This is the full list: ");
        for (String word : stringList) {
            System.out.print(word + " ");
        }

        // Ask user which element they would like to see again
        Scanner prompt = new Scanner(System.in);
        // prompt the user on the next line
        System.out.println("\n\nWhich element index would you like to see again (0-9)? ");

        // convert user input to a string
        String userInput = prompt.nextLine();

        // Autoboxing from string to integer
        Integer index = Integer.valueOf(userInput);

        // Auto-unboxing from Integer to int
        int unboxed = index;


        // try catch for handling the exception
        try {
            String wordSelected = stringList.get(unboxed);
            System.out.println("Element at index " + unboxed + ": " + wordSelected);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */