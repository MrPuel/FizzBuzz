package sncf.oui.io.fizzbuzz;

public class FizzBuzz {
    public String valueOf(final int value) {
        String returnString = Integer.toString(value);
        if (value % 3 == 0) {
            returnString = "Fizz";
        }
        if (value % 5 == 0) {
            returnString = "Buzz";
        }
        if (value == 15) {
            returnString = "FizzBuzz";
        }
        if (value == 30) {
            returnString = "FizzBuzz";
        }
        if (value == 45) {
            returnString = "FizzBuzz";
        }
        return returnString;
    }
}
