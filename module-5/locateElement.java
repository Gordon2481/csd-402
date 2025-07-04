public class locateElement {
/* Write methods using the following headers that returns the location of the largest element in the array 
passed to the method returning a one-dimensional array that contains two location elements.
public static int [ ] locateLargest (double [ ][ ] arrayParam)
public static int [ ] locateLargest (int [ ][ ] arrayParam)*/

    
    public static int [] locateLargest(double[][] arrayParam) {
        // create an array to hold the location of the largest value
        int [] location = {0,0};

        // start by making the first element the max then loop through
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            //loop through each column
            for (int j = 0; j < arrayParam[i].length; j++){
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

    public static int [] locateLargest (int[][] arrayParam) {

    }

/* Write methods using the following headers that returns the location of the smallest element in the array 
passed to the method returning a one-dimensional array that contains two location elements.
public static int [ ] locateSmallest (double [ ][ ] arrayParam)
public static int [ ] locateSmallest (int [ ][ ] arrayParam)  */

    public static int [] locateSmallest(double[][] arrayParam) {

    }

    public static int [] locateSmallest(int[][] arrayParam) {

    }


    // test usage
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.1, 2.2, 3.3},
            {4.4, 5.5, 6.6},
            {7.7, 8.8, 9.9}
        };

        int[] doubleResult = locateLargest(doubleArray);
        System.out.println("The largest element in the double array was found at: [" 
        + doubleResult[0] + ", " + doubleResult[1] + "]");
    }



}