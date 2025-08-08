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
    public static double yearlyService(boolean oilChange) {
        if (oilChange) {
            return STANDARD_SERVICE + OIL_CHANGE; // standard with oil
        } else {
            return yearlyService(); // standard only
        }
    }

    // Standard service with oil change and tire rotation
    public static double yearlyService(boolean oilChange, boolean tireRotation) {

        // set total as standard service
        double total = STANDARD_SERVICE;

        if (oilChange) {
            total += OIL_CHANGE;
        }   
        if (tireRotation) {
            total += TIRE_ROTATION;

        }
        return total;
    }

    // Standard sercie with added services and coupon
    public static double yearlyService(boolean oilChange, boolean tireRotation, double couponAmount) {
        
        // set total as yearly service with oilchange and tire rotation as parameters
        double total = yearlyService(oilChange, tireRotation);
        
        // subtract coupon amount
        total -= couponAmount;
        if (total < 0) {
            total = 0; // handle any negative amounts
        }
        return total;

    }

    // Test each version twice
    public static void main(String[] args) {
        // Tests for no parameters
        System.out.println("Test 1 for Standard only: $" + yearlyService());
        System.out.println("Test 2 for Standard only: $" + yearlyService());

        // Test for oil change
        System.out.println("Test 1 for oil change: $" + yearlyService(true));
        System.out.println("Test 2 for oil change: $" + yearlyService(false));

        // Test for oil and tire rotation
        System.out.println("Test 1 for oil change and tire rotation: $" + yearlyService(true,true));
        System.out.println("Test 2 for oil change and tire rotation: $" + yearlyService(true, false));

        // Test for coupon use
        System.out.println("Test 1 for full service and $20 coupon: $" + yearlyService(true, true, 20));
        System.out.println("Test 2 for standard service with oil change and $20 coupon: $" + yearlyService(true, false, 20));
        
    }
}
