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
    
}