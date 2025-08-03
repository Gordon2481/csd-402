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
    
}