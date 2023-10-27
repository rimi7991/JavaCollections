package com.basics.lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p1 = v -> v > 10 ;
        boolean a = p1.test(20);
        System.out.println("The first result = "+a);

        Predicate<Integer> p2 = v2 -> v2 % 2 == 0;
        boolean b =p2.test(20);
        System.out.println("The second result = "+b);

        System.out.println(p1.and(p2).test(25));

        System.out.println(p1.or(p2).test(20));

        System.out.println(p1.and(p2.negate()).test(33));

    }
}
