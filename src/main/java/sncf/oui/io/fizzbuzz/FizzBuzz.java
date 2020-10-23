package sncf.oui.io.fizzbuzz;

public class FizzBuzz {
    public String valueOf(final int value) {
        String returnString = "";
        if (value % 3 == 0) {
            returnString = "Fizz";
        }
        if (value % 5 == 0) {
            returnString += "Buzz";
        }
        return returnString.isEmpty() ? Integer.toString(value) : returnString;
    }
}
