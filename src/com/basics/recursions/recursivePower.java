package com.basics.recursions;

public class recursivePower {
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p == 0)
            return 1;
        return n * RecursivePower(n,p-1);
    }
    public static void main(String[] args)
    {
        System.out.println(RecursivePower(2,5));
    }
}
