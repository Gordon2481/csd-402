/* Mike Gordon
 * 8/3/25
 * M10 Programming Assignment
 */

// Abstract class for company Division
public abstract class Division {

    private String divisionName;
    private int accountNumber;

    // Constructor using name and account number
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Getter for division name
    public String getDivisionName() {
        return divisionName;
    }
    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Abstract method to display division
    public abstract void display();
}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */