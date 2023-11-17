package com.basics.streams;

import com.basics.lambda.Tourist;
import com.basics.lambda.Tourists;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Tourist> list = Tourists.customersList().stream()
                .filter(tourist -> tourist.isId_proof() == true)
                .collect(Collectors.toList());

        list.forEach(consumer -> System.out.println(consumer.getLocation()));

    }
}
