package com.basics.streams;

import com.basics.lambda.Tourist;
import com.basics.lambda.Tourists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Printing locations in reverseOrder
public class StreamComparatorExample {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList().stream()
                .sorted(Comparator.comparing(Tourist::getLocation).reversed())
                .collect(Collectors.toList());

        list.forEach(consumer -> System.out.println(consumer.getLocation()));
    }
}
