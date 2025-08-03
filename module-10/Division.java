/*Create an abstract Division class with fields for a company's division name and account number
and an abstract display () method that will be defined in the subclasses.
Use a constructor in the superclass that requires values for both fields.
Create two subclasses named InternationalDivision and DomesticDivision.
The InternationalDivision class includes a field for the country in which the division is located,
a field for the language spoken, and a constructor that requires all fields when created.
The DomesticDivision class includes a field for the state in which the division is located and 
a constructor that requires all fields when created. 
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
}