package main.java.com.abernal.util;

import java.util.List;

/**
 * Created by abernal on 5/12/17.
 */
public class ConsistencyChecker {
    
    /**
     * Check if the provided list is consistent in such way that 
     * no element is the prefix of others
     * @return
     */
    public static String isConsistent(List<String> phoneNumberList) {
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
     * Print output with desired format
     */
    public static void printOutput(List<String> output){
        for (int i = 0 ; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
