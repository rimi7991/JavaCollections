package com.basics.lambda;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateTypes {
    public static void main(String[] args) {
        IntPredicate ip1 = val1 -> val1 > 100;
        System.out.println("Is value greater than 100 :"+ip1.test(3000));

        LongPredicate ip2 = val2 -> val2 > 100L;
        System.out.println("Is value greater than 10000000000 :"+ ip2.test(120000000000L));

        DoublePredicate ip3 = val3 -> val3 > 2.55;
        System.out.println("Is value greater than 2.55 :"+ip3.test(4.5));
    }
}
