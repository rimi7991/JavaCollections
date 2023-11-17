package com.basics.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Sham");
        list.add("Priya");
        list.add("Hari");
        Stream<String> names = list.stream();
        names.forEach(System.out::println);
    }
}
