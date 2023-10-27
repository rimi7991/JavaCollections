package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog7_Factorial {
    public static int fact(int n)
    {
        if(n == 0)
            return 1;
        return (n * fact(n-1));
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("The factorial is");
        System.out.println(fact(n));
    }
}
