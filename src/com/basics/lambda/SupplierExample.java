package com.basics.lambda;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> s = () -> "DEBARATI";
        System.out.println("The result is = "+s.get());
    }
}
