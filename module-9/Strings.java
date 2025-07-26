public class Strings {

    public static void main(String[] args) {

        String [] StringArray = new String[] {"this", "is", "a", "ten", "word", "string",
            "array", "that", "I", "am", "using"};


        for (int i = 0; i <= StringArray.length; i++) {
            try {
                System.out.println(StringArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception has been thrown, caught, and handled.");
            }
        }

        System.out.println("This line still executes because exception has been handled.");
    }
}