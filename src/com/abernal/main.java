package com.abernal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by abernal on 5/10/17.
 */
public class main {
    
    public static void main(String[] args){

        int amountOfTestCases;
        Scanner scanner = new Scanner(System.in);
        List<String> output = new ArrayList<String>();
        List<String> phoneNumberList = new ArrayList<String>();
        
        
        do {
            //System.out.println("Please enter the amount of test cases (between 1 and 40) : ");
            amountOfTestCases = scanner.nextInt();

            if(isValidAmountOfTestCases(amountOfTestCases)){
                /**
                 * Cycle the amount of test cases
                 */
                for (int a = 1; a <= amountOfTestCases; a++){

                    //System.out.println("Please enter the amount of numbers for the test case " + a + " : ");
                    int amountOfNumbers = scanner.nextInt();

                    if (isValidAmountOfPhoneNumbers(amountOfNumbers)) {
                        /**
                         * Cycle the amount of phone numbers
                         */
                        for(int b = 1; b <= amountOfNumbers; b++){

                            //System.out.println("Test case : " + a + "] Enter the phone number (" + b + " of : " + amountOfNumbers + ") : ");
                            String phoneNumber = scanner.next();

                            if(isValidPhoneNumber(phoneNumber)) {
                                phoneNumberList.add(phoneNumber);
                            }else{
                                System.out.println("This phone number is not valid, please try again");
                                b--;
                            }

                        }
                        
                        //System.out.println("The numbers for test case " + a + " are");
                        /**
                         * Determine if the list is consistent
                         */
                        output.add(isConsistent(phoneNumberList));
                        phoneNumberList.clear();
                    }else {
                        System.out.println("This amount of phone numbers is not valid, please try again");
                        a--;
                    }
                }
                printOutput(output);
            }
        } while (!isValidAmountOfTestCases(amountOfTestCases));
        
    }

    /**
     * Print output in expected format
     * @param output
     */
    private static void printOutput(List<String> output) {
        for (int i = 0; i < output.size(); i++ ){
            System.out.println(output.get(i));
        }
    }

    /**
     * Check if the provided list is consistent in such way that 
     * no element is the prefix of others
     * @param phoneNumberList
     * @return
     */
    private static String isConsistent(List<String> phoneNumberList) {
        for (int a = 0; a < phoneNumberList.size(); a++ ) {
            String firtElementOfAnalisis = phoneNumberList.get(a);
            for (int b = a + 1 ; b < phoneNumberList.size(); b++) {
                String secondElementOfAnalisis = phoneNumberList.get(b);
                if(areTheseTwoNumbersConsistent(firtElementOfAnalisis,secondElementOfAnalisis)) 
                    return "NO";
            }
        }
        return "YES";
    }

    /**
     * Check consistency
     * @param firtElementOfAnalisis
     * @param secondElementOfAnalisis
     * @return
     */
    private static boolean areTheseTwoNumbersConsistent(String firtElementOfAnalisis, String secondElementOfAnalisis) {
        
        char[] firtElementArray = firtElementOfAnalisis.toCharArray();
        char[] secondElementArray = secondElementOfAnalisis.toCharArray();
        
        int sizeOfShorterElement;
        
        if (firtElementArray.length <= secondElementArray.length)
            sizeOfShorterElement = firtElementArray.length;
        else 
            sizeOfShorterElement = secondElementArray.length;
        
        for (int i = 0; i < sizeOfShorterElement; i++) {
            if (!(firtElementArray[i] == secondElementArray[i]))
                return false;
        }
        return true;
        
    }

    /**
     * Validate entry
     *  Sequence of at most ten digits
     */
    private static boolean isValidPhoneNumber(String phoneNumber) {
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
    private static boolean isValidAmountOfPhoneNumbers(int amountOfNumbers) {
        if(1 <= amountOfNumbers && amountOfNumbers <= 10000){
            return true;
        }
        return false;
    }

    /**
     * Validate entry
     *  1 <= amountOfTestCases <= 40
     */
    private static boolean isValidAmountOfTestCases(int amountOfTestCases) {
        if(1 <= amountOfTestCases && amountOfTestCases <= 40){
            return true;
        }
        return false;
    }
    
}
