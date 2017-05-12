package main.java.com.abernal;

import static main.java.com.abernal.util.ConsistencyChecker.*;
import static main.java.com.abernal.util.Validator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Determine if a list of phone numbers is consistent in the sense that no number is the prefix of another
 * 
 * Created by abernal on 5/10/17.
 */
public class ConsistencyProgram {
    public static void main(String[] args){

        /**
         * Declaration of Variables
         */
        Scanner scanner = new Scanner(System.in);
        Integer amountOfTestCases ;
        List<String> output = new ArrayList<String>();
        List<String> phoneNumberList = new ArrayList<String>();

        /**
         * Enter amount of test cases
         */
        amountOfTestCases = scanner.nextInt();

        if(isValidAmountOfTestCases(amountOfTestCases)){

            for (int a = 1; a <= amountOfTestCases; a++){

                /**
                 * Enter amount of phone numbers for this test case
                 */
                int amountOfNumbers = scanner.nextInt();

                if (isValidAmountOfPhoneNumbers(amountOfNumbers)) {
                    
                    for(int b = 1; b <= amountOfNumbers; b++){

                        /**
                         * Enter phone number
                         */
                        String phoneNumber = scanner.next();

                        if(isValidPhoneNumber(phoneNumber)) {
                            phoneNumberList.add(phoneNumber);
                        }else{
                            System.out.println("This phone number is not valid. " +
                                    "It must be numeric and contain as much as 10 digits, please try again");
                            b--;
                        }

                    }
                    
                    /**
                     * Determine if the list is consistent
                     */
                    output.add(isConsistent(phoneNumberList));
                    phoneNumberList.clear();
                }else {
                    System.out.println("This amount of phone numbers is not valid. " +
                            "It must be between 1 and 10000. Please try again");
                    a--;
                }
            }

            /**
             * Print final output
             */
            printOutput(output);
        } else {
            System.out.println("The amount of test cases is not valid, it should be among 1 and 40 inclusive, we quit");
        }
    }
}
