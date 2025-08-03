/* Mike Gordon
 * 8/3/25
 * M10 Programming Assignment
 */

// Subclass for international divisions
public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor uses name, account number, country, and language
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        // Call to suerclass
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }
    // Getter for language
    public String getLanguage() {
        return language;
    }

    // Use display method
    @Override
    public void display() {
        System.out.println("International Division: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("--------------------");// Blank line to help with readability
    }
    
}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */