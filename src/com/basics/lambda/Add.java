package com.basics.lambda;

import java.util.Scanner;

public class Add {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers one after another");
        int a = s.nextInt();
        int b = s.nextInt();
        Sum sum = (x,y) -> x+y;
        int result = sum.add(a,b);
        System.out.println("Sum = "+result);
    }
}
