/*Create an abstract Division class with fields for a company's division name and account number
and an abstract display () method that will be defined in the subclasses.
 
Write an application named UseDivision that creates two instances of each of these concrete classes 
(4 total instances). */


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