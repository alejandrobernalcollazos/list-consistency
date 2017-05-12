package test.java.com.abernal.util;

import static org.junit.Assert.*;

import main.java.com.abernal.util.Validator;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abernal on 5/12/17.
 */
public class ValidatorTest {
    
    private String validPhoneNumber;
    private Integer validAmoutOfPhoneNumbers;
    private Integer validAmountOfTestCases;
    private String inValidPhoneNumber;
    private Integer inValidAmoutOfPhoneNumbers;
    private Integer inValidAmountOfTestCases;

    @Before
    public void setUp() throws Exception {
        initializeValidPhoneNumber();
        initializeValidAmountOfPhoneNumbers();
        initializeValidAmountOfTestCases();
        initializeInValidPhoneNumber();
        initializeInValidAmountOfPhoneNumbers();
        initializeInValidAmountOfTestCases();
    }

    @Test
    public void testIsValidPhoneNumber() throws Exception {
        assertTrue(Validator.isValidPhoneNumber(validPhoneNumber));
    }

    @Test
    public void testIsValidAmountOfPhoneNumbers() throws Exception {
        assertTrue(Validator.isValidAmountOfPhoneNumbers(validAmoutOfPhoneNumbers));
    }

    @Test
    public void testIsValidAmountOfTestCases() throws Exception {
        assertTrue(Validator.isValidAmountOfTestCases(validAmountOfTestCases));
    }

    @Test
    public void testIsInValidPhoneNumber() throws Exception {
        assertFalse(Validator.isValidPhoneNumber(inValidPhoneNumber));
    }

    @Test
    public void testIsInValidAmountOfPhoneNumbers() throws Exception {
        assertFalse(Validator.isValidAmountOfPhoneNumbers(inValidAmoutOfPhoneNumbers));
    }

    @Test
    public void testIsInValidAmountOfTestCases() throws Exception {
        assertFalse(Validator.isValidAmountOfTestCases(inValidAmountOfTestCases));
    }

    private void initializeValidPhoneNumber() {
        validPhoneNumber = "0911456789";
    }

    private void initializeValidAmountOfPhoneNumbers() {
        validAmoutOfPhoneNumbers = 10000;
    }

    private void initializeValidAmountOfTestCases() {
        validAmountOfTestCases = 40;
    }

    private void initializeInValidPhoneNumber() {
        inValidPhoneNumber = "09114567891";
    }

    private void initializeInValidAmountOfPhoneNumbers() {
        inValidAmoutOfPhoneNumbers = -1;
    }

    private void initializeInValidAmountOfTestCases() {
        inValidAmountOfTestCases = 50;
    }
}
