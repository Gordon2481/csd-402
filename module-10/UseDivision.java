/* Mike Gordon
 * 8/3/25
 * M10 Programming Assignment
 */

/*Write an application named UseDivision that creates two instances of each of these concrete classes 
(4 total instances). */


// Main class that uses Division, InternationalDivision, and DomesticDivision
public class UseDivision {

    public static void main(String[] args) {
        
        // Create two instances of InternationalDivision - name, account number, country, and language
        InternationalDivision interDiv1 = new InternationalDivision("International Tech", 501, "Mexico", "Spanish");
        InternationalDivision interDiv2 = new InternationalDivision("International Merch", 502, "Canada", "French");

    
        // Create two instances of DomesticDivision - name, account number, and state
        DomesticDivision domDiv1 = new DomesticDivision("Domestic Tech", 101, "New Mexico");
        DomesticDivision domDiv2 = new DomesticDivision("Domestic Merch", 102, "Arizona");
    
        // Display all division info
        interDiv1.display();
        interDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }

}

/*
 * Code developed based on concepts from Introduction to Java Programming and
 * Data Structures by Y. Daniel Liang
 * and instructional videos by Darrell Payne.
 */