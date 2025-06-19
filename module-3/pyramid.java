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
                System.out.print(num + " ");
                // Double the number each iteration
                num =  num * 2;
            }
            System.out.println();
        }
    }
}