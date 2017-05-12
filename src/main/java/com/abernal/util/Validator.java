package main.java.com.abernal.util;

/**
 * Created by abernal on 5/12/17.
 */
public class Validator {
    
    /**
     * Validate entry
     *  Sequence of at most ten digits
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // validate numeric digits input
        try {
            Long phoneNumberLong = Long.parseLong(phoneNumber);
        } catch (NumberFormatException exception) {
            return false;
        }
        // validate phone number length
        if (phoneNumber.toCharArray().length > 10) {
            return false;
        }

        return true;
    }

    /**
     * Validate entry
     *  1 <= amountOfNumbers <= 10000
     */
    public static boolean isValidAmountOfPhoneNumbers(int amountOfNumbers) {
        if(1 <= amountOfNumbers && amountOfNumbers <= 10000){
            return true;
        }
        return false;
    }

    /**
     * Validate entry
     *  1 <= amountOfTestCases <= 40
     */
    public static boolean isValidAmountOfTestCases(int amountOfTestCases) {
        if(1 <= amountOfTestCases && amountOfTestCases <= 40){
            return true;
        }
        return false;
    }
    
}
