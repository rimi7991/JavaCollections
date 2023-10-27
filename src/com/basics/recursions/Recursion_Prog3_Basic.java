package com.basics.recursions;

public class Recursion_Prog3_Basic {
    public static int fun(int n)
    {
        if(n == 1)
            return 0;
        else{
            //System.out.println(1 + fun(n/2));
            return 1 + fun(n/2);
        }
    }
    public static void main(String[] args)
    {
        int result = fun(16);
        System.out.println("Result : "+result);
    }
}
