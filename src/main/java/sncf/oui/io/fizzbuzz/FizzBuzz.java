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
        String result = "";
        if (value < 0)
            throw new IllegalArgumentException("Negative value are not supported");
        while(it.hasNext()) {
            Map.Entry<Integer,String> pair = it.next();
            if ((value % pair.getKey()) == 0) {
                result += pair.getValue();
                f = true;
            }
        }
        if(f)
            return result;
        return Integer.toString(value);
    }

    public void printToOneHundred(){
        for(int i = 1 ; i <= 100 ; i++){
            System.out.println(valueOf(i));
        }
    }

    public void printToOneThousand(){
        for(int i = 1 ; i <= 1000 ; i++){
            System.out.println(valueOf(i));
        }
    }
}