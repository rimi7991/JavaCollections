package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog5_PrintNto1 {
    // Print Natural Numbers from N to 1
    // T.C = T(N) = T(N-1) + O(1) => theta(N)
    // S.C = theta(N)
    public static void fun(int n)
    {
        if(n == 0)
            return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit of Natural numbers");
        int n = in.nextInt();
        fun(5);
    }
}
