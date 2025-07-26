import java.io.*;
import java.util.*;


public class CreateFile {

    /*Write a program to create a new file titled data.file, 
    if the file does not exist. Then write to the new file, 
    adding 10 randomly generated numbers, or append 10 randomly 
    generated numbers to a previous file. Each integer is to be 
    separated by a space. Close the file, then reopen the file and 
    read the data from the file and display it. */
    public static void main(String[] args) {
        // Does file exist?
        if (file.exists() == true) {

            
        }
        else {
            // create a new file titled data.file
            File file = new File("data.file");
            PrintWriter pw;
            Scanner sc;

            // Write 10 randomly generated numbers
            try {
                pw = new PrintWriter(file);
                System.out.println("Write File");

                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));
                pw.println( (int)(Math.random() * 100));

                pw.close();
            }
            catch (IOException ioe) {
                System.out.println("IOException has been thrown at write.");
            }

            // read file
            try {
                System.out.println("\nRead File");
                sc = new Scanner(file);

                while (sc.hasNext()) {
                    System.out.println(sc.next());
                }
            } catch (IOException ioe) {
                System.out.println("IOException has been thrown at read.");
            }

        }

        
    }
}