package com.basics.recursions;

import java.util.Scanner;

public class   Recursion_Prog8_Fibonacci {
    public static int fibo(int n)
    {
        if(n == 1)
            return 1;
        if(n <= 0)
            return 0;
        else {
                return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = in.nextInt();
        System.out.println("The series is :");
        System.out.println(fibo(n));
    }
}
