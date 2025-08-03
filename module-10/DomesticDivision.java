/* Mike Gordon
 * 8/3/25
 * M10 Programming Assignment
 */

// Subclass of Division for domestic divisions
public class DomesticDivision extends Division {
    // State where division is
    private String state;

    // Constructor using name, account number, and state
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        // Superclass constructor
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Getter for state
    public String getState() {
        return state;
    }
    
    // Use display method
    @Override
    public void display() {
        System.out.println("Domestic Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println("--------------------");// Blank line to help with readability
    }
}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */