package com.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxAndMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);

        //max() example
        Optional val = numbers.stream().max(Integer::compareTo);
        if(val.isPresent())
            System.out.println("Using max() : "+val.get());

        Optional val2 = numbers.stream().reduce((x,y) -> {
            if(x>y)
                return x;
            else
                return y;
        });
        System.out.println("Using reduce() : "+val2.get());

        Optional sum = numbers.stream().reduce(Integer::sum);
        if(sum.isPresent())
            System.out.println("The sum is : "+sum.get());
        else
            System.out.println("Values not present");

        Optional val3 = numbers.stream().reduce(Integer::max);
        if(sum.isPresent())
            System.out.println("The max value is : "+val3.get());
        else
            System.out.println("Values not present");

        //min() example
        Optional val4 = numbers.stream().reduce((x,y)-> x<y?x:y);
        if(val4.isPresent())
            System.out.println("The min value is : "+val4.get());
        else
            System.out.println("Values not present");
    }
}
