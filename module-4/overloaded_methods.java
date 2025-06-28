/* Program with four overloaded methods that return
the average of an array*/

public class overloaded_methods {

    // Overloaded method for short []
    public static short average(short[] array){
        // create a variable to hold the total
        short sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return (short)(sum/array.length);
    }
    
    // Overloaded method for int []
    public static int average(int[] array){
        // create a variable to hold the total
        int sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return (int)(sum/array.length);
    }

    // Overloaded method for long []
    public static long average(long[] array){
        // create a variable to hold the total
        long sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return (long)(sum/array.length);
    }

    // Overloaded method for double []
    public static double average(double[] array){
        // create a variable to hold the total
        double sum = 0;
        // loop through the array and add values
        for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return (double)(sum/array.length);
    }

}
