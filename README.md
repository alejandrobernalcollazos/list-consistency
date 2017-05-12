# Consistency Analizer

Given a list of phone numbers, determine if it is consistent in the sense that no number is the prefix of another. Let’s say the phone catalogue listed these numbers:

Emergency 911
Alice 97 625 999
Bob 91 12 54 26

In this case, it’s not possible to call Bob, because the central would direct your call to the emergency line as soon as you had dialled the first three digits of Bob’s phone number. So this list would not be consistent.

## The .jar file

The .jar file will be generated within /out/artifacts with the name

consistentNumbers.jar

## Running the .jar file

To run the .jar file run the next command

```java -jar consistentNumbers.jar```

## Running unit test

To run the unit test you can execute these commands

```java -cp consistentNumbers.jar org.junit.runner.JUnitCore test.java.com.abernal.util.ValidatorTest ```

or 

```java -cp consistentNumbers.jar org.junit.runner.JUnitCore test.java.com.abernal.util.ConsistencyCheckerTest ```

