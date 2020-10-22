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
        return returnString;
    }
}
