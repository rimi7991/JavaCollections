package com.basics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6);
        List<Integer> square = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);


        List<String> names = Arrays.asList("Debarati","Priya","Mike","Jenny","Rajeev");
        List<String> namesModifiedStart = names.stream().filter(x -> x.startsWith("J")).collect(Collectors.toList());
        System.out.println(namesModifiedStart);


    }
}
