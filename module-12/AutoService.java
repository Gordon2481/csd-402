/*Write a program with four methods for calculating the cost of a yearly auto service visit. 
The methods will be titled yearlyService.
yearlyService(no parameters) - Will return the standard service charge.
yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
Write a main method that will test each of these methods two times. */

public class AutoService {

    // Constants to set pricing
    static final double STANDARD_SERVICE = 250.00;
    static final double OIL_CHANGE = 45.00;
    static final double TIRE_ROTATION = 30.00;

    // Standard service only
    public static double yearlyService() {
        return STANDARD_SERVICE;
    }

    // Standard service with oil change

    // Standard service with oil change and tire rotation

    // Standard sercie with added services and coupon
    // Test each version twice
    public static void main(String[] args) {
        // Tests for no parameters
        System.out.println("Test 1 for Standard only: $" + yearlyService());
        System.out.println("Test 2 for Standard only: $" + yearlyService());
    }
}
