package sncf.oui.io.core;

import sncf.oui.io.fizzbuzz.FizzBuzz;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int test =0;
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        map.put(7,"Bazz");
        map.put(9,"Bouze");
        FizzBuzz fizzBuzz = new FizzBuzz(map);

        fizzBuzz.printTo(1000);
    }
}
