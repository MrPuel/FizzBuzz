package sncf.oui.io.fizzbuzz;

import java.util.*;

public class FizzBuzz {

    HashMap<Integer,String> map;

    public FizzBuzz(){
        map = new HashMap<>();
        map.put(3,"Fizz");
        map.put(5,"Buzz");
        map.put(7,"Bazz");
    }

    public String valueOf(final int value) {
        Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
        boolean f = false;
        StringBuilder result = new StringBuilder();
        if (value < 0)
            throw new IllegalArgumentException("Negative value are not supported");
        while(it.hasNext()) {
            Map.Entry<Integer,String> pair = it.next();
            if ((value % pair.getKey()) == 0) {
                result.append(pair.getValue());
                f = true;
            }
        }
        if(f)
            return result.toString();
        return Integer.toString(value);
    }

    public void printTo(int value){
        for(int i = 1 ; i <= value ; i++){
            System.out.println(valueOf(i));
        }
    }
}