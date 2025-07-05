public class locateElement {
    /*
     *  Mike Gordon
     *  7/5/2025
     *  M5 Largest/Smallest methods
     */
    
    /*
     * Write methods using the following headers that returns the location of the
     * largest element in the array
     * passed to the method returning a one-dimensional array that contains two
     * location elements.
     * public static int [ ] locateLargest (double [ ][ ] arrayParam)
     * public static int [ ] locateLargest (int [ ][ ] arrayParam)
     */

    public static int[] locateLargest(double[][] arrayParam) {
        // create an array to hold the location of the largest value
        int[] location = { 0, 0 };

        // start by making the first element the max then loop through
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            // loop through each column
            for (int j = 0; j < arrayParam[i].length; j++) {
                // if a larger value is found it is made the new max
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    // save the row and column to location
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;

    }

    public static int[] locateLargest(int[][] arrayParam) {
        // create an array to hold the location of the largest value
        int[] location = { 0, 0 };

        // start by making the first element the max then loop through
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            // loop through each column
            for (int j = 0; j < arrayParam[i].length; j++) {
                // if a larger value is found it is made the new max
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    // save the row and column to location
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;

    }

    /*
     * Write methods using the following headers that returns the location of the
     * smallest element in the array
     * passed to the method returning a one-dimensional array that contains two
     * location elements.
     * public static int [ ] locateSmallest (double [ ][ ] arrayParam)
     * public static int [ ] locateSmallest (int [ ][ ] arrayParam) 
     */

    public static int[] locateSmallest(double[][] arrayParam) {
        
        // array to hold the location
        int[] location = {0,0};

        // initialize min variable
        double min = arrayParam[0][0];

        // iterate over each row
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // check if element is smaller than min
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // return location of the smallest element
        return location;
    }
    
    public static int[] locateSmallest(int[][] arrayParam) {
        // array to hold the location
        int[] location = {0,0};
    
        // initialize min variable
        int min = arrayParam[0][0];
    
        // iterate over each row
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                // check if element is smaller than min
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
    
        // return location of the smallest element
        return location;

    }

    // test usage
    public static void main(String[] args) {
        
        double[][] doubleArray = {
                { 1.1, 2.2, 3.3 },
                { 4.4, 5.5, 6.6 },
                { 7.7, 8.8, 9.9 }
        };

        int[] doubleResult = locateLargest(doubleArray);
        System.out.println("The largest element in the double array was found at: ["
                + doubleResult[0] + ", " + doubleResult[1] + "]");


                
        int[][] intArray = {
            { 5, 6, 4 },
            { 8, 9, 7 },
            { 3, 2, 1 }
        };
        
        int[] intResult = locateLargest(intArray);
        System.out.println("The largest element in the int array was found at: ["
        + intResult[0] + ", " + intResult[1] + "]");
        
        
        
        double[][] smallDouble = {
            { 1.1, 2.2, 3.3 },
            { 4.4, 5.5, 6.6 },
            { 7.7, 8.8, 9.9 }
        };
        
        int[] smallDoubleResult = locateSmallest(smallDouble);
        System.out.println("The smallest element in the double array was found at: ["
        + smallDoubleResult[0] + ", " + smallDoubleResult[1] + "]");


        int[][] smallInt = {
            { 5, 6, 4 },
            { 8, 9, 7 },
            { 3, 2, 1 }
        };
        
        int[] smallIntResult = locateSmallest(smallInt);
        System.out.println("The smallest element in the int array was found at: ["
        + smallIntResult[0] + ", " + smallIntResult[1] + "]");
    }

}

/* Code developed based on concepts from "Introduction to Java Programming and Data Structures"
by Y. Daniel Liang and instructional videos by Darrell Payne.*/