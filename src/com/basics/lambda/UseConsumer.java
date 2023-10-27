package com.basics.lambda;

import java.util.Scanner;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of string");
        String str = in.nextLine();
        Consumer<String> c = s -> System.out.println("The length of the string is = "+s.length());
        c.accept(str);


        System.out.println("Enter the integer");
        int val1 = in.nextInt();
        Consumer<Integer> c1 = val -> {
            System.out.println("The result of x*x = "+(val * val));
            System.out.println(("The result of x/2 = "+(val/2)));
        };
        c1.accept(val1);
    }
}
