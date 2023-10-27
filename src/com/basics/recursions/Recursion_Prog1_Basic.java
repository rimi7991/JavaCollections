package com.basics.recursions;

public class Recursion_Prog1_Basic {
    public static void func(int n)
    {
        if(n == 0)
            return;
        System.out.println("I am in function call step :" + n);
        func(n-1);
        System.out.println("I am in iteration step :" + n);
    }
    public static void main(String[] args)
    {
        func(5);
    }
}
