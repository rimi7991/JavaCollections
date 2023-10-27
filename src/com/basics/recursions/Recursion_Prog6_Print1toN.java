package com.basics.recursions;

import java.util.Scanner;

public class Recursion_Prog6_Print1toN {
    // Code to print Natural Numbers from 1 to N using Recursion technique
    //T.C = T(n) = T(N-1) + O(1) => theta(N)
    //S.C = O(N)
    public static void print1toN(int n)
    {
        //int counter = 1;
        if(n == 0)
            return;
        else{
            print1toN(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit of the series : ");
        int n = in.nextInt();
        System.out.println("The output is");
        print1toN(n);
    }
}
