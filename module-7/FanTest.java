/*
  Mike Gordon
  7/12/2025
  Module 7 UseFans
 */

/*Module 6 code copied to file*/
// import java.util.ArrayList;
import java.util.*;
public class FanTest {
    public static class Fan {

        // Constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

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
        public Fan(int speed, boolean on, double radius, String color) {
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
    }


    /* M7 Code */
    public static class UseFans {

        // Display a single Fan without using the toString() method
        public static void displayFan(Fan fan) {

            // Display if fan is on or off using ternary operator
            System.out.println("Fan is " + (fan.isOn() ? "on" : "off"));

            // If the fan is on, display the speed
            if (fan.isOn()) {
                String speedString;

                // Determine what to print for fan speed
                switch (fan.getSpeed()) {
                    case Fan.SLOW:
                        speedString = "Slow";          
                        break;
                    case Fan.MEDIUM:
                        speedString = "Medium";          
                        break;
                    case Fan.FAST:
                        speedString = "Fast";          
                        break;                
                    default:
                        speedString = "Stopped";
                        break;
                }
                System.out.println("Speed: " + speedString);
            }

            // Print color and radius regardless if fan is on or off
            System.out.println("Color: " + fan.getColor());
            System.out.println("Radius: " + fan.getRadius());
                    // Add empty line
            System.out.println("");


        }

        // Display a collection of Fans
        // Generics used
        public static void fanCollection(List<Fan> fanList) {
            int count = 1; // Counter used to label each fan

            // Loop through array
            for (Fan fan : fanList) {
                System.out.println("Fan " + count + ":");
                displayFan(fan);
                count++;
                }
            }
        }
    

    public static void main(String[] args) {
        // Create Fan using no argument constructor
        Fan fan1 = new Fan();

        // Create Fan using argument constructor
        Fan fan2 = new Fan(Fan.SLOW, true, 9.5, "blue");

        // Add fan3 to test array
        Fan fan3 = new Fan(Fan.FAST, true, 11, "red");

        // Show a single fan without toString()
        System.out.println("Display of a single fan: ");
        UseFans.displayFan(fan3);

        // Create a collection of fans
        List<Fan> fanList = new ArrayList<>();
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans in the collection without toString()
        System.out.println("Displaying all fans: ");
        UseFans.fanCollection(fanList);

    }
}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */