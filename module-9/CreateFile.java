/*
 * Mike Gordon
 * 7/26/25
 * M9 Program 2
 */

import java.io.*;
import java.util.*;


public class CreateFile {

    
    public static void main(String[] args) {
        // Declare file
        File file = new File("data.file");

        // create a new file titled data.file
        PrintWriter pw;
        Scanner sc;

        // Write 10 randomly generated numbers
        try {
            pw = new PrintWriter(new FileOutputStream(file, true)); //append if already exists
            System.out.println("Write File");

            // use a loop to add ten random numbers
            for (int i = 0; i < 10; i++) {
                int num = (int)(Math.random() * 100);
                pw.print(num + " ");
            }

            pw.close();
        }
        catch (IOException ioe) {
            System.out.println("IOException has been thrown at write.");
        }

        // open file and read file
        try {
            System.out.println("\nRead File");
            sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.print(sc.next() + " ");
            }

            sc.close();

        } catch (IOException ioe) {
            System.out.println("IOException has been thrown at read.");
        }

    }
}
/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */