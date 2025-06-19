// Program that uses nested for loops to output a number pyramid with @ symbols
// on the right side

public class pyramid {

    public static void main(String[] args) {
        int row;
        int column;
        int space;

        for (row = 1; row <= 7; ++row) {
            // Add leading spaces to align pyramid
            for (space = 7; space > row; --space) {
                System.out.print(" ");
            }

            // Print doubling number on each row
            // Initialize number at 1
            int num = 1;
            for (column = 1; column <= row; column++) {
                if (num == 1 | num == 2 | num == 4 | num == 8) {
                    System.out.print(" " + num + " ");
                }
                else{
                System.out.print(num + " ");}
                // Double the number each iteration
                num =  num * 2;
            }

            // Make the new starting number the last printed number
            num = num / 4;
            for (column = 1; column <= row; column++) {
                // Handle the occurence of zero
                if (num == 0) {
                    System.out.print("");
                }
                // Print out the back half of the line
                else if (num == 1 | num == 2 | num == 4 | num == 8) {
                    System.out.print(" " + num + " ");
                }
                else{
                System.out.print(num + " ");}

                // Divide the number each iteration
                num =  num / 2;
            }

            // Add trailing spaces with the @ at the end
            for (space = 8; space > row; --space) {
                System.out.print(" ");
            }
            System.out.print(" @");

            System.out.println();
            
        }
    }
}