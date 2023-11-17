package com.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int val = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("The result is : "+val);

        int val2 = numbers.stream().reduce(1,(a,b) -> a*b);
        System.out.println("The result is : "+val2);

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);
        Optional<Integer> val3 = nums.stream().reduce((a, b) -> a+b);
        if(val3.isPresent())
            System.out.println(val3.get());
    }
}
