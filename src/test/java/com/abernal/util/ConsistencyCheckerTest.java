package test.java.com.abernal.util;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import main.java.com.abernal.util.ConsistencyChecker;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by abernal on 5/12/17.
 */
public class ConsistencyCheckerTest {
    
    private List<String> consistentPhoneNumberList;
    private List<String> unConsistentPhoneNumberList;
    private List<String> output;
    
    @Before
    public void setUp() throws Exception {
        initializeConsistentPhoneNumberList();
        initializeUnConsistentPhoneNumberList();
        initializeOutputArray();
    }

    @Test
    public void testIsConsistent() throws Exception {
        assertEquals("YES", ConsistencyChecker.isConsistent(consistentPhoneNumberList));
    }
    
    @Test
    public void testIsUnConsistent() throws Exception {
        assertEquals("NO", ConsistencyChecker.isConsistent(unConsistentPhoneNumberList));
    }

    @Test
    public void testPrintOutput() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ConsistencyChecker.printOutput(output);
        assertEquals("YES\nNO", outContent.toString().trim());
    }
    
    private void initializeConsistentPhoneNumberList(){
        consistentPhoneNumberList = new ArrayList<String>();
        consistentPhoneNumberList.add("0911");
        consistentPhoneNumberList.add("911");
    }

    private void initializeUnConsistentPhoneNumberList(){
        unConsistentPhoneNumberList = new ArrayList<String>();
        unConsistentPhoneNumberList.add("12");
        unConsistentPhoneNumberList.add("123");
    }

    private void initializeOutputArray() {
        output = new ArrayList<String>();
        output.add("YES");
        output.add("NO");
    }
}
