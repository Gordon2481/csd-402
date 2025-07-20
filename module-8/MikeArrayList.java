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

    /*This class is to contain:
A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
The ArrayList is then to be sent to the method.
Write additional code for testing your method.
The method will return the largest value that is displayed to the user. */



}