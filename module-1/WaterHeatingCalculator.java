/*Mike Gordon
 * 06/03/25
 * M1: Programming Assignment */

/*This is a program that calculates the energy needed to heat water
from an initial temperature to a final temperature. User is prompted for
the amount of water in kilograms and the initial and final temperature of the water.*/

/*Forula for use is:
 * Q = waterMass (finalTemperature - initialTemperature) * 4184
 * waterMass is water weight in kilograms
 * finalTemperature and initialTemperature are temperatures in Celsius
 * Q is the results in Joules */

import java.util.*; // Allows the use of Scanner utility for user input

// Class definition is required in Java
public class WaterHeatingCalculator {

    public static void main (String[] args) {

        // use Scanner class to create an object to read input
        Scanner input = new Scanner(System.in);

    // Step 1: get values from user
        // Prompt the user to enter initial temperature
        System.out.print("What is the starting temperature in degrees Celsius?: ");
        double initialTemperature = input.nextDouble(); // Declare initialTemperature and assign value

        // Prompt the user to enter final temperature
        System.out.print("What is the final temperature in degrees Celsius?: ");
        double finalTemperature = input.nextDouble();   // Declare finalTemperature and assign value

        // Prompt the user to enter the water mass
        System.out.print("What is the water weight in Kilograms?: ");
        double waterMass = input.nextDouble();   // Declare waterMass and assign value

        // Step 2: calculate Q
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184; // Declare and calculate Q

        // Step 3: Display Q as energy needed
        System.out.println("The energy needed to heat water from an initial temperature of " + 
        initialTemperature + "\u00B0C" + " to a final temperature of " + finalTemperature + 
        "\u00B0C" + " is " + Q + " Joules.");
    }}

    /*code to get the degree symbol was found on stackoverflow - user nanofarad
     * remainder of the code was not copied from any specific source but was directly lead
     * by chapter 2 of "Introduction to Java Programming and Data Structures" by Y. Daniel Liang*/