
/*Module 6 code copied to file*/

import java.util.ArrayList;

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

    // Write a toString() method that returns a description of the Fans state.
    // public String toString() {
    // String speedString = "";
    // // conditional statements for speed
    // if (speed == SLOW) {
    // speedString = "SLOW";
    // } else if (speed == MEDIUM) {
    // speedString = "MEDIUM";
    // } else if (speed == FAST) {
    // speedString = "FAST";
    // } else {
    // speedString = "STOPPED";
    // }

    // // conditional statements for on
    // if (on) {
    // return "Fan is ON. \nSpeed: " + speedString + "\nColor: " + color +
    // "\nRadius: " + radius;
    // } else {
    // return "Fan is OFF. \nColor: " + color + "\nRadius: " + radius;
    // }
    // }
    // }

    /* M7 Code */
    public static class UseFans {

        // Display a single Fan
        public static void displayFan(Fan fan) {
            System.out.println("Fan is " + (fan.isOn() ? "on" : "off"));
            if (fan.isOn()) {
                String speedString;
                if (fan.getSpeed() == Fan.SLOW)
                    speedString = "SLOW";
                else if (fan.getSpeed() == Fan.MEDIUM)
                    speedString = "MEDIUM";
                else if (fan.getSpeed() == Fan.FAST)
                    speedString = "FAST";
                else
                    speedString = "STOPPED";
                System.out.println("Speed: " + speedString);
            }
            System.out.println("Color: " + fan.getColor());
            System.out.println("Radius: " + fan.getRadius());

        }

        // Display a collection of Fans
        public static void fanCollection(ArrayList fanList) {
            System.out.println("fanList size: " + fanList.size());
            int count = 1;
            for (int i = 0; i < fanList.size(); i++) {
                Object obj = fanList.get(i);
                if (obj instanceof Fan) {
                    Fan fan = (Fan) obj;
                    System.out.println("Fan " + count + ":");
                    displayFan(fan);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Create Fan using no argument constructor
        Fan fan1 = new Fan();

        // Create Fan using argument constructor
        Fan fan2 = new Fan(Fan.SLOW, true, 9.5, "blue");

        Fan fan3 = new Fan(Fan.FAST, true, 11, "red");

        // Show a single fan without toString()
        System.out.println("Display of a single fan: ");
        UseFans.displayFan(fan3);

        // Create a collection of fans
        ArrayList fanList = new ArrayList();
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