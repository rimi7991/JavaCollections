package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog4_BinaryEquivalent {
    // Code to get the binary equivalent of a number
    public static void fun(int n)
    {
        if(n == 0)
            return;
        fun(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value whose Binary equivalent you want to get");
        int n = in.nextInt();
        System.out.println("The Binary equivalent is : ");
        fun(n);
    }
}
