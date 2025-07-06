/*
 * Mike Gordon
 * M6 Programmin Assignment
 * 7/5/25
 */

/*Write a program with a class titled Fan. This class is to contain:
Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the values of 0, 1, 2, and 3 
respectively.*/
public class FanTest{
    public static class Fan {
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
        public Fan(int spee, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        // Setter and getter methods for all mutable fields.
        // Getter methods
        public int getSpeed() {
            return speed;
        }
        public boolean isOn() {
            return on;
        }
        public double getRadius() {
            return radius;
        }
        public String getColor() {
            return color;
        }

        // Setter methods
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public void setOn(boolean on) {
            this.on = on;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public void setColor(String color) {
            this.color = color;
        }

        // Write a toString() method that returns a description of the Fans state.
        public String toString() {
            String speedString = "";
            // conditional statements for speed
            if (speed == SLOW) {
                speedString = "SLOW";
            }else if (speed == MEDIUM) {
                speedString = "MEDIUM";
            }else if (speed == FAST) {
                speedString = "FAST";
            }else {
                speedString = "STOPPED";
            }

            // conditional statements for on
            if (on) {
                return "Fan is ON. Speed: " + speedString + "\nColor: " + color +
                "\nRadius: " + radius;
            } else {
                return "Fan is OFF. \nColor: " + color + "\nRadius: " + radius;
            }
        }
    }

    /* Write test code that creates two instances of the Fan class, one using the default constructor and the
    other using the argument constructor. Write code that displays the functionality of the Fan class methods.*/
    public static void main(String[] args) {
        // Create Fan using no argument constructor

        // Create Fan using argument constructor

        // Display fan functionality
    }
}