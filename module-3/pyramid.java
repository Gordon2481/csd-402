// Program that uses nested for loops to output a number pyramid with @ symbols
// on the right side

public class pyramid {

    public static void main(String[] args) {
        int row;
        int column;
        int space;

        for (row = 1; row <= 7; ++row) {
            for (space = 7; space > row; --space) {
                System.out.print(" ");
            }
            for (column = 1; column <= row; column++) {
                System.out.print(column + "");
            }
            System.out.println();
        }
    }
}