package com.basics.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Function<Integer,Double> func = num -> Math.sqrt(num); //First type indicates the type of Input and the second type indicates the type of output
        System.out.println("Enter the number to find square root");
        int n = in.nextInt();
        double res = func.apply(n);
        System.out.println("The sqrt of " + n + " is = " +res );

        System.out.println("Enter the String to find the lowercase");
        String str = in.next();
        Function<String,String> func1 = str1 -> str1.toLowerCase();
        String res1 = func1.apply(str);
        System.out.println("The lowercase result : "+res1);
    }
}
