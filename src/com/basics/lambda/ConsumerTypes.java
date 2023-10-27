package com.basics.lambda;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerTypes {
    public static void main(String[] args) {
        IntConsumer ic1 = val -> System.out.println("Value multiplied by 2 = "+(val*2));
        ic1.accept(10);

        LongConsumer lc1 = val2 -> System.out.println("Value so long = "+(val2 * 1000000));
        lc1.accept(25);

        DoubleConsumer dc1 = val3 -> System.out.println("Value in Double format = "+(val3 * 0.01));
        dc1.accept(45);
    }
}
