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
                System.out.print("  ");
            }

            // Print doubling number on each row (left side)
            // Initialize number at 1
            int num = 1;
            for (column = 1; column <= row; column++) {
                System.out.print(num + " ");
                // Double the number each iteration
                num =  num * 2;
            }

            // Print numbers (right side)
            num = num / 2; // takes the number back to the last printed number
            num = num / 2; // eliminates the middle number doubling

            for (column = 1; column < row; column++) { // Print one less number to avoid zero
                System.out.print(num + " ");
                // Divide the number each iteration
                num =  num / 2;
            }

            
            // Add trailing spaces with the @ at the end
            for (space = 7; space > row; --space) {
                System.out.print("  ");
            }

            System.out.println("@");
            System.out.println("");
            
        }
    }
}