package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog9_SumofNaturalNumbers {
    public static int sum(int n)
    {
        if(n <= 0)
            return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println("The result is :");
        System.out.println(sum(n));
    }
}
