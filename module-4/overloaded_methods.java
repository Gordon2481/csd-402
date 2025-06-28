/* 
Mike Gordon
06/28/2025
M4: Programming Assignment 
 */

 
/* Program with four overloaded methods that return
the average of an array*/

public class overloaded_methods {

    // Overloaded method for short []
    public static short average(short[] array) {
        // create a variable to hold the total
        short sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (short) (sum / array.length);
    }

    // Overloaded method for int []
    public static int average(int[] array) {
        // create a variable to hold the total
        int sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (int) (sum / array.length);
    }

    // Overloaded method for long []
    public static long average(long[] array) {
        // create a variable to hold the total
        long sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (long) (sum / array.length);
    }

    // Overloaded method for double []
    public static double average(double[] array) {
        // create a variable to hold the total
        double sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) (sum / array.length);
    }

    // Test each method and display the average and original array elements
    public static void main(String[] args) {
        // Define arrays and ensure they are different sizes
        short[] shortArray = { 10, 20, 30 };
        int[] intArray = { 5, 10, 15, 20 };
        long[] longArray = { 100L, 200L, 300L, 400L, 500L };
        double[] doubleArray = { 1.1, 1.2, 1.3, 1.4, 1.5, 1.6 };

        // Display results for Short Array
        System.out.print("Short Array Starting Values: ");
        // loop through the array and print original values
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i]);
            // add a comma and space if not the last value
            if (i < shortArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nAverage of int values: " + average(shortArray));

        // Display resultes for Int Array
        System.out.print("Int Array Starting Values: ");
        // loop through the array and print original values
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]);
            // add a comma and space if not the last value
            if (i < intArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nAverage of int values: " + average(intArray));


        // Display results for Long Array
        System.out.print("Long Array Starting Values: ");
        // loop through the array and print original values
        for (int i = 0; i < longArray.length; i++) {
            System.out.print(longArray[i]);
            // add a comma and space if not the last value
            if (i < longArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nAverage of long values: " + average(longArray));


        // Display results for Double Array
        System.out.print("Double Array Starting Values: ");
        // loop through the array and print original values
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print(doubleArray[i]);
            // add a comma and space if not the last value
            if (i < doubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nAverage of double values: " + average(doubleArray));

    }

}

/*
 The following source was used for longArray
 https://stackoverflow.com/questions/6834037/initialize-a-long-in-java

 How to create overloaded methods, for loops, and all remaining code was learned from
 "Introduction to Java Programming and Data Structures"
 */