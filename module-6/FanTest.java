/*
 * Mike Gordon
 * M6 Programmin Assignment
 * 7/5/25
 */
/*
 *  
 
 
 
 
 
Write test code that creates two instances of the Fan class, one using the default constructor and the other 
using the argument constructor. Write code that displays the functionality of the Fan class methods.
 */

/*Write a program with a class titled Fan. This class is to contain:
Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 
respectively.*/
public class FanTest{
    public class Fan {
        //Constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        /*A private field named speed that holds one of the constant values with the default being STOPPED. 
    A private Boolean field titled on that specifies whether the fan is on or off. 
    A private field named radius that holds the radius of the fan with a default value of 6. 
    A String field that holds the color, with the default being white. */
        // Private fields
        private int speed;
        private boolean on;
        private double radius;
        private String color;

        // A no-argument constructor that sets all fields with a default value.
        public Fan() {
            this.speed = STOPPED;
            this.on = false;
            this.radius = 6.0;
            this.color = "white";
        }

        // A constructor takes arguments and sets values.

        // Setter and getter methods for all mutable fields.

        // Write a toString() method that returns a description of the Fans state.


    }
}