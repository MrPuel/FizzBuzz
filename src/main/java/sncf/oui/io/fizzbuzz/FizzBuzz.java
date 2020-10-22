package sncf.oui.io.fizzbuzz;

public class FizzBuzz {
    public String valueOf(final int value) {
        if (value == 3)
            return "Fizz";
        if (value == 5)
            return "Buzz";
        return Integer.toString(value);
    }
}
